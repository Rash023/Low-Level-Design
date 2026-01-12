package behavioral_design_patterns.command_design_pattern;

public class ChangeChannelCommand implements Command{
    private TV tv;
    private int channel;
    public ChangeChannelCommand(TV tv,int channel){
        this.tv=tv;
        this.channel=channel;
    }

    public void execute(){
        tv.changeChannel(channel);
    }

}
