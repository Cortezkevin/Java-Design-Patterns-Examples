package Builder.example_1.builder;

public class UserBuilder {
    private String username;
    private String password;
    private Boolean isActive;

    public UserBuilder() {
        this.isActive = true;
    }

    public UserBuilder username(String username){
        this.username = username;
        return this;
    }

    public UserBuilder password(String password){
        this.password = password;
        return this;
    }

    public UserBuilder isActive(Boolean isActive) {
        this.isActive = isActive;
        return this;
    }

    public User build(){
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setActive(isActive);
        return user;
    }

}
