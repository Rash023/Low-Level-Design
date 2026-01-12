package behavioral_design_patterns.state_design_pattern;

public interface TrafficLightState {
    void next(TrafficLightContext context);
    String getColor();
}
