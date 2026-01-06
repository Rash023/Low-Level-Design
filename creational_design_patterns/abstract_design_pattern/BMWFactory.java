package creational_design_patterns.abstract_design_pattern;

public class BMWFactory implements VehicleFactory{
    public Vehicle createVehicle(){
        return new BMW();
    }
}
