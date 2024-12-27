package Command.example_1;

import Command.example_1.model.Entity;
import Command.example_1.model.Unit;

public class SelectEntityCommand implements Command {
    private final Entity entity;

    public SelectEntityCommand(Entity entity) {
        this.entity = entity;
    }

    @Override
    public void execFrom(Unit unit) {
        System.out.println("Entidad seleccionada:");
        entity.showDetails();
    }
}
