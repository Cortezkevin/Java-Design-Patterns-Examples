package Observer.example_1;

public class RunAPP {
    public static void main(String[] args) {
        Player player = new Player("Kevin");

        Observer enemy1 = new Warrior("Demonio de la Cripta");
        Observer enemy2 = new Mage("Necrófago");
        Observer enemy3 = new Mage("Carro de Despojos");
        WatchTower watchTower = new WatchTower();

        watchTower.subscribe(enemy1);
        watchTower.subscribe(enemy2);
        watchTower.subscribe(enemy3);

        watchTower.intruderDetected(player);
    }
}
