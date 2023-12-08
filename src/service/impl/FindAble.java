package service.impl;

import databasa.Databasa;
import model.Genre;
import model.Movie;
import service.FindableService;

import java.util.LinkedList;

public class FindAble implements FindableService {
Databasa databasa = new Databasa();


    @Override
    public void getAllMovies() {
        System.out.println(databasa.movies);
    }

    @Override
    public void findMovieByNameOrPartName(String name) {
        for (int i = 0; i <databasa.movies.size(); i++) {
        if (name.equals(databasa.movies.get(i).getMovieName())){
            System.out.println(databasa.movies.get(i));
            break;
        }
        else {
                System.out.println("Кино не найдено!");

    }}}

    @Override
    public void findMovieByActorName(String actorName) {
        for (int i = 0; i < databasa.movies.size(); i++) {
        for (int j = 0; j < databasa.movies.size(); j++) {
            if (actorName.equals(databasa.movies.get(i).getActor().get(j).getName())){
                System.out.println(databasa.movies.get(i));
            }

        }
    }}

    @Override
    public void findMovieByYear(int year) {
        for (int i = 0; i < databasa.movies.size(); i++) {
        if (year==databasa.movies.get(i).getYear()){
            System.out.println(databasa.movies.get(i));
            return;
        }
        if (i != databasa.movies.size()){
            System.out.println(" Не найден !");
            break;
        }

        }

    }

    @Override
    public void findMovieByProducer(String producerName) {
        for (int i = 0; i < databasa.movies.size(); i++) {
            if (databasa.movies.get(i).producer.getPrFirstname().equals(producerName)){
                System.out.println(databasa.movies.get(i));
                break;
            }else {
                System.out.println("Не найден!");
            }

        }
    }

    @Override
    public LinkedList<Movie> findMovieByRole(String role) {
        return null;
    }

    @Override
  public void findMovieByGenre(Genre genre) {
        for (int i = 0; i < databasa.movies.size(); i++) {
            if (databasa.movies.get(i).getGenre().equals(genre)){
                System.out.println(databasa.movies.get(i));
                break;
            }else {
                System.out.println("НЕ НАЙДЕН!");
            }

        }
}
//
//    @Override
//    public LinkedList<Movie> findMovieByRole(String role) {
//        return null;
//    }
}
