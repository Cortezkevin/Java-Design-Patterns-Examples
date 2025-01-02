package Factory.example_2;

import static Factory.example_2.Genre.ROCK;

public class RadioSong {

    public static Song createSong(String title, Genre genre){
        switch (genre) {
            case POP -> {
                return new Pop(title);
            }
            case ROCK -> {
                return new Rock(title);
            }
            case INDIE -> {
                return new Indie(title);
            }
            default -> throw new IllegalArgumentException("Género no válido 😒");
        }
    }
}
