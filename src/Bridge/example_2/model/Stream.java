package Bridge.example_2.model;

public class Stream implements Media{
    private String title;
    private String image;
    private Integer viewers;

    public Stream(String title, String image, Integer viewers) {
        this.title = title;
        this.image = image;
        this.viewers = viewers;
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

    public Integer getViewers() {
        return viewers;
    }

    public void setViewers(Integer viewers) {
        this.viewers = viewers;
    }
}
