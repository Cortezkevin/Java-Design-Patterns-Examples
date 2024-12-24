package example_6;

import example_6.model.Entity;
import example_6.model.Unit;

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
