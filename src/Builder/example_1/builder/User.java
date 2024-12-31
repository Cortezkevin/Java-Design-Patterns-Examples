package Builder.example_1.builder;

public class User {
    private String username;
    private String password;
    private Boolean isActive;

    public User() {
    }

    public User(String username, String password, Boolean isActive) {
        this.username = username;
        this.password = password;
        this.isActive = isActive;
    }


    public static UserBuilder builder(){
        return new UserBuilder();
    }

    @Override
    public String toString() {
        return "User{" +
                "isActive=" + isActive +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }
}
