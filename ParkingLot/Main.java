package ParkingLot;

public class Main {
    public static void main(String args[]) {
        ParkingManager parking=new ParkingManager(50);

        Vehicle car1=new Car();

        Vehicle car2=new Car();
        Vehicle bike1=new Bike();
        Vehicle bike2=new Bike();
        Vehicle bus1=new Bus();
        Vehicle bus2=new Bus();

        parking.addVehicle(car1);
        parking.addVehicle(car2);

        parking.addVehicle(bike2);
        parking.addVehicle(bus1);

        parking.getSlots();

        parking.removeVehicle(car1);

    }
}
