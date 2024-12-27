package ManyPatterns.example_1.impl;

import ManyPatterns.example_1.interfaces.PaymentProcessor;

public class CreditCardPaymentProcessor implements PaymentProcessor {
    @Override
    public void processPayment() {
        System.out.println("Pago procesado con tarjeta de crédito.");
    }
}
