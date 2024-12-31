package ChainOfResponsibility.example_2;

public abstract class SupportLevel {
    private SupportLevel nextLevel;

    public SupportLevel getNextLevel() {
        return nextLevel;
    }

    public SupportLevel setNextLevel(SupportLevel nextLevel) {
        this.nextLevel = nextLevel;
        return this;
    }

    public boolean hasNext(){
        return nextLevel != null;
    }

    public abstract void handle(Problem problem);
}
