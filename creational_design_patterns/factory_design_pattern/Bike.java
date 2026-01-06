package creational_design_patterns.factory_design_pattern;

public class Bike implements Vehicle{
    public void start(){
        System.out.println("Bike is starting");
    }
    public void stop(){
        System.out.println("Bike is stopping");
    }
}
