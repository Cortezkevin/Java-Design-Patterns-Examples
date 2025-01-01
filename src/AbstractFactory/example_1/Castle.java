package AbstractFactory.example_1;

public class Castle extends Structure {
    public Castle(String name) {
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
