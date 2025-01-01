package AbstractFactory.example_1;

public class Necropolis extends Structure {
    public Necropolis(String name) {
        super(name);
    }

    @Override
    public void show() {
        System.out.println(this);
    }

    @Override
    public RaceType type() {
        return RaceType.UNDEAD;
    }
}