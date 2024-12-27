package Flyweight.example_1;

import Flyweight.example_1.assets.Animation;
import Flyweight.example_1.assets.Prefab;
import Flyweight.example_1.assets.Sound;
import Flyweight.example_1.assets.Texture;

import java.util.Arrays;
import java.util.List;

/*
 * TODO -> App Example using FlyWeight design pattern
 */
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
