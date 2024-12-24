package example_1.impl;

import example_1.interfaces.OrderProcessor;
import example_1.interfaces.PaymentProcessor;

public class PaypalPaymentProcessor implements PaymentProcessor {
    @Override
    public void processPayment() {
        System.out.println("Pago procesado con PayPal.");
    }
}
