package creational_design_patterns.abstract_design_pattern;

public class BMW implements Vehicle{
    public void start(){
        System.out.println("BMW Engine Starting");
    }
    public  void stop(){
        System.out.println("BMW Engine Stopping");
    }
}
