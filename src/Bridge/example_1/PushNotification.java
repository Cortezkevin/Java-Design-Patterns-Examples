package Bridge.example_1;

public class PushNotification extends Notification {
    public PushNotification(Message message) {
        super(message);
    }

    @Override
    public void send() {
        message.sendMessage("Notification Push");
    }
}
