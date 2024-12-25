package example_11;


import example_11.assets.Prefab;

public class Npc {
    private static final int MAX_HEALTH = 100;

    private static int id;
    private String name;
    private int health;
    private Coordinates coordinates;
    private Prefab prefab;

    public Npc(Prefab prefab) {
        this.name = "NPC" + id;
        this.health = MAX_HEALTH;
        this.coordinates = Coordinates.getCoordinates();
        this.prefab = prefab;
        id++;
    }

    @Override
    public String toString() {
        return "name " + name + "\n" +
                "health=" + health + "\n" +
                "coordinates=" + coordinates + "\n" +
                "prefab=" + prefab;
    }
}
