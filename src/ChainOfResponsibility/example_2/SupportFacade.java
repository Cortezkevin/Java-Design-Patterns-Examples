package ChainOfResponsibility.example_2;

public class SupportFacade {
    private final SupportLevel support;

    public SupportFacade() {
        support = new Lvl1Support();
        SupportLevel supportLevel2 = new Lvl2Support();
        SupportLevel supportLevel3 = new Lvl3Support();

        support.setNextLevel(supportLevel2);
        supportLevel2.setNextLevel(supportLevel3);
    }

    public void handleProblem(Problem problem){
        this.support.handle(problem);
    }
}
