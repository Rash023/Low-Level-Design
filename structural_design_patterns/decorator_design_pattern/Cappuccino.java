package structural_design_patterns.decorator_design_pattern;

public class Cappuccino implements Coffee{
    public String getDescription(){
        return "Cappuccino";
    }

    public double getCost(){
        return 3.00;
    }
}
