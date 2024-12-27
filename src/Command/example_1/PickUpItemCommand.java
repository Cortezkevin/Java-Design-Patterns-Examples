package Command.example_1;

import Command.example_1.model.DroppedItem;
import Command.example_1.model.Unit;

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
