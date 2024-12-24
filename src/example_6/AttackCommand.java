package example_6;

import example_6.model.Unit;

public class AttackCommand implements Command {
    private final Unit unit;

    public AttackCommand(Unit unit) {
        this.unit = unit;
    }

    @Override
    public void execFrom(Unit self) {
        System.out.println(self.getName() + " atacando a " + unit.getName());
    }
}
