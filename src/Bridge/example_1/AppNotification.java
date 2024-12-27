package Bridge.example_1;

public class AppNotification extends Notification {
    public AppNotification(Message message) {
        super(message);
    }

    @Override
    public void send() {
        message.sendMessage("Notification App");
    }
}
