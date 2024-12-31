package ChainOfResponsibility.example_2;

public class Lvl2Support extends SupportLevel {
    @Override
    public void handle(Problem problem) {
        if( problem instanceof MediumProblem mediumProblem ){
            System.out.println("Atendiendo problema de nivel 2: " + mediumProblem.name());
        }
        else if( hasNext()  ){
            getNextLevel().handle(problem);
        }else {
            System.out.println("El problema no se puede atender");
        }
    }
}
