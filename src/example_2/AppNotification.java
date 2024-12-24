package example_2;

public class AppNotification extends Notification {
    public AppNotification(Message message) {
        super(message);
    }

    @Override
    public void send() {
        message.sendMessage("Notification App");
    }
}
