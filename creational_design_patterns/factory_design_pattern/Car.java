package creational_design_patterns.factory_design_pattern;

public class Car implements Vehicle {
    public void start(){
        System.out.println("Car is Starting");
    }
    public void stop(){
        System.out.println("Car is Stopping");
    }
}

