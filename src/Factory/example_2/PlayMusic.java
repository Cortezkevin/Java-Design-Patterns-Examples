package Factory.example_2;

import java.util.Scanner;

public class PlayMusic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Introducción loca
        System.out.println("🐵 🎶 ¡Bienvenidos a Radio Monita! 🎶 🐵");
        System.out.println("Donde hacemos música porque sí y tú escuchas porque no tienes opción 😎");
        System.out.println("==============================================");
        System.out.println("¡Prepárate para que tu cerebro explote con nuestras *limitadas* opciones de géneros musicales! 💥");

        // Solicitar el género musical
        System.out.println("Elige un género musical: POP, ROCK, INDIE (elige bien, o te mando a los ejércitos de gallinitas 🐔⚔️)");
        String genreInput = scanner.nextLine().toUpperCase();

        // Solicitar el título de la canción
        System.out.println("Escribe el título de la canción (y hazlo bien, o te tiro un galletazo 🍪):");
        String title = scanner.nextLine();

        // Intentar crear y reproducir la canción
        try {
            Genre genre = Genre.valueOf(genreInput); // Validar el género
            Song song = RadioSong.createSong(title, genre); // Crear la canción

            // Mostrar resultados de forma sarcástica
            System.out.println("\n🎧 Preparando tu canción... No te desesperes, no es magia (pero casi) ✨");
            Thread.sleep(1000);

            song.play(); // Reproducir la canción
            System.out.println("🎼 Aquí están los detalles de tu obra musical:");
            System.out.println(song.getDailts()); // Mostrar detalles
            System.out.println("\n🐵 ¡Gracias por usar Radio Monita! 🎵");
            System.out.println("Recuerda, somos la mejor radio porque lo decimos nosotros, y punto 😏");

        } catch (IllegalArgumentException e) {
            System.out.println("\n💀 ¡ERROR FATAL! 💀");
            System.out.println("¿Qué escribiste? ¿Eso se come? 🤨");
            System.out.println("⚠️ Solo aceptamos: POP, ROCK, INDIE. Si no eliges bien, desataré a los ejércitos de gallinitas 🐔⚔️");
            System.out.println("Ah, y si sigues escribiendo mal, prepárate para un galletazo 🍪");
        } catch (InterruptedException e) {
            System.out.println("🐵 Algo salió mal... pero no te preocupes, siempre puedes culpar a las gallinitas 🐔🎶");
        }
    }
}
