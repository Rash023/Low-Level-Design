package behavioral_design_patterns.observer_design_pattern;

public class main {
    public static void main(String[] args) {
        YoutubeChannelFactory youtubeChannel=new YoutubeChannelFactory();
        Subscriber youtubeSubscriber=new YoutubeSubscriber("Rashid");
        Subscriber youtubeSubscriber2=new YoutubeSubscriber("Alice");
        youtubeChannel.addSubscriber(youtubeSubscriber);
        youtubeChannel.addSubscriber(youtubeSubscriber2);
        youtubeChannel.uploadVideo("Hello world");
        Subscriber bellIconSubscriber=new PushNotificationService("iphone17");
        youtubeChannel.addSubscriber(bellIconSubscriber);
        youtubeChannel.uploadVideo("World is flat");
    }
}
