package example_1.adapter;

import example_1.interfaces.PaymentProcessor;

public class LegacyPaymentAdapter implements PaymentProcessor {
    private LegacyPaymentProcessor paymentProcessor;

    public LegacyPaymentAdapter(LegacyPaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    @Override
    public void processPayment() {
        this.paymentProcessor.makePayment();
    }
}
