package example_5.model;

public class PaypalPayment {
    private String email;

    public PaypalPayment(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
