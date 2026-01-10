package behavioral_design_patterns.observer_design_pattern;

public interface YoutubeChannel {
    void addSubscriber(Subscriber subscriber);
    void removeSubscriber(Subscriber subscriber);

    void notifySubscribers(String video);
}
