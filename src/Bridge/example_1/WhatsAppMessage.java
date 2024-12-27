package Bridge.example_1;

public class WhatsAppMessage implements Message {
    @Override
    public void sendMessage(String text) {
        System.out.println("Enviando chat: " + text);
    }
}
