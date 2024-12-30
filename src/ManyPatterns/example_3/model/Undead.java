package ManyPatterns.example_3.model;

import ManyPatterns.example_3.model.entity.Entity;

public abstract class Undead extends Unit {
    public Undead(String name, Integer health, Integer mana, Integer damage) {
        super(name, health, mana, damage);
    }

    @Override
    public void attack(Entity target) {
        attackType.attack(target);
    }

    @Override
    public void move() {
        mobilityType.move();
    }
}
