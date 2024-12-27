package Strategy.example_1;

import Strategy.example_1.context.PaymentService;
import Strategy.example_1.model.BankTransferPayment;
import Strategy.example_1.model.CreditCardPayment;
import Strategy.example_1.model.PaypalPayment;
import Strategy.example_1.strategy.BankTransferPaymentStrategy;
import Strategy.example_1.strategy.PaypalPaymentStrategy;

/*
* TODO -> App Example using Strategy design pattern
* */
public class RunApp {
    public static void main(String[] args) {
        PaypalPayment paypalPayment = new PaypalPayment("cortezkevinq@gmail.com");
        BankTransferPayment bankTransferPayment = new BankTransferPayment("BBVA","2455211216548694896");
        CreditCardPayment creditCardPayment = new CreditCardPayment("455212245645","Kevin Cortez ****");

        PaymentService paymentService = new PaymentService(new BankTransferPaymentStrategy(bankTransferPayment));
        paymentService.pay(10.0);

        paymentService.setPaymentStrategy(new PaypalPaymentStrategy(paypalPayment));

        paymentService.pay(100.0);
    }
}
