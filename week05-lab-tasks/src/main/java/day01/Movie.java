package day01;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Movie {

    public String title;
    public List<LocalDateTime> showTime=new ArrayList<>();

    public Movie(String title, List<LocalDateTime> showTime) {
        this.title = title;
        this.showTime = showTime;
    }

    public String getTitle() {
        return title;
    }

    public List<LocalDateTime> getShowTime() {
        return showTime;
    }
}
