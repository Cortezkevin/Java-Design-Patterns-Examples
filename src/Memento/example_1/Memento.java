package Memento.example_1;

public class Memento {
    private final String gameName;
    private final Integer gold;
    private final Integer lumber;
    private final Integer units;
    private final Integer heroes;

    public Memento(Game game) {
        this.gameName = game.getGameName();
        this.gold = game.getGold();
        this.lumber = game.getLumber();
        this.units = game.getUnits();
        this.heroes = game.getHeroes();
    }

    public String getGameName() {
        return gameName;
    }

    public Integer getGold() {
        return gold;
    }

    public Integer getLumber() {
        return lumber;
    }

    public Integer getUnits() {
        return units;
    }

    public Integer getHeroes() {
        return heroes;
    }
}
