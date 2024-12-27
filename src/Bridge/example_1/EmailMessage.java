package Bridge.example_1;

public class EmailMessage implements Message {
    @Override
    public void sendMessage(String text) {
        System.out.println("Enviando Email: " + text);
    }
}
