package Car.Brake;

public class Pads implements BrakeType{
    @Override
    public void brake() {
        System.out.println("Braking using brake pads");
    }
}
