package behavioral_design_patterns.strategy_design_pattern;

public class main {
    public static void main(String[] args) {
        PaymentStrategy creditCard=new CreditCardPayment();
        PaymentStrategy debitCard=new DebitCardPayment();
        PaymentStrategy cryptoPayment=new CryptoPayment();
        PaymentStrategy paypalPayment=new PaypalPayment();

        PaymentProcessor paymentProcessor=new PaymentProcessor(creditCard);
        paymentProcessor.processPayment();
        paymentProcessor.setPaymentStrategy(cryptoPayment);
        paymentProcessor.processPayment();

    }
}
