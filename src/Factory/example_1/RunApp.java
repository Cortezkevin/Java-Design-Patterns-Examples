package Factory.example_1;

public class RunApp {
    public static void main(String[] args) {
        Orc orc1 = (Orc) UnitFactory.create("Grunt", UnitType.ORC);
        Orc orc2 = (Orc) UnitFactory.create("Troll", UnitType.ORC);
        Human human1 = (Human) UnitFactory.create("Soldado", UnitType.HUMAN);

        orc1.show();
        orc2.show();
        human1.show();
    }
}
