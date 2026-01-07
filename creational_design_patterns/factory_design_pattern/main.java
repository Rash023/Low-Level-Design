package creational_design_patterns.factory_design_pattern;


public class main {
    public static void main(String[] args) {
        Vehicle vehicle1= VehicleFactory.getVehicle("Truck");
        vehicle1.start();
        vehicle1.stop();
        Vehicle vehicle2= VehicleFactory.getVehicle("car");
        vehicle2.start();
        vehicle2.stop();
        Vehicle vehicle3=VehicleFactory.getVehicle("Bike");
        vehicle3.start();
        vehicle3.stop();
    }


}
