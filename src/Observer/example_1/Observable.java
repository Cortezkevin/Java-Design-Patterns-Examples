package Observer.example_1;

public interface Observable {
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
}
