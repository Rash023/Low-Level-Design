package behavioral_design_patterns.state_design_pattern;

public class main {
    public static void main(String[] args) {
        TrafficLightContext context=new TrafficLightContext();
        System.out.println(context.getColor());
        context.next();
        System.out.println(context.getColor());
        context.next();
        System.out.println(context.getColor());

    }
}
