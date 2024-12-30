package ManyPatterns.example_3.model.entity;

public class AttackerImpl implements Attacker {
    private Combatible self;

    public AttackerImpl(Combatible self) {
        this.self = self;
    }

    @Override
    public void attack(Entity target) {
        System.out.println(self.combatibleName() + ": Atacando al objetivo!");
        target.getAttackable().receiveDamage((Entity) self);
    }

    @Override
    public Combatible combatible() {
        return self;
    }
}
