package FactoryMethod.example_2;

public class ButtersFactory extends SouthParkFactory{
    @Override
    public SouthParkCharacter createCharacter() {
        return new Butters();
    }
}
