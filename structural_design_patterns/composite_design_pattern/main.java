package structural_design_patterns.composite_design_pattern;

public class main {
    public static void main(String[] args) {
        SmartComponent airConditioner=new AirConditioner();
        SmartComponent smartLight=new SmartLight();

        CompositeSmartComponent compositeSmartComponent=new CompositeSmartComponent();
        compositeSmartComponent.addComponent(airConditioner);
        compositeSmartComponent.addComponent(smartLight);

        compositeSmartComponent.turnOn();
        compositeSmartComponent.turnOff();
    }
}
