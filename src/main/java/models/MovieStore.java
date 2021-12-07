package models;

import resources.MovieData;
import resources.MovieResources;
import util.UserHelper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Movie Store Class.
 */
public class MovieStore {
    /**
     * The Movie Inventory.
     */
    private MovieInventory movieInventory;

    /**
     * The Scanner.
     */
    private Scanner scanner;

    /**
     * Creates an instance of the MovieStore class
     */
    public MovieStore() {
        this.movieInventory = new MovieInventory();

        // Set initial Available and Rented Movies
        movieInventory.setAvailableMovieInventory(MovieData.generateInitialAvailableMovies());
        movieInventory.setRentedMovieList(MovieData.generateInitialRentedMovies());

        this.scanner = new Scanner(System.in);
    }

    /**
     * Main Menu Method that drives the Movie Store Application.
     */
    private void mainMenu() {
        System.out.println("=============================");
        System.out.println("What would you like to do?");
        int option = UserHelper.displayOptionsAndWaitForValidOption(MovieResources.MAIN_MENU_OPTIONS);

        switch(option) {
            case 1:
                rentMovie();
                mainMenu();
                break;
            case 2:
                System.out.println("** Available Movie List **");
                UserHelper.printMovieList(movieInventory.getAvailableMovieInventory());
                mainMenu();
                break;
            case 3:
                System.out.println("** Rented Movie List **");
                UserHelper.printMovieList(movieInventory.getRentedMovieList());
                mainMenu();
                break;
            case 4:
                listMoviesByGenre();
                mainMenu();
                break;
            case 5:
                checkMoviePrice();
                mainMenu();
                break;
            case 6:
                checkMovieGenre();
                mainMenu();
                break;
            case 7:
                checkMovieRating();
                mainMenu();
                break;
            case 8:
                System.out.println("Thank you for shopping at the Movie Store! Please come again.");
                break;
            default:
                System.out.println("Something went wrong please try again.");
                mainMenu();
                break;
        }
    }

    /**
     * Prompt User to enter a Movie to rent.
     * @return Movie Title if available, or 0 if exited Rent Movie Dialog.
     */
    private String rentMovie() {
        String movie = "";
        do {
            System.out.println("** Available Movie List **");
            UserHelper.printMovieList(movieInventory.getAvailableMovieInventory());
            System.out.println("Which movie would you like to rent? (Enter 0 to stop Renting Movie)");

            // Wait for user input
            movie = scanner.nextLine();

            // Exit Rent Movie Dialog
            if (movie.equals("0")) {
                return "0";
            }

            // If movie found, remove from available list and add to rented list.
            for (Movie mov: movieInventory.getAvailableMovieInventory()) {
                if (mov.getTitle().equalsIgnoreCase(movie)) {
                    movieInventory.removeMovieFromAvailableInventory(mov);
                    movieInventory.addMovieToRentedList(mov);

                    System.out.println("You have rented: " + mov.getTitle());
                    return movie;
                }
            }

            System.out.println("Movie " + movie + " Not Available. Please choose another movie.");
        } while (true);
    }

    /**
     * List Movies By Genre
     * @return Genre, or 0 if exited Genre List Dialog
     */
    private String listMoviesByGenre() {
        String genre = "";
        do {
            // Give list of Available Genres and Give User Input
            System.out.println("** Available Movie Genres **");
            UserHelper.printArray(MovieResources.MOVIE_GENRES);

            System.out.println("What Genre are you looking for? (Enter 0 to stop Renting Movie)");

            genre = scanner.nextLine();

            // Exit Genre List Dialog
            if (genre.equals("0")) {
                return "0";
            }

            // Check if input Genre is valid and display list of movies for the Genre, if available.
            ArrayList<Movie> list = new ArrayList<Movie>();
            if (Arrays.asList(MovieResources.MOVIE_GENRES).contains(genre)) {
                for (Movie mov: movieInventory.getAvailableMovieInventory()) {
                    if (mov.getGenre().equalsIgnoreCase(genre)) {
                        list.add(mov);
                    }
                }

                if (list.size() == 0) {
                    System.out.println("No Movies Available for " + genre + " genre");
                }
                else {
                    UserHelper.printMovieList(list);
                }

                return genre;
            }

            System.out.println("Movie Genre " + genre + " not valid. Please enter another Genre.");
        } while (true);
    }

    /**
     * Check the Price of a Movie to rent.
     * @return Movie, or 0 if exited Checking Prices dialog.
     */
    private String checkMoviePrice() {
        String movie = "";
        do {
            System.out.println("** Available Movie List **");
            UserHelper.printMovieList(movieInventory.getAvailableMovieInventory());
            System.out.println("Which movie would you like to check the price for? (Enter 0 to stop Checking Prices)");

            // Wait for user input
            movie = scanner.nextLine();

            // Exit Check Prices Dialog
            if (movie.equals("0")) {
                return "0";
            }

            // If movie found, print the Price of the movie
            for (Movie mov: movieInventory.getAvailableMovieInventory()) {
                if (mov.getTitle().equalsIgnoreCase(movie)) {
                    System.out.println("Price to rent Movie " + mov.getTitle() + " is " + mov.getPrice());
                    return movie;
                }
            }

            System.out.println("Movie " + movie + " Not Available. Please choose another movie.");
        } while (true);
    }

    /**
     * Check the Genre of a Movie.
     * @return Movie, or 0 if exited Checking Genre dialog.
     */
    private String checkMovieGenre() {
        String movie = "";
        do {
            System.out.println("** Available Movie List **");
            UserHelper.printMovieList(movieInventory.getAvailableMovieInventory());
            System.out.println("Which movie would you like to check the genre for? (Enter 0 to stop Checking Genres)");

            // Wait for user input
            movie = scanner.nextLine();

            // Exit Check Genres Dialog
            if (movie.equals("0")) {
                return "0";
            }

            // If movie found, print the Genre of the movie
            for (Movie mov: movieInventory.getAvailableMovieInventory()) {
                if (mov.getTitle().equalsIgnoreCase(movie)) {
                    System.out.println("Genre of Movie " + mov.getTitle() + " is " + mov.getGenre());
                    return movie;
                }
            }

            System.out.println("Movie " + movie + " Not Available. Please choose another movie.");
        } while (true);
    }

    /**
     * Check the Rating of a Movie.
     * @return Movie, or 0 if exited Checking Rating dialog.
     */
    private String checkMovieRating() {
        String movie = "";
        do {
            System.out.println("** Available Movie List **");
            UserHelper.printMovieList(movieInventory.getAvailableMovieInventory());
            System.out.println("Which movie would you like to check the rating for? (Enter 0 to stop Checking Ratings)");

            // Wait for user input
            movie = scanner.nextLine();

            // Exit Check Ratings Dialog
            if (movie.equals("0")) {
                return "0";
            }

            // If movie found, print the Rating of the movie
            for (Movie mov: movieInventory.getAvailableMovieInventory()) {
                if (mov.getTitle().equalsIgnoreCase(movie)) {
                    System.out.println("Rating of Movie " + mov.getTitle() + " is " + mov.getRating());
                    return movie;
                }
            }

            System.out.println("Movie " + movie + " Not Available. Please choose another movie.");
        } while (true);
    }

    /**
     * The main method and console app
     * @param args The list of arguments
     */
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();

        System.out.println("*** Welcome to the Movie Store ***");

        movieStore.mainMenu();

    }
}
