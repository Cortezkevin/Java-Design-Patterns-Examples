package Observer.example_2;

public class MobileApp implements Observer {
    @Override
    public void update(Observable subject, Climate climate) {
        System.out.println("Mobile App: Recibiendo actualización de clima del sensor " + subject.sensorCode());
        System.out.println("Actualizando información de la App: Clima " + climate.name());
    }
}
