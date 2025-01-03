package Iterator.example_1;

import java.util.Iterator;

public class ListNode<T> implements Iterable<Node<T>> {
    private Node<T> head, tail;
    private int size, position;

    public ListNode() {
        this.size = this.position = 0;
    }

    public ListNode(Node<T> node) {
        this.head = node;
        this.tail = node;
        this.position = 0;
        this.size = 1;
    }

    public boolean isEmpty(){
        return this.size == 0;
    }

    private void addEmpty(T value){
        Node<T> node = new Node<>(value);
        this.head = node;
        this.tail = node;
        this.size = 1;
    }

    public void addInit(T value){
        if( isEmpty() ){
            addEmpty( value );
            return;
        }

        Node<T> node = new Node<>(value);
        node.setNext(this.head);
        this.head = node;
        this.size++;
    }

    public void addEnd(T value){
        if( isEmpty() ){
            addEmpty( value );
            return;
        }

        Node<T> node = new Node<>(value);
        this.tail.setNext(node);
        this.tail = node;
        this.size++;
    }

    private Node<T> get(int pos){
        if( pos > size || pos < 0 || this.isEmpty() ){
            return null;
        }
        int count = 0;
        Node<T> node = this.head;
        while ( count < pos ){
            node = node.getNext();
            count++;
        }

        return node;
    }

    @Override
    public Iterator<Node<T>> iterator() {
        return new Iterator<Node<T>>() {
            @Override
            public boolean hasNext() {
                if ( position < size) {
                    return true;
                }
                return false;
            }

            @Override
            public Node<T> next() {
                Node<T> next = get(position);
                position++;
                return next;
            }
        };
    }
}
