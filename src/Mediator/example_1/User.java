package Mediator.example_1;

public class User extends Colleague {
    private String name;

    public User(Mediator mediator, String name) {
        super(mediator);
        this.name = name;
    }

    @Override
    public void send(String message) {
        System.out.println("Enviando mensaje (" + name +"): " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println("Mensaje recibido (" + name +"): " + message);
    }
}
