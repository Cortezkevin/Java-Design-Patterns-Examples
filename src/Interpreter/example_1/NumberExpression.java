package Interpreter.example_1;

import java.util.Stack;

public class NumberExpression implements Expression {

    private int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    @Override
    public void interpret(Stack<Integer> numberStack) {
        numberStack.push( number );
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
