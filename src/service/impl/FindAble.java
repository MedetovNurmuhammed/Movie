package service.impl;

import databasa.Databasa;
import model.Actor;
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
        Boolean istrue = false;
        for (int i = 0; i < databasa.movies.size(); i++) {
            Movie currentMovie = databasa.movies.get(i);
            for (int j = 0; j < currentMovie.getActor().size(); j++) {
                Actor currentActor = currentMovie.getActor().get(j);
                if (currentActor.getName().contains(actorName)) {
                    System.out.println(currentMovie);
                    istrue = true;
                }
            }
        }if (!istrue){
            System.out.println("Не найдено!");
        }
    }


    @Override
    public void findMovieByYear(int year) {
        Boolean is = false;
        for (int i = 0; i < databasa.movies.size(); i++) {
        if (year==databasa.movies.get(i).getYear()){
            System.out.println(databasa.movies.get(i));
            is = true;

        }}
        if (!is){
            System.out.println(" Не найден !");

        }

        }



    @Override
    public void findMovieByProducer(String producerName) {
        boolean istrue  = false;
        for (int i = 0; i < databasa.movies.size(); i++) {
            if (databasa.movies.get(i).producer.getPrFirstname().equalsIgnoreCase(producerName)){
                System.out.println(databasa.movies.get(i));
                istrue = true;}}
            if (!istrue){
                System.out.println("Не найден!");
            }

        }


    @Override
    public void findMovieByRole(String role) {
        boolean istrue = false;
        for (int i = 0; i < databasa.movies.size(); i++) {
            for (int j = 0; j < databasa.movies.get(i).getActor().size() ; j++) {
                if (databasa.movies.get(i).getActor().get(j).getRole().equalsIgnoreCase(role)) {
                    System.out.println(databasa.movies.get(i));
                    istrue = true;
                }
            }
        }
        if (!istrue) {
            System.out.println("НЕ найден!");

        }
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
