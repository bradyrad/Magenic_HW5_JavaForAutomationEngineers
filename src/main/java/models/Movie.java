package models;

/**
 * Movie Class.
 */
public class Movie implements Comparable<Movie> {
    /**
     * Title of the Movie.
     */
    private String title;

    /**
     * Genre of the Movie.
     */
    private String genre;

    /**
     * Rating of the Movie.
     */
    private String rating;

    /**
     * Price of the Movie.
     */
    private double price;

    /**
     * Creates an instance of the Movie class
     * @param title Title of the Movie
     * @param genre Genre of the Movie
     * @param rating Rating of the Movie
     * @param price Price of the Movie
     */
    public Movie(String title, String genre, String rating, double price) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
        this.price = price;
    }

    /**
     * Get the Title of the Movie.
     * @return Title of the Movie.
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Get the Genre of the Movie.
     * @return Genre of the Movie.
     */
    public String getGenre() {
        return this.genre;
    }

    /**
     * Get the Rating of the Movie.
     * @return Rating of the Movie.
     */
    public String getRating() {
        return this.rating;
    }

    /**
     * Get the Price of the Movie.
     * @return Price of the Movie.
     */
    public double getPrice() {
        return this.price;
    }

    /**
     * Compares 2 movies and returns if the Movie title matches the given Movie.
     * @param movie Movie to compare to this Movie
     * @return 0 if the songs are equal and other numbers if not
     */
    @Override
    public int compareTo(Movie movie) {
        return this.getTitle().compareTo(movie.getTitle());
    }

    /**
     * Determines if this Movie object is equal to the provided object
     * @param obj The compared object
     * @return True if the Movies are the same, and false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        // Checks if 'obj' is null or can't be assigned to a Movie class
        if (obj == null || !Movie.class.isAssignableFrom(obj.getClass())) {
            return false;
        }

        // Casts the object as a Movie object
        final Movie otherSong = (Movie)obj;

        // Checks if the name and artist are the same
        if (this.getTitle().equals(otherSong.getTitle())) {
            return true;
        }

        // Returns false, as a catch all
        return false;
    }
}
