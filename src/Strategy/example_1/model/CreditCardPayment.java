package Strategy.example_1.model;

public class CreditCardPayment {
    private String cardNumber;
    private String ownerName;

    public CreditCardPayment(String cardNumber, String ownerName) {
        this.cardNumber = cardNumber;
        this.ownerName = ownerName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
