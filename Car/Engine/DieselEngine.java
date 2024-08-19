package Car.Engine;

public class DieselEngine implements  engine{
    @Override
    public void start(){
        System.out.println("Starting Diesel Engine");

    }

    @Override
    public void stop(){
        System.out.println("Stopping Diesel engine");
    }
    @Override
    public void acc() {
        System.out.println("Accelerating Diesel Engine");
    }
}
