package FactoryMethod.example_2;

import java.util.Scanner;

public class SouthParkApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Introducción loca
        System.out.println("🎭 🎬 ¡Bienvenidos al creador de personajes de South Park! 🎬 🎭");
        System.out.println("Porque, claro, elegir personajes virtuales es lo más importante que harás hoy 🙃");
        System.out.println("==============================================");
        System.out.println("¡Prepárate para que tu cerebro explote con nuestras *limitadas* opciones! 💥");

        // Solicitar el personaje
        System.out.println("Elige un personaje de South Park: RANDY, TOALLIN, BUTTERS, KENNY (elige bien, o te mando a los ejércitos de gallinitas 🐔⚔️)");
        String input = scanner.nextLine().toUpperCase();

        // Intentar crear el personaje
        try {
            SouthParkFactory factory;

            switch (input) {
                case "RANDY" -> {
                    factory = new RandyFactory();
                    System.out.println("👨‍🦰 Randy, eh... gran elección si amas el drama y el vino 🍷");
                }
                case "TOWELIE" -> {
                    factory = new ToallinFactory();
                    System.out.println("🧽 Towelie, el tipo que no se olvida de las toallas... excepto cuando lo hace 😎");
                }
                case "BUTTERS" -> {
                    factory = new ButtersFactory();
                    System.out.println("😇 Butters, porque siempre necesitas a alguien que sea adorable y un desastre 🙃");
                }
                case "KENNY" -> {
                    factory = new KennyFactory();
                    System.out.println("💀 Kenny, el clásico. Ya sabes cómo termina esto 😅");
                }
                default -> throw new IllegalArgumentException("Ese personaje no existe. ¿Intentaste crear a Cartman? ¡Intenta algo real! 🙄");
            }

            // Crear el personaje usando la fábrica
            SouthParkCharacter character = factory.createCharacter();

            System.out.println("\n🎭 Preparando tu personaje... No te desesperes, no es magia (pero casi) ✨");
            Thread.sleep(1000); // Simula un breve tiempo de espera

            System.out.println("\n🎬 Aquí está tu personaje épico:");
            character.introduce(); // Presentar al personaje
            System.out.println("\n✨ ¡Gracias por perder tu valioso tiempo con este creador de personajes! Ahora vuelve a tus quehaceres 😉");

        } catch (IllegalArgumentException e) {
            // Manejo de error sarcástico
            System.out.println("\n💀 ¡ERROR FATAL! 💀");
            System.out.println("¿Qué escribiste? Eso no es un personaje. ¿Escribes con los codos? 🤨");
            System.out.println("⚠️ Opciones válidas: RANDY, TOWELIE, BUTTERS, KENNY. Y sí, así de limitados somos 🐔⚔️");
            System.out.println("Si sigues inventando, prepárate para el galletazo final 🍪 ");
        } catch (InterruptedException e) {
            System.out.println("🎬 Algo salió mal... pero no te preocupes, siempre puedes culpar a Kenny 💀");
        }
    }
}