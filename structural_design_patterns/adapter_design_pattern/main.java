package structural_design_patterns.adapter_design_pattern;

public class main {
    public static void main(String[] args) {
        SmartDevice airConditioner=new AirConditionerAdapter(new AirConditioner());
        SmartDevice smartLight=new SmartLightAdapter(new SmartLight());
        SmartDevice coffeeMachine=new CoffeeMachineAdapter(new CoffeeMachine());

        airConditioner.turnOn();
        smartLight.turnOn();
        coffeeMachine.turnOn();
        airConditioner.turnOff();
        smartLight.turnOff();
        coffeeMachine.turnOff();
    }

}
