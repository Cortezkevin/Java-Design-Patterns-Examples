package Singleton.example_1;

public class RunApp {
    public static void main(String[] args) {
        System.out.println(Counter.getInstance().getValue());

        CountUserMethod1 countUserMethod1 = new CountUserMethod1();

        countUserMethod1.userAdded();
        countUserMethod1.userAdded();
        countUserMethod1.userAdded();
        countUserMethod1.userAdded();

        CountUserMethod2 countUserMethod2 = new CountUserMethod2();

        countUserMethod2.userRemoved();
        countUserMethod2.userAdded();

        System.out.println(Counter.getInstance().getValue());
    }
}
