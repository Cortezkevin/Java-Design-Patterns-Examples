package AbstractFactory.example_1;

public class Soldier extends Unit {
    public Soldier(String name) {
        super(name);
    }

    @Override
    public RaceType type() {
        return RaceType.HUMAN;
    }

    @Override
    public void show() {
        System.out.println(this);
    }
}
