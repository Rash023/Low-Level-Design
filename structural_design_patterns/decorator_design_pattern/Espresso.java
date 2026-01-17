package structural_design_patterns.decorator_design_pattern;

public class Espresso implements Coffee{
    public String getDescription(){
        return "Espresso";
    }

    public double getCost(){
        return 2.00;
    }


}
