import databasa.Databasa;
import model.Actor;
import model.Genre;
import model.Movie;
import model.Producer;
import service.FindableService;
import service.SortService;
import service.impl.FindAble;
import service.impl.Sortable;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        SortService sortService = new Sortable();
        FindableService findableService = new FindAble();

        Producer producer1 = new Producer("Руслан", "Акун");
        Actor actor1 = new Actor("Аскат", "Таке");
        Actor actor11 = new Actor("Альбина ", "Айжан");
        LinkedList<Actor> actors1 = new LinkedList<>();
        actors1.addAll(Arrays.asList(actor11, actor1));
        Movie movie1 = new Movie("Таке", 2023, Genre.KOMEDIA, producer1, actors1);

        Producer producer2 = new Producer("Нурислам", "Тойгонбаев");
        Actor actor2 = new Actor("Аскат", "Мирлан");
        Actor actor3 = new Actor("Нурмухаммед", "Камчыбек");
        LinkedList<Actor> actors2 = new LinkedList<>();
        actors2.addAll(Arrays.asList(actor2, actor3));
        Movie movie2 = new Movie("Соолуган гулдор", 2020, Genre.BOEVIK, producer2, actors2);

        Producer producer3 = new Producer("Эмиль", "Эсеналиев");
        Actor actor4 = new Actor("Эмиль", "Мимоза");
        Actor actor5 = new Actor("Эрмек", "Бакдоолотик");
        LinkedList<Actor> actors3 = new LinkedList<>(Arrays.asList(actor4, actor5));
        Movie movie3 = new Movie("Мимоза", 2020, Genre.UJAS, producer3, actors3);

        Producer producer4 =  new Producer("Руслан","Акун");
        Actor actor6 = new Actor("Али","Баки");
        Actor actor7 = new Actor("Бек","Юдзиро");
        LinkedList<Actor>actors5 = new LinkedList<>(Arrays.asList(actor6,actor7));
        Movie movie4 = new Movie("Баки",2016,Genre.ANIME,producer4,actors5);
        Databasa databasa = new Databasa();
        databasa.movies.addAll(Arrays.asList(movie2, movie1, movie3,movie4));


        while (true) {
            System.out.println("""
                     1. List<Movie>getAllMovies();
                     2.findMovieByNameOrPartName(String name);
                     3.findMovieByActorName(String actorName);
                     4. findMovieByYear(Year year);
                     5. findMovieByProducer(String producerName);
                     6 findMovieByGenre(Genre genre);
                     7. findMovieByRole(String role);
                     8.sortByMovieName(String ascOrDesc);
                    -from A to Z
                    -from Z to A
                     9. sortByYear(String ascOrDesc);
                    -Ascending
                    -Descending
                    10.sortByProducer();
                     Выберите команду:""");
            Scanner scanner = new Scanner(System.in);
           try {
               int v = scanner.nextInt();
if (v>=11|| v<0) {
    System.err.println("Не верный выбор!");
}else {
    switch (v) {
        case 1 -> {
            findableService.getAllMovies();

        }
        case 2 -> {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Введите названия фильма:");
            String a = scanner1.nextLine();
            findableService.findMovieByNameOrPartName(a);
        }
        case 3 -> {
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Введите имя актера:");
            String name = scanner2.nextLine();
            findableService.findMovieByActorName(name);

        }
        case 4 -> {
            System.out.println("Введите год:");
            int god = scanner.nextInt();
            findableService.findMovieByYear(god);
        }
        case 5 -> {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Введите имя продюссера:");
            String ss = scanner1.nextLine();
            findableService.findMovieByProducer(ss);
        }
        case 6 -> {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Введите жанр:");
            String a = scanner1.nextLine();
            if (a.equalsIgnoreCase("komedia")) {
                findableService.findMovieByGenre(Genre.KOMEDIA);
            }
            if (a.equalsIgnoreCase("ujas")) {
                findableService.findMovieByGenre(Genre.UJAS);
            }
            if (a.equalsIgnoreCase("boevik")) {
                findableService.findMovieByGenre(Genre.BOEVIK);
            }
            if (a.equalsIgnoreCase("anime")) {
                findableService.findMovieByGenre(Genre.ANIME);
            } else {
                System.out.println("Не найден!");
            }
        }
        case 7 -> {
            System.out.println("Введите роль:");
            Scanner scanner6 = new Scanner(System.in);
            String role = scanner6.nextLine();
            findableService.findMovieByRole(role);
        }
        case 8 -> {
            System.out.println("""
                                           
                    ask - from A to Z
                    desk - from Z to A
                     Как сортировать:
                    """);
            String sort = new Scanner(System.in).nextLine();


            sortService.sortByMovieName(sort);
            System.out.println(databasa.movies);
        }
        case 9 -> {
            System.out.println("""
                                           
                    ask - (осуу тартибинде!)
                    desk -(Кемуу тартибинде)
                     Как сортировать:
                    """);
            String s = new Scanner(System.in).nextLine();
            sortService.sortByYear(s);
            System.out.println(databasa.movies);
        }
        case 10 -> {
            System.out.println("""
                                           
                    ask - from A to Z
                    desk - from Z to A
                     Как сортировать:
                    """);
            String sort = new Scanner(System.in).nextLine();
            sortService.sortByProducer(sort);
            System.out.println(databasa.movies);
        }
    }
} }catch (InputMismatchException e){
               System.err.println("Туура аргумент бер!");

           }
           }
        }}
