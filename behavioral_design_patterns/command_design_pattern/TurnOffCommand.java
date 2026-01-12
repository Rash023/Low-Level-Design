package behavioral_design_patterns.command_design_pattern;

public class TurnOffCommand implements Command{
    private TV tv;

    public TurnOffCommand(TV tv){
        this.tv=tv;
    }
    public void execute(){
        tv.turnOff();
    }
}
