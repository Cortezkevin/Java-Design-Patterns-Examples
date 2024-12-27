package Command.example_1.model;

import Command.example_1.AttackCommand;
import Command.example_1.SelectEntityCommand;
import Command.example_1.UnitController;

public class Unit extends Entity implements Clickable, RightClickable{
    private String name;

    public Unit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void onRightClick(UnitController unitController) {
        unitController.setActionStrategy(new AttackCommand(this));
    }

    @Override
    public void onClick(UnitController unitController) {
        unitController.setActionStrategy(new SelectEntityCommand(this));
    }

    @Override
    public void showDetails() {
        System.out.println("Unit Name: " + name);
    }
}
