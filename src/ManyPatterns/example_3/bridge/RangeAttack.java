package ManyPatterns.example_3.bridge;

import ManyPatterns.example_3.model.entity.Entity;

public class RangeAttack implements AttackType {
    private Entity self;

    public RangeAttack(Entity self) {
        this.self = self;
    }

    @Override
    public void attack(Entity target) {
        if(target.getAttackable() != null && self.getAttacker() != null){
            self.getAttacker().attack(target);
        }else if( self.getAttacker() == null){
            System.out.println(self.getName() + ": No puedo atacar!");
        }else {
            System.out.println(self.getName() + ": El objetivo es invulnerable!");
        }
    }

    @Override
    public String name() {
        return "Range";
    }
}
