package Mediator.example_1;

/*
 * TODO -> App Example using Mediator design pattern
 */
public class RunApp {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediator();

        User user1= new User(mediator, "Kevin");
        User user2 = new User(mediator, "Jose");
        User user3 = new User(mediator, "Dulce");
        User user4 = new User(mediator, "Luis");

        mediator.add(user1);
        mediator.add(user2);
        mediator.add(user3);

        user1.send("Hola");
    }
}
