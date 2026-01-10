package behavioral_design_patterns.observer_design_pattern;

public class PushNotificationService implements Subscriber{
    private String userDevice;

    public PushNotificationService(String userDevice){
        this.userDevice=userDevice;
    }

    public void update(String video){
        System.out.println("Push Notfication sent to:"+userDevice+": new video uploaded:"+video);
    }

}
