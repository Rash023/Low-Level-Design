package creational_design_patterns.abstract_design_pattern;

public class main {
    public static void main(String[] args) {
        VehicleFactory mercedesFactory= new MercedesFactory();
        Vehicle maybach=mercedesFactory.createVehicle();
        maybach.start();
        maybach.stop();

        VehicleFactory bmwFactory=new BMWFactory();
        Vehicle i8=bmwFactory.createVehicle();
        i8.start();
        i8.stop();

        VehicleFactory lamborghiniFactory=new LamborghiniFactory();
        Vehicle huracan= lamborghiniFactory.createVehicle();
        huracan.start();
        huracan.stop();


    }
}
