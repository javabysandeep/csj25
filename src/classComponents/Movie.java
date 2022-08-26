package classComponents;

public class Movie {
    // These are called as instance variables which will store movie object specific information
    int movieId;
    String movieName;
    int movieDuration;

    public static void main(String[] args) {
        Movie movie = new Movie();
        System.out.println(movie);
        // accessing the instance variables
        System.out.println("Movie id "+movie.movieId);
        System.out.println("Movie Name "+movie.movieName);
        System.out.println("Movie Duration "+movie.movieDuration);
    }
}
