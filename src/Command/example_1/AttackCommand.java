package Command.example_1;

import Command.example_1.model.Unit;

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
