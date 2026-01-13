package behavioral_design_patterns.template_design_pattern;

public class TeaBeverage extends Beverage{
    void brew(){
        System.out.println("Steeping tea bag...");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding lemon...");
    }
}
