package FactoryMethod.example_2;

public class RandyFactory extends SouthParkFactory {
    @Override
    public SouthParkCharacter createCharacter() {
        return new Randy();
    }
}
