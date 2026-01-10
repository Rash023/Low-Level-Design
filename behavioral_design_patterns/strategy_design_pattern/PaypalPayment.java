package behavioral_design_patterns.strategy_design_pattern;

public class PaypalPayment implements PaymentStrategy {
    public void processPayment(){
        System.out.println("Processing Paypal payment");
    }
}
