package Prototype.example_1;

/*
 * TODO -> App Example using Prototype design pattern
 */
public class RunApp {
    public static void main(String[] args) {
        NPC npc1 = new NPC("Kevin",100);
        NPC npc2 = (NPC) npc1.cloneNPC();
        NPC npc3 = (NPC) npc1.cloneNPC();
        NPC npc4 = (NPC) npc1.cloneNPC();
        NPC npc5 = (NPC) npc1.cloneNPC();

        System.out.println(npc1.toString());
        System.out.println("---------------------------------");
        System.out.println(npc2.toString());
        System.out.println("---------------------------------");
        System.out.println(npc3.toString());
        System.out.println("---------------------------------");
        System.out.println(npc4.toString());
        System.out.println("---------------------------------");
        System.out.println(npc5.toString());
    }
}
