package AbstractFactory.example_1;

public class HumanFactory implements RaceFactory {
    @Override
    public Hero createHero(String name) {
        return new MountainKing(name);
    }

    @Override
    public Structure createStructure(String name) {
        return new Castle(name);
    }

    @Override
    public Unit createUnit(String name) {
        return new Soldier(name);
    }

    @Override
    public RaceType type() {
        return RaceType.HUMAN;
    }
}
