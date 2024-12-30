package ManyPatterns.example_3.model.entity;

public class AttackableImpl implements Attackable {
    private Combatible self;

    public AttackableImpl(Combatible attackable) {
        this.self = attackable;
    }

    @Override
    public void receiveDamage(Entity attacker) {
        System.out.println(self.combatibleName() + ": Recibiendo daño!");
        self.decreaseHealth(attacker.getAttacker().combatible().damage());
    }

    @Override
    public Combatible combatible() {
        return self;
    }
}
