package Command.example_1;

import Command.example_1.model.Unit;

public interface Command {
    void execFrom(Unit self);
}
