package State.example_2;

public class AuthenticatedState implements AuthState {
    @Override
    public void login(User user) {
        System.out.println("El usuario ya esta autenticado");
    }

    @Override
    public void logout(User user) {
        System.out.println("El usuario cierra su sesión");
        user.setAuthState(new NoAuthenticatedState());
    }

    @Override
    public void useSystem(User user) {
        System.out.println("El usuario usa el sistema");

    }

    @Override
    public void showState() {
        System.out.println("Usuario autenticado");
    }
}
