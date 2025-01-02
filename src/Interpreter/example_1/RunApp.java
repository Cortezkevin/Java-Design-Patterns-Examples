package Interpreter.example_1;

public class RunApp {
    public static void main(String[] args) {
        String exp = "1 2 3 + -";
        System.out.println("Result: " + new Interpreter(exp).evaluate() );
        /*
        "-1 + 2 - 3"

        3
        2 -
        -1 +

        -2



        "1 + 2 - 3"
        3
        2   -
        1   +*/


        /*-
        5
        1*/
    }
}
