package ManyPatterns.example_3;

import ManyPatterns.example_3.characters.Gargoyle;
import ManyPatterns.example_3.characters.Necrophage;
import ManyPatterns.example_3.characters.Soldier;
import ManyPatterns.example_3.model.Unit;

public class RunApp {
    public static void main(String[] args) {
        Unit necrophage = new Necrophage();
        Unit soldier = new Soldier();
        Unit gargoyle = new Gargoyle();

        necrophage.attack(soldier);
        System.out.println("-------------------------------");
        soldier.attack(necrophage);
        System.out.println("-------------------------------");
        soldier.attack(gargoyle);
        System.out.println("-------------------------------");
        gargoyle.attack(soldier);
        System.out.println("-------------------------------");
        soldier.setAttackable(null);
        soldier.setAttacker(null);
        necrophage.attack(soldier);
        System.out.println("---------------------");
        soldier.attack(necrophage);
    }
}
