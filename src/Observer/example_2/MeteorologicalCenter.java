package Observer.example_2;

public class MeteorologicalCenter implements Observer {
    @Override
    public void update(Observable subject, Climate climate) {
        System.out.println("Meteorological Center: Recibiendo actualización de clima del sensor " + subject.sensorCode());
        System.out.println("Notificando a la central: Clima " + climate.name());
    }
}
