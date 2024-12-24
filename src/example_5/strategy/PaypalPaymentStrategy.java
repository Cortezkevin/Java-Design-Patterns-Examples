package example_5.strategy;

import example_5.model.PaypalPayment;

public class PaypalPaymentStrategy implements PaymentStrategy {
    private final PaypalPayment paypalPayment;

    public PaypalPaymentStrategy(PaypalPayment paypalPayment) {
        this.paypalPayment = paypalPayment;
    }

    @Override
    public void process(double amount) {
        System.out.println("PayPal Strategy start...");
        System.out.println("Making payment of the amount $"+ amount +" from PayPal account " + paypalPayment.getEmail());
        System.out.println("Payment complete");
    }
}
