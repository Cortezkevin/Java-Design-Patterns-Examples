package ManyPatterns.example_3.model.entity;

public interface Attackable {
    void receiveDamage(Entity attacker);
    Combatible combatible();
}
