package Command.example_1;

import Command.example_1.model.MapPlace;
import Command.example_1.model.Unit;

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
