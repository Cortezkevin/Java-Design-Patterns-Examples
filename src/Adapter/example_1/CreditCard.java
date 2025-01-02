package Adapter.example_1;

public class CreditCard implements PaymentMethod {
    @Override
    public void pay() {
        System.out.println("Pagando con tarjeta de crédito");
    }
}
