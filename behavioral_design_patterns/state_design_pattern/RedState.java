package behavioral_design_patterns.state_design_pattern;

public class RedState implements TrafficLightState{

    public void next(TrafficLightContext trafficLightContext){
        System.out.println("Switching from RED to GREEN.");
        trafficLightContext.setState(new GreenState());
    }
    public String getColor(){
        return "RED";
    }
}
