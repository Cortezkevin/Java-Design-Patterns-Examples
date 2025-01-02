package Singleton.example_1;

public class CountUserMethod1 {
    public void userAdded(){
        System.out.println("Aumentando contador de usuarios");
        Counter.getInstance().increase();
    }

    public void userRemoved(){
        System.out.println("Decrementando contador de usuarios");
        Counter.getInstance().decrease();
    }
}
