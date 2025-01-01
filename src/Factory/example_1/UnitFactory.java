package Factory.example_1;

public class UnitFactory {
    public static Unit create(String name, UnitType unitType){
        return switch (unitType){
            case ORC -> new Orc(name);
            case HUMAN -> new Human(name);
            case UNDEAD -> new Undead(name);
        };
    }
}
