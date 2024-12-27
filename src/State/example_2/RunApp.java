package State.example_2;

/*
 * TODO -> App Example using State design pattern
 */
public class RunApp {
    public static void main(String[] args) {
        User user = new User();

        user.useSystem();

        user.login();

        user.useSystem();

        user.logout();
    }
}
