package behavioral_design_patterns.state_design_pattern;

public class GreenState implements TrafficLightState{

    public void next(TrafficLightContext context){
        System.out.println("Switching from GREEN to YELLOW.");
        context.setState(new YellowState());
    }
    public String getColor(){
        return "GREEN";
    }
}
