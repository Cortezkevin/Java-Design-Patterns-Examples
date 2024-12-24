package example_3;

import example_3.model.Video;

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
