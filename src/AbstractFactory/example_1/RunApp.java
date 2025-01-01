package AbstractFactory.example_1;

public class RunApp {
    public static void main(String[] args) {
        RaceFactory humanFactory = new HumanFactory();
        RaceFactory undeadFactory = new UndeadFactory();

        Hero humanHero = humanFactory.createHero("Rey de la montaña");
        Unit humanUnit = humanFactory.createUnit("Soldado raso");
        Structure humanStructure = humanFactory.createStructure("Castillo");

        Hero undeadHero = undeadFactory.createHero("Señor de la Cripta");
        Unit undeadUnit = undeadFactory.createUnit("Necrófago");
        Structure undeadStructure = undeadFactory.createStructure("Necropolis");

        humanHero.show();
        System.out.println("------------------------------------------");
        humanUnit.show();
        System.out.println("------------------------------------------");
        humanStructure.show();

        System.out.println("------------------------------------------");
        System.out.println("------------------------------------------");

        undeadHero.show();
        System.out.println("------------------------------------------");
        undeadUnit.show();
        System.out.println("------------------------------------------");
        undeadStructure.show();
    }
}
