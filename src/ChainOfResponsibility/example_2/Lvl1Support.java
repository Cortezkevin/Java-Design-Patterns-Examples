package ChainOfResponsibility.example_2;

public class Lvl1Support extends SupportLevel {
    @Override
    public void handle(Problem problem) {
        if( problem instanceof SmallProblem smallProblem ){
            System.out.println("Atendiendo problema de nivel 1: " + smallProblem.name());
        }
        else if( hasNext()  ){
            getNextLevel().handle(problem);
        }else {
            System.out.println("El problema no se puede atender");
        }
    }
}
