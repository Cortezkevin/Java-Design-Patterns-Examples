package Adapter.example_1;

public class PayPal implements PaymentMethod {
    @Override
    public void pay() {
        System.out.println("Pagando con PayPal");
    }
}
