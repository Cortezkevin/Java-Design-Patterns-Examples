package example_3;

import example_3.model.Media;
import example_3.model.Stream;
import example_3.model.Trend;
import example_3.model.Video;

import java.util.ArrayList;
import java.util.List;

/*
 * TODO -> App Example using Bridge design pattern
 * */
public class RunApp {

    static List<Media> content = List.of(
            new Video("Spring desde cero","https://www.images.spring"),
            new Trend("Mira este nuevo lenguaje","https://www.images.tiktok",5000),
            new Stream("Jugando Minecraft","https://www.images.twicht",100),
            new Video("React Hooks","https://www.images.spring"),
            new Stream("Conversando :D","https://www.images.twicht", 12200),
            new Trend("Waffles en 1 minuto","https://www.images.tiktok",1000)
    );

    public static void main(String[] args) {
        List<ListItemView> itemViewList = new ArrayList<>();
        for (Media media: content) {
            if(media instanceof Video video){
                itemViewList.add(
                        Math.random() > 0.5 ?
                        new WithThumbnailListItemView(new VideoViewModel(video)) :
                        new JustTextListItemView(new VideoViewModel(video))
                );
            }else if(media instanceof Stream stream){
                itemViewList.add(
                        Math.random() > 0.5 ?
                        new WithThumbnailListItemView(new StreamViewModel(stream)) :
                        new JustTextListItemView(new StreamViewModel(stream))
                );
            }else if(media instanceof Trend trend){
                itemViewList.add(
                        Math.random() > 0.5 ?
                                new WithThumbnailListItemView(new TrendViewModel(trend)) :
                                new JustTextListItemView(new TrendViewModel(trend))
                );
            }
        }

        for (ListItemView itemView: itemViewList){
            itemView.render();
        }
    }
}
