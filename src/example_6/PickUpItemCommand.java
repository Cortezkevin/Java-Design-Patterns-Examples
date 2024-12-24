package example_6;

import example_6.model.DroppedItem;
import example_6.model.Unit;

public class PickUpItemCommand implements Command {
    private final DroppedItem droppedItem;

    public PickUpItemCommand(DroppedItem droppedItem) {
        this.droppedItem = droppedItem;
    }

    @Override
    public void execFrom(Unit self) {
        System.out.println(self.getName() + " obtuvo el item: " + droppedItem.getName());
    }
}
