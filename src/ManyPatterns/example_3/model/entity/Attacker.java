package ManyPatterns.example_3.model.entity;

public interface Attacker {
    void attack(Entity entity);
    Combatible combatible();
}
