package AbstractFactory.example_1;

public class CryptLord extends Hero {
    public CryptLord(String name) {
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
