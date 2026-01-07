package creational_design_patterns.factory_design_pattern;

public class VehicleFactory {
    public static Vehicle getVehicle(String vehicleType){
        if(vehicleType.equals("car")){
            return new Car();
        }
        else if(vehicleType.equals("Truck")){
            return new Truck();
        }
        else if(vehicleType.equals("Bike")){
            return new Bike();
        }
        else{
            throw new IllegalArgumentException("Unknown vehicle type");
        }
    }

}
