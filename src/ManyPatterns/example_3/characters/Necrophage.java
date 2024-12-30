package ManyPatterns.example_3.characters;

import ManyPatterns.example_3.bridge.GroundMobility;
import ManyPatterns.example_3.bridge.LumberCollectType;
import ManyPatterns.example_3.bridge.MeleeAttack;
import ManyPatterns.example_3.bridge.WarriorType;
import ManyPatterns.example_3.model.Undead;
import ManyPatterns.example_3.model.entity.AttackableImpl;
import ManyPatterns.example_3.model.entity.AttackerImpl;

public class Necrophage extends Undead {
    public Necrophage() {
        super("Necrofago", 350, 0,20);
        setAttackable(new AttackableImpl(this));
        setAttacker(new AttackerImpl(this));
        setAttackType(new MeleeAttack(this));
        setMobilityType(new GroundMobility());
        setUnitType(new LumberCollectType(new WarriorType()));
    }
}
