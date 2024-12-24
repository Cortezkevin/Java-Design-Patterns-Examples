package example_6;

import example_6.model.Clickable;
import example_6.model.DoubleClickable;
import example_6.model.RightClickable;
import example_6.model.Unit;

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
