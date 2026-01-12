package behavioral_design_patterns.command_design_pattern;

public class VolumeChangeCommand implements Command{
    private TV tv;
    private int volume;

    public VolumeChangeCommand(TV tv,int volume){
        this.tv=tv;
        this.volume=volume;
    }

    public void execute(){
        tv.changeVolume(volume);
    }

}
