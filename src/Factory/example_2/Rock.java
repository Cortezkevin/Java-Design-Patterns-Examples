package Factory.example_2;

public class Rock implements Song{

    private String title;

    public Rock(String title) {
        this.title = title;
    }

    @Override
    public void play() {
        System.out.println(" 🐵 Reproduciendo en radio monita - ROCK 🎸: " + title);
    }

    @Override
    public String getDailts() {
        return "Género: ROCK | Título: " + title;
    }
}
