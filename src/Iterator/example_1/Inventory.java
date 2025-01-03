package Iterator.example_1;

public class Inventory {
    private Item head, tail;
    private int size, position;

    public Inventory() {
        size = position = 0;
    }

    public Inventory(Item item) {
        this.head = item;
        this.tail = item;
        position = 0;
        size = 1;
    }

    public boolean isEmpty(){
        return this.size == 0;
    }

    private void addEmpty(Item item){
        this.head = item;
        this.tail = item;
        this.size = 1;
    }

    public void addInit(Item item){
        if( isEmpty() ){
            addEmpty( item );
            return;
        }
        item.setNext( head );
        this.head = item;
        this.size++;
    }

    public void addEnd(Item item){
        if( isEmpty() ){
            addEmpty( item );
            return;
        }

        this.tail.setNext(item);
        this.tail = item;
        this.size++;
    }

    private Item get(int pos){
        if( pos > size || pos < 0 || this.isEmpty() ){
            return null;
        }
        int count = 0;
        Item item = this.head;
        while ( count < pos ){
            item = item.getNext();
            count++;
        }

        return item;
    }

    public ItemIterator iterator(){
        return new ItemIterator() {
            @Override
            public boolean hasNext() {
                if( position == size ){
                    reset();
                    return false;
                }
                return true;
            }

            @Override
            public Item next() {
                if( !hasNext() ){
                    return null;
                }
                Item item = get( position );
                position++;
                return item;
            }

            @Override
            public void reset() {
                position = 0;
            }
        };
    }
}
