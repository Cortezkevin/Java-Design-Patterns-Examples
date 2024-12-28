package Memento.example_1;

import javax.naming.NameNotFoundException;

public class Game {
    private String gameName;
    private Integer gold = 0;
    private Integer lumber = 0;
    private Integer units = 0;
    private Integer heroes = 0;

    public Game(String gameName) {
        this.gameName = gameName;
    }

    public Game(String gameName, Integer gold, Integer lumber, Integer units, Integer heroes) {
        this.gameName = gameName;
        this.gold = gold;
        this.lumber = lumber;
        this.units = units;
        this.heroes = heroes;
    }

    public void save(){
        Caretaker.save(new Memento(this));
    }

    public void load(String gameName) throws NameNotFoundException {
        Memento memento = Caretaker.load(gameName);
        this.gameName = memento.getGameName();
        this.gold = memento.getGold();
        this.lumber = memento.getLumber();
        this.units = memento.getUnits();
        this.heroes = memento.getHeroes();
    }

    @Override
    public String toString() {
        return "gameName='" + gameName +
                "gold=" + gold +
                "lumber=" + lumber +
                "units=" + units +
                "heroes=" + heroes;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public Integer getGold() {
        return gold;
    }

    public void setGold(Integer gold) {
        this.gold = gold;
    }

    public Integer getLumber() {
        return lumber;
    }

    public void setLumber(Integer lumber) {
        this.lumber = lumber;
    }

    public Integer getUnits() {
        return units;
    }

    public void setUnits(Integer units) {
        this.units = units;
    }

    public Integer getHeroes() {
        return heroes;
    }

    public void setHeroes(Integer heroes) {
        this.heroes = heroes;
    }
}
