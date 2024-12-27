package Proxy.example_1;

public class User {
    private String username;
    private boolean isAuth;

    public User(String username, boolean isAuth) {
        this.username = username;
        this.isAuth = isAuth;
    }

    public String getUsername() {
        return username;
    }

    public boolean isAuth() {
        return isAuth;
    }
}
