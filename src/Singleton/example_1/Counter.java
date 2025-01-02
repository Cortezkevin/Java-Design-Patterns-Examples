package Singleton.example_1;

public class Counter {
    private static Counter INSTANCE;
    private static Integer value = 0;

    public Counter() {
    }

    public static synchronized Counter getInstance(){
        if( INSTANCE == null ){
            INSTANCE = new Counter();
        }
        return INSTANCE;
    }

    public void increase(){
        value ++;
    }

    public void decrease(){
        value --;
    }

    public Integer getValue() {
        return value;
    }
}
