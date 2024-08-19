package Car.Engine;

public class PetrolEngine implements engine{
    @Override
    public void start() {
        System.out.println("Starting  Petrol Engine");
    }

    @Override
    public void stop() {
        System.out.println("Stopping Petrol Engine");
    }

    @Override
    public void acc() {
        System.out.println("Accelerating Petrol Engine");
    }
}
