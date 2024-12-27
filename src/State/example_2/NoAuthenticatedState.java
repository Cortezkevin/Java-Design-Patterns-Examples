package State.example_2;

/*
* TODO -> Este es un estado concreto (implementación), aquí podemos definir como queremos que responda el usuario y cambiar de estado
*/
public class NoAuthenticatedState implements AuthState {
    @Override
    public void login(User user) {
        System.out.println("Logueando usuario");
        user.setAuthState(new AuthenticatedState());
    }

    @Override
    public void logout(User user) {
        System.out.println("El usuario no puede cerrar sesión porque aun no tiene una");
    }

    @Override
    public void useSystem(User user) {
        System.out.println("El usuario no puede usar el sistema porque aun no tiene una sesión");
    }

    @Override
    public void showState() {
        System.out.println("Usuario no autenticado");
    }
}
