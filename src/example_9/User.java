package example_9;

/*
* TODO -> Este es el contexto, el la clase que cambiara de comportamiento dependiendo del estado, siempre debe tener un estado inicial
*/
public class User {
    private AuthState authState = new NoAuthenticatedState();

    public AuthState getAuthState() {
        return authState;
    }

    public void setAuthState(AuthState authState) {
        this.authState = authState;
    }

    public void login(){
        this.authState.login(this);
    }

    public void logout(){
        this.authState.logout(this);
    }

    public void useSystem(){
        this.authState.useSystem(this);
    }

    public void showState(){
        this.authState.showState();
    }
}
