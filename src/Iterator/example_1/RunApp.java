package Iterator.example_1;

public class RunApp {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        inventory.addEnd(new Item("sword",10));
        inventory.addEnd(new Item("shield",10));
        inventory.addEnd(new Item("armor",20));
        inventory.addEnd(new Item("helmet",10));

        ItemIterator iterator = inventory.iterator();
        while ( iterator.hasNext() ){
            System.out.println(iterator.next());
        }
    }
}
