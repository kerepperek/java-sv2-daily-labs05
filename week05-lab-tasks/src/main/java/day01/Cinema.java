package day01;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cinema {

    public List<Movie> movies = new ArrayList<>();


    public static void main(String[] args) {
        Cinema cinema = new Cinema();

        cinema.addMovie(new Movie("Titanic", Arrays.asList(
                LocalDateTime.of(2021, 11, 8, 12, 45),
                LocalDateTime.of(2021, 11, 8, 22, 25))));
        cinema.addMovie(new Movie("Juracic Park", Arrays.asList(
                LocalDateTime.of(2021, 11, 8, 19, 45),
                LocalDateTime.of(2021, 11, 8, 20, 25),
                LocalDateTime.of(2021, 11, 8, 22, 25))));

        System.out.println(cinema.findMovieByTime(LocalDateTime.of(2021,11,8,10,45)));
        System.out.println(cinema.findMovieByTime(LocalDateTime.of(2021,11,8,19,45)));
        System.out.println(cinema.findMovieByTime(LocalDateTime.of(2021,11,8,22,25)));
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public List<String> findMovieByTime(LocalDateTime time) {
        List<String> selectedMovies = new ArrayList<>();
        for (Movie movie : movies) {
            for (LocalDateTime movieTime : movie.getShowTime()) {
                if (time.isEqual(movieTime)) {
                    selectedMovies.add(movie.getTitle());
                    break;
                }
            }
        }
        return selectedMovies;

    }
}