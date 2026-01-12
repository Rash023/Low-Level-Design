package behavioral_design_patterns.command_design_pattern;

public class TV {
    public void turnOn(){
        System.out.println("TV is ON");
    }
    public void turnOff(){
        System.out.println("TV is OFF");
    }
    public void changeVolume(int volume){
        System.out.println("TV Volume is set to:-"+volume);
    }
    public void changeChannel(int channel){
        System.out.println("TV Channel set to:-"+channel);
    }
}
