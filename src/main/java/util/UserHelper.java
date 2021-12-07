package util;

import models.Movie;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * User Helper Methods class.
 */
public class UserHelper {

    /**
     * Prints the given Array List of Movies to the console.
     * @param movieList The Array List of Movies to be printed
     */
    public static void printMovieList(ArrayList<Movie> movieList) {
        // For each element in the Array List print the index and the element
        for (int i = 0; i < movieList.size(); i++) {
            System.out.println((i + 1) + ". " + movieList.get(i).getTitle());
        }
    }

    /**
     * Displays the options and waits for the user to enter a valid options
     * @param options The array of options
     * @return The index of the selected option
     */
    public static int displayOptionsAndWaitForValidOption(String[] options) {
        // Initialize Scanner and defaults the option variable
        Scanner scanner = new Scanner(System.in);
        int option = -1;

        // Prints the options
        printOptions(options);

        // An infinite to ensure the user selects a valid option
        do {
            // Reads the user input
            String input = scanner.nextLine();

            // Tries to parse the input to an integer
            try {
                option = Integer.parseInt(input);

                // If the option if not negative or outside the scope of the options, return that option as it is valid and ends the loop
                if (option >= 0 && option <= options.length) {
                    return option;
                }

                // Prints the options again as the input was not valid
                printOptions(options);
            } catch(NumberFormatException e) {
                // Catches any parsing error and re-prompts the user
                printOptions(options);
            }
        } while (true);
    }

    /**
     * Prints the given options to the console and prompts the user
     * @param options The list of options
     */
    public static void printOptions(String[] options) {
        printArray(options);
        System.out.println("Enter the number of your selected option:");
    }

    /**
     * Prints the given array to the console beginning at 1.
     * @param array The array to be printed
     */
    public static void printArray(String[] array) {
        // For each element in the array print the index and the element
        for (int i = 0; i < array.length; i++) {
            System.out.println((i + 1) + ". " + array[i]);
        }
    }
}
