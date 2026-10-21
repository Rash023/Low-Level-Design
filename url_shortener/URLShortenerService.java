package url_shortener;
import java.net.URI;
import java.time.Instant;
import java.time.Duration;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;

public class URLShortenerService {

    private static final int ALIAS_LENGTH=6;
    private static final String CHARACTERS =
            "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    private final SecureRandom random;

    private final Map<String,URLMappingService> urlMap;

    private final String baseUrl;

    public URLShortenerService() {
        this("https://short.ly");
    }

    public URLShortenerService(String baseUrl) {
        this.baseUrl = baseUrl.replaceAll("/+$", "");
        this.urlMap = new HashMap<>();
        this.random = new SecureRandom();
    }

    private void validateUrl(String originalUrl){
        try{
            URI uri=URI.create(originalUrl);
            String scheme=uri.getScheme();

            if (scheme == null
                    || !(scheme.equalsIgnoreCase("http")
                    || scheme.equalsIgnoreCase("https"))
                    || uri.getHost() == null
                    || uri.getUserInfo() != null) {

                throw new IllegalArgumentException("Invalid HTTP/HTTPS URL");
            }
        }
        catch (IllegalArgumentException e){
            throw new IllegalArgumentException("Please provide a valid HTTP/HTTPS URL",e);
        }
    }

    public String createShortUrl(String originalUrl,String customAlias,Long expiresInHours){
        validateUrl(originalUrl);
        if(expiresInHours!=null && expiresInHours<=0){
            throw new IllegalArgumentException(
                    "Expiry must be greater than zero"
            );
        }

        String alias;

        if(customAlias!=null && !customAlias.isBlank()){
            if (!customAlias.matches("[A-Za-z]{3,50}")) {
                throw new IllegalArgumentException(
                        "Alias must be 3-50 characters: letters"
                );
            }

            if(urlMap.containsKey(customAlias)){
                throw new IllegalArgumentException(
                        "Custom alias already exists"
                );
            }
            alias=customAlias;
        }
        else{
            alias=generateCustomalias();
        }

        URLMappingService mapping = new URLMappingService(
                alias,
                originalUrl,
                expiresInHours
        );

        urlMap.put(alias,mapping);
        return baseUrl+"/"+alias;
    }
    private String generateCustomalias(){
        String alias;

        do {
            StringBuilder builder = new StringBuilder();

            for (int i = 0; i < ALIAS_LENGTH; i++) {
                int index = random.nextInt(CHARACTERS.length());
                builder.append(CHARACTERS.charAt(index));
            }

            alias = builder.toString();

        } while (urlMap.containsKey(alias));

        return alias;
    }

    public String getOriginalUrl(String shortCode){
        URLMappingService mapping = urlMap.get(shortCode);

        if (mapping == null) {
            throw new IllegalArgumentException(
                    "Short URL not found"
            );
        }

        if (mapping.isExpired()) {
            throw new IllegalArgumentException(
                    "Short URL has expired"
            );
        }

        return mapping.getOriginalUrl();
    }

    public URLMappingService getUrLDetails(String shortCode){
        URLMappingService mapping = urlMap.get(shortCode);

        if (mapping == null) {
            throw new IllegalArgumentException(
                    "Short URL not found"
            );
        }

        return mapping;
    }

    public boolean deleteUrl(String shortCode) {
        return urlMap.remove(shortCode) != null;
    }

    public int getTotalUrls() {
        return urlMap.size();
    }
}
