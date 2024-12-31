package Builder.example_1;

import Builder.example_1.builder.User;

public class RunApp {
    public static void main(String[] args) {
        User user = User.builder()
                .username("kevin123")
                .password("123")
                .isActive(false)
                .build();

        System.out.println(user);
    }
}
