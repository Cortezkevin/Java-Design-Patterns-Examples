package Observer.example_1;

import java.util.ArrayList;
import java.util.List;

public class WatchTower implements Observable {
    private List<Observer> allies = new ArrayList<>();

    void intruderDetected(Player player){
        allies.forEach(a -> a.update(this, player));
    }

    @Override
    public void subscribe(Observer observer) {
        this.allies.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        this.allies.remove(observer);
    }
}
