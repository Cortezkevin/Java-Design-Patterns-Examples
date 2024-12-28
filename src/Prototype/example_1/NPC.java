package Prototype.example_1;

public class NPC implements Prototype {
    String name;
    Integer health;

    @Override
    public Prototype cloneNPC() {
        return new NPC(this);
    }

    public NPC(String name, Integer health) {
        this.name = name;
        this.health = health;
    }

    private NPC(NPC npc) {
        this.name = npc.name;
        this.health = npc.health;
    }

    @Override
    public String toString() {
        return "NPC{" +
                "name='" + name + '\'' +
                ", health=" + health +
                '}';
    }
}
