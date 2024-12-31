package ChainOfResponsibility.example_2;

public class RunApp {
    public static void main(String[] args) {
        SupportFacade supportFacade = new SupportFacade();

        Problem problem = MediumProblem.SOFTWARE_ERROR;

        supportFacade.handleProblem( problem );

    }
}
