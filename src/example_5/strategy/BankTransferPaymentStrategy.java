package example_5.strategy;

import example_5.model.BankTransferPayment;

public class BankTransferPaymentStrategy implements PaymentStrategy {
    private final BankTransferPayment bankTransferPayment;

    public BankTransferPaymentStrategy(BankTransferPayment bankTransferPayment) {
        this.bankTransferPayment = bankTransferPayment;
    }

    @Override
    public void process(double amount) {
        System.out.println("Bank Transfer Strategy start...");
        System.out.println("Making payment of the amount $"+ amount +" by bank transfer "+ bankTransferPayment.getBank() +" from account " + bankTransferPayment.getAccountNumber());
        System.out.println("Payment complete");
    }
}
