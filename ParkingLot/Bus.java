package ParkingLot;

import java.time.Duration;
import java.time.LocalDateTime;

public class Bus extends Vehicle{

    public Bus(){
        super(8171,20,2);
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
