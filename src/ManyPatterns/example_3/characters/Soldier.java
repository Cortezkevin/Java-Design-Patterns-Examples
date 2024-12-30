package ManyPatterns.example_3.characters;

import ManyPatterns.example_3.bridge.*;
import ManyPatterns.example_3.model.Human;
import ManyPatterns.example_3.model.entity.AttackableImpl;
import ManyPatterns.example_3.model.entity.AttackerImpl;

public class Soldier extends Human {
    public Soldier() {
        super("Soldado",440,0,15);
        setAttackable(new AttackableImpl(this));
        setAttacker(new AttackerImpl(this));
        setAttackType(new MeleeAttack(this));
        setMobilityType(new GroundMobility());
        setUnitType(new WarriorType());
    }
}
