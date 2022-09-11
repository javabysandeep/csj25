package oops.polymorphism;

public class InheritanceMethodOverloading {
    public static void main(String[] args) {
        MovieServiceImpl movieService = new MovieServiceImpl();
        movieService.addMovie();
        movieService.addMovie("Java");
    }
}
