package example_11;

import example_11.assets.Animation;
import example_11.assets.Prefab;
import example_11.assets.Sound;
import example_11.assets.Texture;

import java.util.Arrays;
import java.util.List;
/*
*
* Explicación del código:
Prefab (Flyweight): El Prefab es el objeto Flyweight que contiene los recursos compartidos: animaciones, texturas y sonidos. Estos recursos son iguales para todos los NPCs que usen el mismo Prefab.

Npc (Extrínseco): El Npc contiene el estado extrínseco, que en este caso puede ser un nombre único o cualquier otro dato específico de cada NPC. Cada Npc usa el mismo Prefab, pero tiene su propio estado único.

NpcFactory (FlyweightFactory): El NpcFactory se encarga de gestionar los objetos Prefab. Si un Prefab ya existe (es decir, si otro Npc ya ha utilizado ese mismo Prefab), el NpcFactory reutiliza ese Prefab. Si no existe, lo crea y lo guarda.

Cliente (Main): En el cliente, se crean dos NPCs usando el mismo Prefab. Aunque los Npc tienen su propio nombre, comparten las mismas animaciones, texturas y sonidos definidos en el Prefab.
* */

public class RunApp {
    public static void main(String[] args) {
        List<Animation> animations = Arrays.asList(
                new Animation("Saltar"),
                new Animation("Correr")
        );
        List<Texture> textures = Arrays.asList(
                new Texture("texture1"),
                new Texture("texture2")
        );
        List<Sound> sounds = Arrays.asList(
                new Sound("gaa"),
                new Sound("aea")
        );

        Prefab prefab = new Prefab(animations, textures, sounds);

        Npc npc1 = NpcFactory.createNpc(prefab);
        Npc npc2 = NpcFactory.createNpc(prefab);

        System.out.println(npc1.toString());
        System.out.println("-----------------------------------");
        System.out.println(npc2.toString());

    }
}
