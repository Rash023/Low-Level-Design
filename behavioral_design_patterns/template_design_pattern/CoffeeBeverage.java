package behavioral_design_patterns.template_design_pattern;

public class CoffeeBeverage extends Beverage{
    void brew(){
        System.out.println("Brewing Coffee...");
    }
    void addCondiments(){
        System.out.println("Adding sugar and milk...");
    }
}
