package State.example_2;

public interface AuthState {

    /*
    *  TODO -> Aquí se definen los métodos que cambiaran de comportamiento al Usuario (contexto), dependiendo el estado actual
    */
    void login(User user);
    void logout(User user);
    void useSystem(User user);

    void showState();
}
