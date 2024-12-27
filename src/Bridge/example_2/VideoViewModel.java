package Bridge.example_2;

import Bridge.example_2.model.Video;

public class VideoViewModel implements IViewModel {
    private Video video;

    public VideoViewModel(Video video) {
        this.video = video;
    }

    @Override
    public String title() {
        return "VIDEO -> " + video.getTitle();
    }

    @Override
    public String image() {
        return "VIDEO -> " + video.getImage();
    }
}
