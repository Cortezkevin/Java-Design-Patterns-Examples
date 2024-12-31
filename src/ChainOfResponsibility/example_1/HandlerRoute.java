package ChainOfResponsibility.example_1;

public abstract class HandlerRoute {
    private HandlerRoute next;

    public HandlerRoute setNext(HandlerRoute next) {
        this.next = next;
        return this;
    }

    public boolean hasNext(){
        return next != null;
    }

    public HandlerRoute getNext() {
        return next;
    }

    public abstract void handle(String route);
}
