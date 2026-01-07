package car.Brake;

public class Disc implements BrakeType{
    @Override
    public void brake() {
        System.out.println("Braking using Disc Brakes");
    }
}
