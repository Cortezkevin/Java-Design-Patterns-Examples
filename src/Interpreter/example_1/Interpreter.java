package Interpreter.example_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Interpreter {
    private List<Expression> list = new ArrayList<>();

    public Interpreter(String exp) {
        for (String token: exp.split(" ")){

            if( token.equals("+")){
                list.add(new PlusExpression());
            }else if( token.equals("-")){
                list.add(new MinusExpression());
            }else if( token.matches("\\d")) {
                list.add(new NumberExpression( Integer.parseInt( token ) ));
            }else {
                throw new UnsupportedOperationException("Token: " + token + ", is not supported");
            }

        }
    }

    public int evaluate(){
        Stack<Integer> stack = new Stack<>();
        for (Expression e: list){
            e.interpret( stack );
        }

        return stack.pop();
    }
}
