package Observer.example_2;

public class RunApp {
    public static void main(String[] args) {
        AlertSystem alertSystem = new AlertSystem();
        MeteorologicalCenter meteorologicalCenter = new MeteorologicalCenter();
        MobileApp mobileApp = new MobileApp();

        ClimateSensor climateSensor1 = new ClimateSensor("CS001");
        ClimateSensor climateSensor2 = new ClimateSensor("CS002");
        ClimateSensor climateSensor3 = new ClimateSensor("CS003");

        climateSensor1.subscribe(alertSystem);
        climateSensor1.subscribe(meteorologicalCenter);

        climateSensor2.subscribe(mobileApp);

        climateSensor3.subscribe(alertSystem);
        climateSensor3.subscribe(meteorologicalCenter);
        climateSensor3.subscribe(mobileApp);

        climateSensor1.changeClimate(Climate.SUNNY);
        System.out.println("--------------------------------------------------------");
        climateSensor2.changeClimate(Climate.CLOUDY);
        System.out.println("--------------------------------------------------------");
        climateSensor3.changeClimate(Climate.RAINY);
    }
}
