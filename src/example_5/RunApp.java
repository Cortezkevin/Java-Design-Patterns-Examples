package example_5;

import example_5.context.PaymentService;
import example_5.model.BankTransferPayment;
import example_5.model.CreditCardPayment;
import example_5.model.PaypalPayment;
import example_5.strategy.BankTransferPaymentStrategy;
import example_5.strategy.PaypalPaymentStrategy;

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
