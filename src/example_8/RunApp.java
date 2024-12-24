package example_8;

/*
 * TODO -> App Example using State design pattern
 * */
public class RunApp {
    public static void main(String[] args) {
        Character character = new Character("Kevin");
        character.move();
        character.showState();

        System.out.println("-----------------------------------------------");

        character.attack();
        character.showState();

        System.out.println("-----------------------------------------------");

        character.move();
        character.showState();

        System.out.println("-----------------------------------------------");

        character.receiveDamage();
        character.showState();

        System.out.println("-----------------------------------------------");

        character.move();
        character.showState();

        System.out.println("-----------------------------------------------");

        character.attack();
        character.showState();

        System.out.println("-----------------------------------------------");

        for (int i = 0; i < 2; i ++)
            character.receiveDamage();

        System.out.println("-----------------------------------------------");

        character.showState();
    }
}
