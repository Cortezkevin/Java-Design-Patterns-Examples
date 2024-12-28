package Observer.example_1;

public class Warrior implements Enemy, Observer {
    private String name;

    public Warrior(String name) {
        this.name = name;
    }

    @Override
    public void attack(Player player) {
        System.out.println("Warrior: "+ name + " atacando a " + player.getName() + "!!!");
    }

    @Override
    public void update(Observable subject, Object arg) {
        Player player = (Player) arg;
        this.attack(player);
    }
}
