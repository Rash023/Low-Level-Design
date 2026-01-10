package behavioral_design_patterns.strategy_design_pattern;

public class DebitCardPayment implements PaymentStrategy {
    public void processPayment(){
        System.out.println("Processing Debit Card Payment");
    }
}
