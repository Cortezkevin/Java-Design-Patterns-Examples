package Bridge.example_1;

public abstract class Notification {
    protected Message message;

    public Notification(Message message) {
        this.message = message;
    }

    public abstract void send();
}
