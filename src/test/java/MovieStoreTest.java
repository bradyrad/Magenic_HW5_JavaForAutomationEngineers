import models.Movie;
import models.MovieInventory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;

/**
 * Test Movie Store Methods.
 */
public class MovieStoreTest {
    /**
     * Movie
     */
    private Movie movie;

    /**
     * Movie 2
     */
    private Movie movie2;

    /**
     * Initialize Movie Test Data
     */
    @BeforeTest
    public void testInitialize() {
        movie = new Movie("The Dark Night", "Action", "PG-13", 7.99);
        movie2 = new Movie("Spirited Away", "Fantasy", "PG", 9.99);
    }

    /**
     * Test Getter Methods in Movie class
     */
    @Test
    public void testGetMovieData() {
        Assert.assertEquals(movie.getTitle(), "The Dark Night");
        Assert.assertEquals(movie.getGenre(), "Action");
        Assert.assertEquals(movie.getRating(), "PG-13");
        Assert.assertEquals(movie.getPrice(), 7.99);
    }

    /**
     * Test Add Movie to Available List.
     */
    @Test
    public void testAddMovieToAvailableList() {
        MovieInventory movieInventory = new MovieInventory();
        movieInventory.addMovieToAvailableInventory(movie);

        Assert.assertEquals(movieInventory.getAvailableMovieInventory().size(), 1);
        Assert.assertEquals(movieInventory.getAvailableMovieInventory().get(0).getTitle(), "The Dark Night");
    }

    /**
     * Test Add Movie to Rented List.
     */
    @Test
    public void testAddMovieToRentedList() {
        MovieInventory movieInventory = new MovieInventory();
        movieInventory.addMovieToRentedList(movie2);

        Assert.assertEquals(movieInventory.getRentedMovieList().size(), 1);
        Assert.assertEquals(movieInventory.getRentedMovieList().get(0).getTitle(), "Spirited Away");
    }

    /**
     * Test Remove Movie to Available List.
     */
    @Test
    public void testRemoveMovieFromAvailableList() {
        MovieInventory movieInventory = new MovieInventory();

        ArrayList<Movie> movieList = new ArrayList<Movie>();

        movieList.add(movie);
        movieList.add(movie2);
        movieInventory.setAvailableMovieInventory(movieList);

        movieInventory.removeMovieFromAvailableInventory(movie);

        Assert.assertEquals(movieInventory.getAvailableMovieInventory().size(), 1);
        Assert.assertEquals(movieInventory.getAvailableMovieInventory().get(0).getTitle(), "Spirited Away");
    }

    /**
     * Test Remove Movie to Rented List.
     */
    @Test
    public void testRemoveMovieFromRentedList() {
        MovieInventory movieInventory = new MovieInventory();

        ArrayList<Movie> movieList = new ArrayList<Movie>();

        movieList.add(movie);
        movieList.add(movie2);
        movieInventory.setRentedMovieList(movieList);

        movieInventory.removeMovieFromRentedList(movie);

        Assert.assertEquals(movieInventory.getRentedMovieList().size(), 1);
        Assert.assertEquals(movieInventory.getRentedMovieList().get(0).getTitle(), "Spirited Away");
    }
}
