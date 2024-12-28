package Observer.example_1;

public class Mage implements Enemy, Observer {
    private String name;

    public Mage(String name) {
        this.name = name;
    }

    @Override
    public void attack(Player player) {
        System.out.println("Mage: "+ name + " atacando a " + player.getName() + "!!!");
    }

    @Override
    public void update(Observable subject, Object arg) {
        Player player = (Player) arg;
        this.attack(player);
    }
}
