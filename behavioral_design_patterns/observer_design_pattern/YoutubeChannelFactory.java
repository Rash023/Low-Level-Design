package behavioral_design_patterns.observer_design_pattern;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannelFactory implements YoutubeChannel{
    public List<Subscriber> subscribers=new ArrayList<>();
    private List<String> videos=new ArrayList<>();
    public void addSubscriber(Subscriber subscriber){
        subscribers.add(subscriber);
    }

    public void removeSubscriber(Subscriber subscriber){
        subscribers.remove(subscriber);
    }

    public void notifySubscribers(String video){
        for (Subscriber subscriber:subscribers){
            subscriber.update(video);
        }
    }

    public void uploadVideo(String video){
        videos.add(video);
        notifySubscribers(video);
    }

}
