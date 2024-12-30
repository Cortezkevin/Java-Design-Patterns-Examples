package ManyPatterns.example_3.characters;

import ManyPatterns.example_3.bridge.FlyingMobility;
import ManyPatterns.example_3.bridge.RangeAttack;
import ManyPatterns.example_3.bridge.WarriorType;
import ManyPatterns.example_3.model.Undead;
import ManyPatterns.example_3.model.entity.AttackableImpl;
import ManyPatterns.example_3.model.entity.AttackerImpl;

public class Gargoyle extends Undead  {
    public Gargoyle() {
        super("Gargola", 500, 0, 40);
        setAttacker(new AttackerImpl(this));
        setAttackable(new AttackableImpl(this));
        setAttackType(new RangeAttack(this));
        setMobilityType(new FlyingMobility());
        setUnitType(new WarriorType());
    }
}
