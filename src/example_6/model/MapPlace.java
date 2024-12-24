package example_6.model;

import example_6.MoveCommand;
import example_6.SelectEntityCommand;
import example_6.UnitController;

public class MapPlace extends Entity implements Clickable, RightClickable {
    private String name;
    private Integer x;
    private Integer y;

    public MapPlace(String name, Integer x, Integer y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }

    @Override
    public void onClick(UnitController unitController) {
        unitController.setActionStrategy(new SelectEntityCommand(this));
    }

    @Override
    public void onRightClick(UnitController unitController) {
        unitController.setActionStrategy(new MoveCommand(this));
    }

    @Override
    public void showDetails() {
        System.out.println("Map Place Name: " + name);
        System.out.println("Cords: \n X: " + x + "\n Y: " + y);
    }
}
