package Bridge.example_2.model;

public class Trend implements Media {
    private String title;
    private String image;
    private Integer favorites;

    public Trend(String title, String image, Integer favorites) {
        this.title = title;
        this.image = image;
        this.favorites = favorites;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getFavorites() {
        return favorites;
    }

    public void setFavorites(Integer favorites) {
        this.favorites = favorites;
    }
}
