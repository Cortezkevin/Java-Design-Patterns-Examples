package AbstractFactory.example_1;

public class UndeadFactory implements RaceFactory {
    @Override
    public Hero createHero(String name) {
        return new CryptLord(name);
    }

    @Override
    public Structure createStructure(String name) {
        return new Necropolis(name);
    }

    @Override
    public Unit createUnit(String name) {
        return new Necrophage(name);
    }

    @Override
    public RaceType type() {
        return RaceType.UNDEAD;
    }
}
