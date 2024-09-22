package ParkingLot;

import java.time.LocalDateTime;
import  java.time.Duration;

public class Car extends Vehicle{
    public Car(){
        super(1111,10,1);
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
