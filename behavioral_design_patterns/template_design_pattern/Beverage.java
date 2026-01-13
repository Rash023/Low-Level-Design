package behavioral_design_patterns.template_design_pattern;

public abstract class Beverage {
    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    void boilWater(){
        System.out.println("Boiling water...");
    }

    void pourInCup(){
        System.out.println("Pouring beverage in the cup...");
    }

    abstract void brew();
    abstract void addCondiments();
}
