package Flyweight.example_1.assets;

public class Animation {
    private String animation;

    public Animation(String animation) {
        this.animation = animation;
    }

    @Override
    public String toString() {
        return animation;
    }
}
