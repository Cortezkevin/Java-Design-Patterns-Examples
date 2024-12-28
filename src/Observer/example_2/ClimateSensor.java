package Observer.example_2;

import java.util.ArrayList;
import java.util.List;

public class ClimateSensor implements Observable {
    private String sensorCode;
    private Climate climate = Climate.NORMAL;
    private List<Observer> observers = new ArrayList<>();

    public ClimateSensor(String sensorCode) {
        this.sensorCode = sensorCode;
    }

    public void changeClimate(Climate climate){
        this.climate = climate;
        notifyObservers();
    }

    private void notifyObservers(){
        observers.forEach(o -> o.update(this, climate));
    }

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public String sensorCode() {
        return sensorCode;
    }
}
