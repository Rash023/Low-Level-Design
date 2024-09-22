package ParkingLot;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ParkingManager {
    List<Vehicle> vehicles= new ArrayList<>();
    int slots;

    public ParkingManager(int slots){
        this.slots=slots;
    }

    public void addVehicle(Vehicle v){
        if(this.slots-v.slotSize>=0){
            vehicles.add(v);
            v.entryTime= LocalDateTime.now();
            this.slots-=v.slotSize;
            System.out.println("Vehicle added to the parking");
        }
        else{
            System.out.println("Slots are full cannot park the vehicle");
        }

    }

    public void removeVehicle(Vehicle v){
        if(vehicles.remove(v)){
            Duration d=Duration.between(v.entryTime,LocalDateTime.now());
            long hours=d.toHours();
            if(hours<=0){
                System.out.println("Removed vehicle number "+v.vehicleNumber+" from the parking lot, the total parking cost is:"+v.cost);
            }
            else{
                System.out.println("Removed vehicle number "+v.vehicleNumber+" from the parking lot, the total parking cost is:"+hours*v.cost);
            }

            this.slots+=v.slotSize;
        }
        else{
            System.out.println("Vehicle not found in the parking lot");
        }
    }

    public void getSlots(){
        System.out.println("Total no of slots left in the parking lot:"+this.slots);
    }

}
