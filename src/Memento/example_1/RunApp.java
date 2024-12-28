package Memento.example_1;

import javax.naming.NameNotFoundException;

/*
 * TODO -> App Example using Memento design pattern
 */
public class RunApp {
    public static void main(String[] args) throws NameNotFoundException {
        Game game1 = new Game(
                "campaña_1",
                1000,
                700,
                40,
                2
        );

        Game game2 = new Game(
                "campaña_2",
                1200,
                200,
                50,
                1
        );

        game1.save();
        game2.save();

        Game game = new Game("campaña_3");
        System.out.println(game);

        game.load("campaña_1");
        System.out.println(game);

        game.load("campaña_2");
        System.out.println(game);

        game.setGold(100);
        game.setLumber(600);
        game.setUnits(25);

        game.save();

        Game gameResult = new Game("another");
        gameResult.load("campaña_2");
        System.out.println(gameResult);
    }
}
