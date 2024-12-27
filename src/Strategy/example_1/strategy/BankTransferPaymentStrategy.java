package Strategy.example_1.strategy;

import Strategy.example_1.model.BankTransferPayment;

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
