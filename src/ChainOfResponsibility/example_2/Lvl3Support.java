package ChainOfResponsibility.example_2;

public class Lvl3Support extends SupportLevel {
    @Override
    public void handle(Problem problem) {
        if( problem instanceof HighProblem highProblem ){
            System.out.println("Atendiendo problema de nivel 3: " + highProblem.name());
        }
        else if( hasNext()  ){
            getNextLevel().handle(problem);
        }else {
            System.out.println("El problema no se puede atender");
        }
    }
}
