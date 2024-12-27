package Strategy.example_1.strategy;

import Strategy.example_1.model.CreditCardPayment;

public class CreditCardPaymentStrategy implements PaymentStrategy {
    private final CreditCardPayment creditCardPayment;

    public CreditCardPaymentStrategy(CreditCardPayment creditCardPayment) {
        this.creditCardPayment = creditCardPayment;
    }

    @Override
    public void process(double amount) {
        System.out.println("Credit Card Strategy start...");
        System.out.println("Making payment of the amount $"+ amount +" from card "+ creditCardPayment.getCardNumber() +" of the owner " + creditCardPayment.getOwnerName());
        System.out.println("Payment complete");
    }
}
