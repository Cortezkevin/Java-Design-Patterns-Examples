package Factory.example_2;

public class Pop implements Song{

    private String title;

    public Pop(String title) {
        this.title = title;
    }

    @Override
    public void play() {
        System.out.println(" 🐵 Reproduciendo en radio monita - POP 🎶: " + title);
    }

    @Override
    public String getDailts() {
        return "Género: POP | Título: " + title;
    }
}
