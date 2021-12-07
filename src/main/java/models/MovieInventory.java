package models;

import java.util.ArrayList;

/**
 * Movie Inventory class.
 */
public class MovieInventory {
    /**
     * List of Available Movies in the store.
     */
    private ArrayList<Movie> availableMovieInventory;

    /**
     * List of already Rented Movies from the store.
     */
    private ArrayList<Movie> rentedMovieList;

    /**
     * Creates an instance of the MovieInventory class
     */
    public MovieInventory() {
        this.availableMovieInventory = new ArrayList<Movie>();

        this.rentedMovieList = new ArrayList<Movie>();
    }

    /**
     * Gets the Available Movie Inventory.
     * @return Available Movie Inventory.
     */
    public ArrayList<Movie> getAvailableMovieInventory() {
        return this.availableMovieInventory;
    }

    /**
     * Gets the currently Rented Movie List.
     * @return Rented Movie List.
     */
    public ArrayList<Movie> getRentedMovieList() {
        return rentedMovieList;
    }

    /**
     * Sets the Available Movie Inventory List.
     * @param availableMovieInventory Movie Inventory List to set.
     */
    public void setAvailableMovieInventory(ArrayList<Movie> availableMovieInventory) {
        this.availableMovieInventory = availableMovieInventory;
    }

    /**
     * Sets the Rented Movie List.
     * @param rentedMovieList Rented Movie List to set.
     */
    public void setRentedMovieList(ArrayList<Movie> rentedMovieList) {
        this.rentedMovieList = rentedMovieList;
    }

    /**
     * Add Movie to Available Inventory
     * @param movie Movie to add to Inventory
     */
    public void addMovieToAvailableInventory(Movie movie) {
        this.availableMovieInventory.add(movie);
    }

    /**
     * Remove Movie from Available Inventory, if it exists.
     * @param movie Movie to Remove from Inventory
     */
    public void removeMovieFromAvailableInventory(Movie movie) {
        for (Movie m : this.availableMovieInventory) {
            if (m.equals(movie)) {
                this.availableMovieInventory.remove(m);

                // Only remove one copy of the movie from the list.
                break;
            }
        }
    }

    /**
     * Add Move to Rented Movie List.
     * @param movie Movie to Add to Inventory
     */
    public void addMovieToRentedList(Movie movie) {
        this.rentedMovieList.add(movie);
    }

    /**
     * Remove Movie from Rented Movie List.
     * @param movie Movie to Remove from Rented List.
     */
    public void removeMovieFromRentedList(Movie movie) {
        for (Movie m : this.rentedMovieList) {
            if (m.equals(movie)) {
                this.rentedMovieList.remove(m);

                // Only remove one copy of the movie from the list.
                break;
            }
        }
    }
}
