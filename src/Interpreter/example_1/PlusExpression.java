package Interpreter.example_1;


import java.util.Stack;

public class PlusExpression implements Expression {

    public PlusExpression() {
    }

    @Override
    public void interpret(Stack<Integer> exp) {
        int last = exp.pop();
        exp.push(exp.pop() + last);
    }
}
