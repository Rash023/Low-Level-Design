package structural_design_patterns.composite_design_pattern;

import java.util.ArrayList;
import java.util.List;

public class CompositeSmartComponent implements SmartComponent{
    private List<SmartComponent> components=new ArrayList<>();


    public void addComponent(SmartComponent smartComponent){
        components.add(smartComponent);

    }

    public void removeComponent(SmartComponent smartComponent){
        components.remove(smartComponent);
    }
    public void turnOn(){
        for(SmartComponent c:components){
            c.turnOn();
        }
    }

    public void turnOff(){
        for(SmartComponent c:components){
            c.turnOff();
        }
    }
}
