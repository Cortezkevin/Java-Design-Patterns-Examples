package Adapter.example_1;

public class LegacyPaymentAdapter implements PaymentMethod {
    private LegacyPayment legacyPayment;

    public LegacyPaymentAdapter(LegacyPayment legacyPayment) {
        this.legacyPayment = legacyPayment;
    }

    @Override
    public void pay() {
        legacyPayment.makePayment();
    }
}
