package Strategy.example_1.model;

public class BankTransferPayment {
    private String bank;
    private String accountNumber;

    public BankTransferPayment(String bank, String accountNumber) {
        this.bank = bank;
        this.accountNumber = accountNumber;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
