package creational_design_patterns.abstract_design_pattern;

public class LamborghiniFactory implements VehicleFactory{
    public Vehicle createVehicle(){
        return new Lamborghini();
    }
}
