package FactoryMethod.example_2;

public class ToallinFactory extends SouthParkFactory{
    @Override
    public SouthParkCharacter createCharacter() {
        return new Toallin();
    }
}
