package resources;

import models.Movie;

import java.util.ArrayList;

/**
 * Movie Data class.
 */
public class MovieData {
    /**
     * Generate the Initial Data for Available Movies.
     * @return Initial Data for Available Movies
     */
    public static ArrayList<Movie> generateInitialAvailableMovies() {
        ArrayList<Movie> movieList = new ArrayList<Movie>();

        movieList.add(new Movie("No Time To Die", "Action", "PG-13", 5.99));
        movieList.add(new Movie("Tenet", "Action", "PG-13", 6.99));

        movieList.add(new Movie("Jungle Cruise", "Adventure", "PG-13", 3.99));
        movieList.add(new Movie("Dune", "Adventure", "PG-13", 9.99));

        movieList.add(new Movie("The Grinch", "Comedy", "PG", 5.99));
        movieList.add(new Movie("Step Brothers", "Comedy", "R", 8.99));

        movieList.add(new Movie("Good Joe Bell", "Drama", "R", 7.99));
        movieList.add(new Movie("365 Days", "Drama", "R", 5.99));

        movieList.add(new Movie("Demon Slayer Mugen Train", "Fantasy", "R", 9.99));
        movieList.add(new Movie("Jumanji", "Fantasy", "PG-13", 4.99));

        movieList.add(new Movie("Candyman", "Horror", "R", 6.99));
        movieList.add(new Movie("The Nun", "Horror", "R", 4.99));

        movieList.add(new Movie("The Little Things", "Mystery", "R", 7.99));
        movieList.add(new Movie("No Man of God", "Mystery", "PG-13", 6.99));

        movieList.add(new Movie("Waves", "Romance", "R", 8.99));
        movieList.add(new Movie("After", "Romance", "PG-13", 9.99));

        movieList.add(new Movie("Old", "Thriller", "PG-13", 7.99));
        movieList.add(new Movie("Stillwater", "Thriller", "R", 4.99));

        movieList.add(new Movie("Avatar", "Sci-Fi", "PG-13", 9.99));
        movieList.add(new Movie("2001 A Space Odyssey", "Sci-Fi", "G", 6.99));

        return movieList;
    }

    /**
     * Generate the Initial Data for Rented Movies.
     * @return Initial Data for Rented Movies
     */
    public static ArrayList<Movie> generateInitialRentedMovies() {
        ArrayList<Movie> movieList = new ArrayList<Movie>();

        movieList.add(new Movie("Ready Player One", "Action", "PG-13", 4.99));
        movieList.add(new Movie("John Wick", "Action", "R", 8.99));

        movieList.add(new Movie("Raya and the Last Dragon", "Adventure", "PG", 4.99));
        movieList.add(new Movie("Interstellar", "Adventure", "PG-13", 6.99));

        movieList.add(new Movie("The Hangover", "Comedy", "R", 5.99));
        movieList.add(new Movie("Dumb and Dumber", "Comedy", "PG-13", 6.99));

        movieList.add(new Movie("The King", "Drama", "R", 5.99));
        movieList.add(new Movie("The Big Short", "Drama", "R", 6.99));

        movieList.add(new Movie("Harry Potter and the Philosophers Stone", "Fantasy", "PG", 7.99));
        movieList.add(new Movie("Harry Potter and the Chamber of Secrets", "Fantasy", "PG", 7.99));

        movieList.add(new Movie("Get Out", "Horror", "R", 5.99));
        movieList.add(new Movie("Jigsaw", "Horror", "R", 3.99));

        movieList.add(new Movie("Murder Mystery", "Mystery", "PG-13", 4.99));
        movieList.add(new Movie("Detective Pikachu", "Mystery", "PG", 9.99));

        movieList.add(new Movie("Fifty Shades of Gray", "Romance", "R", 6.99));
        movieList.add(new Movie("Your Name", "Romance", "PG", 9.99));

        movieList.add(new Movie("Last Night in Soho", "Thriller", "R", 6.99));
        movieList.add(new Movie("Extraction", "Thriller", "R", 5.99));

        movieList.add(new Movie("Star Wars Return of the Jedi", "Sci-Fi", "PG", 8.99));
        movieList.add(new Movie("Star Wars The Emperor Strikes Back", "Sci-Fi", "PG", 8.99));

        return movieList;
    }
}
