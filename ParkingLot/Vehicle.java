package ParkingLot;

import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class Vehicle {
    protected double cost;
    protected double slotSize;
    LocalDateTime entryTime;

    protected int vehicleNumber;

    public Vehicle(int vehicleNumber,double cost,double slotSize){
        this.cost=cost;
        this.slotSize=slotSize;
        this.vehicleNumber=vehicleNumber;
        this.entryTime=LocalDateTime.now();
    }


    public abstract double getCost();

    public abstract double getSlotSize();

    public abstract int getVehicleNumber();
}
