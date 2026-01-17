package structural_design_patterns.composite_design_pattern;

public class AirConditioner implements SmartComponent{
    public void turnOn(){
        System.out.println("Air Conditioner is turned on");
    }

    public void turnOff(){
        System.out.println("Air Conditioner is turned offf");
    }
}
