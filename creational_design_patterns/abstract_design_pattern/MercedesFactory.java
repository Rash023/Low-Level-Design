package creational_design_patterns.abstract_design_pattern;

public class MercedesFactory implements VehicleFactory{
    public Vehicle createVehicle(){
        return new Mercedes();
    }
}
