package Adapter.example_1;

public class RunApp {
    public static void main(String[] args) {
        PaymentMethod paymentMethod = new PayPal();
        paymentMethod.pay();

        paymentMethod = new CreditCard();
        paymentMethod.pay();;

        paymentMethod = new LegacyPaymentAdapter(new LegacyPayment());
        paymentMethod.pay();
    }
}
