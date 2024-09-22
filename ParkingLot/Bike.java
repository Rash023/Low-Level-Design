package ParkingLot;

import java.time.Duration;
import java.time.LocalDateTime;

public class Bike extends Vehicle{
    public Bike(){
        super(9999,5,0.5);
    }



    public double getCost(){
        return this.cost;
    }

    public double getSlotSize(){
        return this.slotSize;
    }
    public int getVehicleNumber(){
        return this.vehicleNumber;
    }
}
