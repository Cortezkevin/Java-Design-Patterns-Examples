package example_6;

import example_6.model.MapPlace;
import example_6.model.Unit;

public class MoveCommand implements Command {
    private final MapPlace mapPlace;

    public MoveCommand(MapPlace mapPlace) {
        this.mapPlace = mapPlace;
    }

    @Override
    public void execFrom(Unit self) {
        System.out.println(self.getName() + " moviéndose hacia " + mapPlace.getName() + ", en las coordenadas X: " + mapPlace.getX() + ", Y: " + mapPlace.getY());
    }
}
