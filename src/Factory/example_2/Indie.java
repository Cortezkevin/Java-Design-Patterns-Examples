package Factory.example_2;

public class Indie implements Song{

    private String title;

    public Indie(String title) {
        this.title = title;
    }

    @Override
    public void play() {
        System.out.println(" 🐵 Reproduciendo en radio monita - INDIE ✨: " + title);
    }

    @Override
    public String getDailts() {
        return "Género: INDIE | Título: " + title;
    }
}
