import databasa.Databasa;
import model.Actor;
import model.Genre;
import model.Movie;
import model.Producer;
import service.FindableService;
import service.impl.FindAble;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        FindableService findableService = new FindAble();

        Producer producer1 = new Producer("Руслан","Акун");
        Actor actor1 = new Actor("Аскат","Таке");
        Actor actor11 = new Actor("Альбина ","Айжан");

        LinkedList<Actor>actors1 = new LinkedList<>();
        actors1.addAll(Arrays.asList(actor11,actor1));

        Movie movie1 = new Movie("Таке",2023,Genre.KOMEDIA,producer1,actors1);

Producer producer2 = new Producer("АА","АА");
Actor actor2 = new Actor("АА","bb");
Actor actor3 = new Actor("ИИ","ИИ");
LinkedList<Actor>actors2 = new LinkedList<>();
actors2.addAll(Arrays.asList(actor2,actor3));

Movie movie2 = new Movie("Кино",2020,Genre.BOEVIK,producer2,actors2);
        Databasa databasa = new Databasa();
        databasa.movies.addAll(Arrays.asList(movie2,movie1));
        System.out.println(databasa.movies);

      while (true){ System.out.println("""
               1. List<Movie>getAllMovies();
               2.findMovieByNameOrPartName(String name);
               3.findMovieByActorName(String actorName);
               4. findMovieByYear(Year year);
               5. findMovieByProducer(String producerName);
               6 findMovieByGenre(Genre genre);
               7. findMovieByRole(String role);
               Выберите команду:""");
        Scanner scanner = new Scanner(System.in);
        int v  = scanner.nextInt();
        switch (v){
            case 1->{
                findableService.getAllMovies();

            }
            case 2->{
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("Введите названия фильма:");
                String a = scanner1.nextLine();
                findableService.findMovieByNameOrPartName(a);
            }
            case 3->{
                Scanner scanner2 = new Scanner(System.in);
                System.out.println("Введите имя актера:");
                String name = scanner2.nextLine();
                findableService.findMovieByActorName(name);

            }
            case 4->{
                System.out.println("Введите год:");
                int god = scanner.nextInt();
                findableService.findMovieByYear(god);
            }
            case 5->{
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("Введите имя продюссера:");
                String ss = scanner1.nextLine();
                findableService.findMovieByProducer(ss);
            }
            case 6->{
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("Введите жанр:");
                String a= scanner1.nextLine();
                if (a.equalsIgnoreCase("komedia")){
                    findableService.findMovieByGenre(Genre.KOMEDIA);
                }
            }
        }
        }
    }}
