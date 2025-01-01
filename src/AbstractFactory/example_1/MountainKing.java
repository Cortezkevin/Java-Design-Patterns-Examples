package AbstractFactory.example_1;

public class MountainKing extends Hero {
    public MountainKing(String name) {
        super(name);
    }

    @Override
    public void show() {
        System.out.println(this);
    }

    @Override
    public RaceType type() {
        return RaceType.HUMAN;
    }
}
