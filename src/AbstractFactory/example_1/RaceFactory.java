package AbstractFactory.example_1;

public interface RaceFactory extends Race {
    Hero createHero(String name);
    Structure createStructure(String name);
    Unit createUnit(String name);
}
