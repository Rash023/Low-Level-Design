package behavioral_design_patterns.strategy_design_pattern;

public class CreditCardPayment implements PaymentStrategy {
    public void processPayment(){
        System.out.println("Processing Credit Card Payment");
    }

}
