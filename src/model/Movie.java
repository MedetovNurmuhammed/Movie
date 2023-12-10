package model;

import java.util.LinkedList;

public class Movie {
    private String movieName;
    private int year;
    private Genre genre;
    public Producer producer;
    public LinkedList<Actor> actor;

    public Movie(String movieName, int year, Genre genre, Producer producer, LinkedList<Actor> actor) {
        this.movieName = movieName;
        this.year = year;
        this.genre = genre;
        this.producer = producer;
        this.actor = actor;
    }

    public Movie() {
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public LinkedList<Actor> getActor() {
        return actor;
    }

    public void setActor(LinkedList<Actor> actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "Movie" +"\n"+
                "movieName='" + movieName + "\n"+
                "year=" +     year +"\n"+
                "genre=" +    genre +"\n"+
                "producer=" + producer +"\n"+
                "actor=" +    actor +"\n"+
                '}';
    }
}
