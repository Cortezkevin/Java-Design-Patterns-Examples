package ManyPatterns.example_3.model;

import ManyPatterns.example_3.bridge.AttackType;
import ManyPatterns.example_3.bridge.MobilityType;
import ManyPatterns.example_3.bridge.UnitType;
import ManyPatterns.example_3.model.entity.Combatible;
import ManyPatterns.example_3.model.entity.Entity;

public abstract class Unit extends Entity implements Combatible {
    private Integer health;
    private Integer mana;
    private Integer damage;

    protected AttackType attackType;
    protected MobilityType mobilityType;
    protected UnitType unitType;

    public Unit(String name, Integer health, Integer mana, Integer damage) {
        super(name);
        this.health = health;
        this.mana = mana;
        this.damage = damage;
    }

    @Override
    public Integer damage() {
        return damage;
    }

    @Override
    public Integer health() {
        return health;
    }

    @Override
    public String mobility() {
        return mobilityType.name();
    }

    @Override
    public String combatType() {
        return attackType.name();
    }

    @Override
    public void decreaseHealth(Integer damage) {
        this.setHealth(this.getHealth() - damage);
    }

    @Override
    public String combatibleName() {
        return name;
    }

    public MobilityType getMobilityType() {
        return mobilityType;
    }

    public void setMobilityType(MobilityType mobilityType) {
        this.mobilityType = mobilityType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Integer getMana() {
        return mana;
    }

    public void setMana(Integer mana) {
        this.mana = mana;
    }

    public AttackType getAttackType() {
        return attackType;
    }

    public void setAttackType(AttackType attackType) {
        this.attackType = attackType;
    }

    public UnitType getUnitType() {
        return unitType;
    }

    public void setUnitType(UnitType unitType) {
        this.unitType = unitType;
    }

    public abstract void attack(Entity target);
    public abstract void move();
}
