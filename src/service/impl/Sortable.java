package service.impl;

import databasa.Databasa;
import model.Movie;
import service.SortService;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sortable implements SortService  {
    Databasa databasa = new Databasa();

    @Override
    public void sortByMovieName(String ascOrDesc) {
        List<Movie> movieList = databasa.movies;
        if (ascOrDesc.equalsIgnoreCase("ask")) Collections.sort(movieList, ask);
        else if (ascOrDesc.equalsIgnoreCase("desk")) {
Collections.sort(movieList,ask.reversed());
        }else {
            System.out.println("Вы что то ввели не так!");
        }

    }
    public static Comparator<Movie>ask = ((o1, o2) -> o1.getMovieName().compareTo(o2.getMovieName()));
    @Override
    public void sortByYear(String ascDesc) {
List<Movie>mm  = databasa.movies;
if (ascDesc.equalsIgnoreCase("ask")){
    Collections.sort(mm,year);
}else if (ascDesc.equalsIgnoreCase("desk")){
        Collections.sort(mm,year.reversed());
    }else {
    System.out.println("Вы чтото ввели нетак!");
    }}
    public static Comparator<Movie>year = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getYear()-o2.getYear();
        }
    };

    @Override
    public void sortByProducer(String askorDesk) {List<Movie>list  = databasa.movies;
        if (askorDesk.equalsIgnoreCase("ask")){

            Collections.sort(list,prodicercer);
        }else if (askorDesk.equalsIgnoreCase("desk")){
            Collections.sort(list,prodicercer.reversed());

    }else {
            System.out.println("Вы что то ввели не так");}
    }
    public static Comparator<Movie>prodicercer = ((o1, o2) -> o1.getMovieName().compareTo(o2.getMovieName()));
        }

