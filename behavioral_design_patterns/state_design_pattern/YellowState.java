package behavioral_design_patterns.state_design_pattern;

public class YellowState implements TrafficLightState{

    public void next(TrafficLightContext context){
        System.out.println("Switching from YELLOW TO RED");
        context.setState(new RedState());
    }
    public String getColor(){
        return "YELLOW";
    }
}
