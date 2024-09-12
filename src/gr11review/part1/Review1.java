package gr11review.part1;

import java.io.*;

public class Review1{
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