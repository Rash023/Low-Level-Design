package structural_design_patterns.decorator_design_pattern;

public class main {
    public static void main(String[] args) {
        Coffee espresso=new Espresso();
        espresso=new MilkDecorator(espresso);
        espresso=new SugarDecorator(espresso);
        System.out.println("Order"+espresso.getDescription());
        System.out.println("Total Cost: $" + espresso.getCost());
        Coffee anotherCoffee = new Cappuccino();
        anotherCoffee = new VanillaDecorator(anotherCoffee);
        System.out.println("nOrder: " + anotherCoffee.getDescription());
        System.out.println("Total Cost: $" + anotherCoffee.getCost());

    }
}
