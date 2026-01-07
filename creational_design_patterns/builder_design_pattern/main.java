package creational_design_patterns.builder_design_pattern;

public class main {
    public static void main(String[] args) {
        Car.CarBuilder builder=new Car.CarBuilder();
        Car car1=builder.setEngine("V12").setColor("White").setSunroof(true).setNavigationSystem(true).build();
        System.out.println(car1);
    }
}
