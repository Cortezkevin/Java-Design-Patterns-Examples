package Factory.example_2;

import java.util.Scanner;

public class PlayMusic {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Elige un género musical: POP, ROCK, INDIE");
        String genreInput = scanner.nextLine().toUpperCase();

        System.out.println("Escribe el título de la canción: ");
        String title = scanner.nextLine();

        try {
            Genre genre = Genre.valueOf(genreInput);
            Song song = RadioSong.createSong(title, genre);

            song.play(); // Reproduciendo
            System.out.println(song.getDailts()); // Detalles

        } catch (IllegalArgumentException e){
            System.out.println("Género no valido 💀 Inténtalo de nuevo 🤨");
        }
    }
}
