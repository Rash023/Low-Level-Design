package behavioral_design_patterns.state_design_pattern;

public class TrafficLightContext {
    private TrafficLightState trafficLightState;
    public TrafficLightContext(){
        this.trafficLightState=new RedState();
    }

    public void setState(TrafficLightState trafficLightState){
        this.trafficLightState=trafficLightState;
    }

    public void next(){
        trafficLightState.next(this);
    }

    public String getColor(){
        return trafficLightState.getColor();
    }
}
