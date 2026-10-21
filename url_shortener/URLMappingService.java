package url_shortener;
import java.time.Instant;
import java.time.Duration;

public class URLMappingService {
    private String shortCode;
    private String originalUrl;
    private Instant expiresAt;

    private Instant createdAt;

    public URLMappingService(String shortCode,String originalUrl,Long expiresInHours){
        this.shortCode=shortCode;
        this.originalUrl=originalUrl;
        this.createdAt=Instant.now();
        if (expiresInHours != null) {
            this.expiresAt = createdAt.plus(
                    Duration.ofHours(expiresInHours)
            );
        } else {
            this.expiresAt = createdAt.plus(Duration.ofHours(5));
        }
    }

    public String getShortCode() {
        return shortCode;
    }

    public String getOriginalUrl() {
        return originalUrl;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public Instant getExpiresAt() {
        return expiresAt;
    }

    public boolean isExpired(){
        return expiresAt!=null && !Instant.now().isBefore(expiresAt);
    }
    public void printDetails() {
        System.out.println("Short Code: " + shortCode);
        System.out.println("Original URL: " + originalUrl);
        System.out.println("Created At: " + createdAt);
        System.out.println("Expires At: " + expiresAt);
        System.out.println("Expired: " + isExpired());
    }

}
