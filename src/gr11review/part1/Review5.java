package gr11review.part1;

import java.io.*;

/**
 * The Review5 class prompts the user to enter a yearly invested amount, 
 * compound interest rate, and a target amount, then calculates and displays 
 * the number of years it takes to reach the target amount. 
 * 
 * This program uses a while loop to calculate how much money the user 
 * has each year based on the yearly invested amount, compound interest rate, 
 * and target amount taken from the user input in the console. This while loop 
 * repeats until the target amount is reached, then outputs the number of years it took.
 * 
 * @author: R. Chan
 */

public class Review5{

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
        double dblYearlyInvt;
        double dblInterestRate;
        double dblTargetAmount;
        int intNumOfYears;
        intNumOfYears = 0;
        double dblCurrentAmount = 0;
        double dblYearlyInterest;

        // Get user's yearly invested amount
        System.out.print("Enter the yearly invested amount: ");
        dblYearlyInvt = Double.parseDouble(key.readLine());

        // Get user's compound interest rate
        System.out.print("Enter the compound interest rate: ");
        dblInterestRate = Double.parseDouble(key.readLine()) / 100;

        // Get user's target amount
        System.out.print("Enter the target amount: ");
        dblTargetAmount = Double.parseDouble(key.readLine());

        // Calculate the number of years for target amount to be reached
        while(dblCurrentAmount < dblTargetAmount){
            dblCurrentAmount = dblCurrentAmount + dblYearlyInvt; 
            dblYearlyInterest = dblCurrentAmount * dblInterestRate;
            dblCurrentAmount = dblCurrentAmount + dblYearlyInterest; 
            intNumOfYears ++;
        }

        // Output the number of years
        System.out.println("The target amount will be earned in " + intNumOfYears + " years.");
    }
}
