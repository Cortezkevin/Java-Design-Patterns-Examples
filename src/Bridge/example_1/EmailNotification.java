package Bridge.example_1;

public class EmailNotification extends Notification {
    public EmailNotification(Message message) {
        super(message);
    }

    @Override
    public void send() {
        message.sendMessage("Notification Email");
    }
}
