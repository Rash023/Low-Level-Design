package behavioral_design_patterns.template_design_pattern;

public class main {
    public static void main(String[] args) {
        Beverage coffee=new CoffeeBeverage();
        Beverage tea=new TeaBeverage();
        System.out.println("Preparing coffee..");
        coffee.prepareRecipe();
        System.out.println("Preparing tea...");
        tea.prepareRecipe();
    }
}

