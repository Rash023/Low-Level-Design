package structural_design_patterns.adapter_design_pattern;

public class AirConditionerAdapter implements SmartDevice {
    private AirConditioner airConditioner;

    public AirConditionerAdapter(AirConditioner airConditioner){
        this.airConditioner=airConditioner;
    }
    public void turnOn(){
        airConditioner.connectViaBluetooth();
        airConditioner.startCooling();
    }

    public void turnOff(){
        airConditioner.stopCooling();
        airConditioner.disconnectBluetooth();
    }

}
