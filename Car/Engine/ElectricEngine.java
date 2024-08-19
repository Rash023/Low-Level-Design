package Car.Engine;

public class ElectricEngine implements engine {
    @Override
    public void start() {
        System.out.println("Starting Electric engine");
    }

    @Override
    public void stop() {
        System.out.println("Stopping Electric Engine");
    }

    @Override
    public void acc() {
        System.out.println("Accelerating Electric Engine");
    }
}
