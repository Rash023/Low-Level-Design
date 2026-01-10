package behavioral_design_patterns.observer_design_pattern;

public class YoutubeSubscriber implements Subscriber{
    private String name;

    public YoutubeSubscriber(String name){
        this.name=name;
    }

    public void update(String video){
        System.out.println(name+" is watching the video "+video);
    }
}
