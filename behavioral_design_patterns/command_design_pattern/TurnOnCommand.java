package behavioral_design_patterns.command_design_pattern;

public class TurnOnCommand implements Command{
    private TV tv;

    public TurnOnCommand(TV tv){
        this.tv=tv;
    }
    public void execute(){
        tv.turnOn();
    }

}
