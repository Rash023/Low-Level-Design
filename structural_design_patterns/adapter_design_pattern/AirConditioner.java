package structural_design_patterns.adapter_design_pattern;

public class AirConditioner {
    public void connectViaBluetooth(){
        System.out.println("Air Conditioner connected via Bluetooth...");
    }

    public void startCooling(){
        System.out.println("Air Conditioner is now cooling...");
    }

    public void stopCooling(){
        System.out.println("Air Conditioner stopped cooling...");
    }

    public void disconnectBluetooth(){
        System.out.println("Air Conditioner disconnected from Bluetooth...");
    }
}
