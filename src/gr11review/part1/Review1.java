package gr11review.part1;

import java.io.*;

/**
 * The Review1 class prompts the user to enter a month number and day, then 
 * calculates and outputs the day number of the year for that date assuming 
 * that it is not a leap year.
 * 
 * This program uses an array to store the number of days in each month and reads 
 * user input from the console to calculate the total number of days from the start 
 * of the year up to the given date.
 * 
 * @author: R. Chan
 */
public class Review1{

    /**
     * Main method to execute the program logic.
     * 
     * @param args Command-line arguments (not used)
     * @throws IOException If there is an error during input
     */
    public static void main(String[] args) throws IOException{
        // Set up keyboard input
        BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

        // Declare and initialize variables
        int[] intDaysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int intMonth;
        int intDay;
        int intNumOfDays;
        int intFullMonthDays;
        intFullMonthDays = 0;

        // Ask user for month number
        System.out.print("Enter the month number: ");
        intMonth = Integer.parseInt(key.readLine());

        // ASk user for day number
        System.out.print("Enter the day number: ");
        intDay = Integer.parseInt(key.readLine());

        // Loop through array intDaysInMonth to get the number of full month days
        for(int intIndex = 0; intIndex < intMonth-1; intIndex++){ 
            intFullMonthDays = intFullMonthDays + intDaysInMonth[intIndex];
        }

        // Sum up total number of days
        intNumOfDays = intFullMonthDays + intDay;

        // Output the total number of days
        System.out.println(intNumOfDays);
    }
}