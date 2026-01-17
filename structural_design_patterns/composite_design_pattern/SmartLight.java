package structural_design_patterns.composite_design_pattern;

public class SmartLight implements SmartComponent{

    public void turnOn(){
        System.out.println("Smart Light is turned on");
    }
    public void turnOff(){
        System.out.println("Smart Light is turned off");
    }

}
