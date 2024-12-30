package ManyPatterns.example_3.bridge;

import ManyPatterns.example_3.model.entity.Entity;

public class MeleeAttack implements AttackType {
    private Entity self;

    public MeleeAttack(Entity self) {
        this.self = self;
    }

    @Override
    public void attack(Entity target) {
        if(target.getAttackable() != null && self.getAttacker() != null){
            if( target.getAttackable().combatible().combatType().equals("Melee")){
                self.getAttacker().attack(target);
            }else {
                System.out.println(self.getName()+ ": No puedo atacar unidades voladoras!");
            }
        }else if( target.getAttacker() == null){
            System.out.println(self.getName()+ ": No puedo atacar!");
        }else {
            System.out.println(self.getName() + ": El objetivo es invulnerable!");
        }
    }

    @Override
    public String name() {
        return "Melee";
    }
}
