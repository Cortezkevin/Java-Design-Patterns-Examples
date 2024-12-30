package ManyPatterns.example_3.model.entity;

public abstract class Entity {
    protected String name;
    protected Attackable attackable;
    protected Attacker attacker;

    public Entity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Attackable getAttackable() {
        return attackable;
    }

    public void setAttackable(Attackable attackable) {
        this.attackable = attackable;
    }

    public Attacker getAttacker() {
        return attacker;
    }

    public void setAttacker(Attacker attacker) {
        this.attacker = attacker;
    }
}
