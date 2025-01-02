package Interpreter.example_1;

import java.util.Stack;

public class MinusExpression implements Expression {
    @Override
    public void interpret(Stack<Integer> exp) {
        int last = exp.pop();
        exp.push(exp.pop() - last);
    }
}
