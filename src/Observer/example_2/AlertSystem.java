package Observer.example_2;

public class AlertSystem implements Observer {
    @Override
    public void update(Observable subject, Climate climate) {
        System.out.println("Alert System: Recibiendo actualización de clima del sensor " + subject.sensorCode());
        System.out.println("Lanzando alerta: Clima " + climate.name());
    }
}
