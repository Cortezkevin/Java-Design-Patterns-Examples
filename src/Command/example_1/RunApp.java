package Command.example_1;

import Command.example_1.model.DroppedItem;
import Command.example_1.model.MapPlace;
import Command.example_1.model.Unit;

/*
 * TODO -> App Example using Command design pattern
 * */
public class RunApp {
    public static void main(String[] args) {
        Unit selfUnit = new Unit("Kevin");

        MapPlace mapPlace = new MapPlace("Jungla",1020,500);
        Unit unit = new Unit("Dulce");
        DroppedItem droppedItem = new DroppedItem("Espada");

        UnitController unitController = new UnitController( selfUnit );

        System.out.println("------------------------------------------------------");
        unitController.rightClick(unit);
        System.out.println("------------------------------------------------------");
        unitController.rightClick(droppedItem);
        System.out.println("------------------------------------------------------");
        unitController.click(unit);
        System.out.println("------------------------------------------------------");
        unitController.rightClick(mapPlace);
    }
}
