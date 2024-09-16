package gr11review.part1;

import java.io.*;

/**
 * The Review3 class prints the odd numbers from 20 to 100 
 * and prints the numbers from 29 to 2 in decreasing order.
 * 
 * This program uses a loop to output all the odd numbers from 20 to 100 
 * and then uses another loop to output all the numbers from 29 to 2 in 
 * decreasing order.
 * 
 * @author: R. Chan
 */
public class Review3{

    /**
     * Main method to execute the program logic.
     * 
     * @param args Command-line arguments (not used)
     * @throws IOException If there is an error during input
     */
    public static void main(String[] args) throws IOException{
        // Declare and initialize variables
        int intOddNumCounter;
        intOddNumCounter = 19;
        int intDecrease;
        intDecrease = 30;

        // Prints odd numbers from 20 to 100
        for(int intCounter = 0; intCounter <= 39; intCounter ++){
            intOddNumCounter = intOddNumCounter + 2;
            System.out.println(intOddNumCounter);
        }

        // Outputs blank line to separate loops
        System.out.println("");

        // Prints numbers from 29 to 2 in decreasing order
        for(int intCounter = 0; intCounter <= 27; intCounter ++){
            intDecrease = intDecrease - 1;
            System.out.println(intDecrease);
        }

    }
}
