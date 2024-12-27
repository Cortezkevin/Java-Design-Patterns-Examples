package Command.example_1;

import Command.example_1.model.Clickable;
import Command.example_1.model.DoubleClickable;
import Command.example_1.model.RightClickable;
import Command.example_1.model.Unit;

public class UnitController {
    private final Unit self;
    private Command command;

    public UnitController(Unit self) {
        this.self = self;
    }

    public void setActionStrategy(Command command) {
        this.command = command;
    }

    public void click(Clickable target){
        target.onClick(this);
        command.execFrom(self);
    }

    public void doubleClick(DoubleClickable target){
        target.onDoubleClick(this);
        command.execFrom(self);
    }

    public void rightClick(RightClickable target){
        target.onRightClick(this);
        command.execFrom(self);
    }
}
