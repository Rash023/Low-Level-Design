package url_shortener;

public class Main {
    public static void main(String[] args) {
        URLShortenerService service =
                new URLShortenerService();

        // 1. Create a URL with a generated alias.
        String generatedUrl = service.createShortUrl(
                "https://www.google.com",
                null,
                null
        );

        System.out.println("Generated URL: " + generatedUrl);

        // 2. Create a URL with a custom alias.
        String customUrl = service.createShortUrl(
                "https://www.youtube.com",
                "youtube",
                null
        );

        System.out.println("Custom URL: " + customUrl);

        // 3. Create a URL that expires after 24 hours.
        String temporaryUrl = service.createShortUrl(
                "https://example.com",
                "temporary",
                24L
        );

        System.out.println("Temporary URL: " + temporaryUrl);

        // 4. Resolve a short code.
        String originalUrl = service.getOriginalUrl("youtube");
        System.out.println("Original URL: " + originalUrl);

        // 5. Print mapping details.
        URLMappingService mapping = service.getUrLDetails("youtube");
        mapping.printDetails();

        // 6. Delete a URL.
        boolean deleted = service.deleteUrl("youtube");
        System.out.println("Deleted: " + deleted);

        // 7. Check total mappings.
        System.out.println(
                "Total URLs: " + service.getTotalUrls()
        );
    }
}
