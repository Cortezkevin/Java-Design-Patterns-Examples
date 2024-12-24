package example_6.model;

import example_6.PickUpItemCommand;
import example_6.SelectEntityCommand;
import example_6.UnitController;

public class DroppedItem extends Entity implements Clickable, RightClickable {
    private String name;

    public DroppedItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void onClick(UnitController unitController) {
        unitController.setActionStrategy(new SelectEntityCommand(this));
    }

    @Override
    public void onRightClick(UnitController unitController) {
        unitController.setActionStrategy(new PickUpItemCommand(this));
    }

    @Override
    public void showDetails() {
        System.out.println("Item: " + name);
    }
}
