package behavioral_design_patterns.strategy_design_pattern;

public class CryptoPayment implements PaymentStrategy {
    public void processPayment(){
        System.out.println("Processing Crypto Payment");
    }
}
