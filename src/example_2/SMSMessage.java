package example_2;

public class SMSMessage implements Message {
    @Override
    public void sendMessage(String text) {
        System.out.println("Enviando SMS: " + text);
    }
}
