package Observer.example_2;

public interface Observable {
    String sensorCode();

    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
}
