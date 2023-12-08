package service;

import model.Genre;
import model.Movie;

import java.util.LinkedList;

public interface FindableService {
    void getAllMovies();
   void findMovieByNameOrPartName(String name);
    void findMovieByActorName(String actorName);
   void findMovieByYear(int year);
    void  findMovieByProducer(String producerName);
void  findMovieByGenre(Genre genre);

//    LinkedList<Movie> findMovieByGenre(Genre genre);

    LinkedList<Movie> findMovieByRole(String role);
}
