package gr11review.part1;

import java.io.*;

public class Review5{
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
            dblCurrentAmount = dblCurrentAmount + dblYearlyInvt; // To add yearly investment
            dblYearlyInterest = dblCurrentAmount * dblInterestRate; // To calculate interest for each year
            dblCurrentAmount = dblCurrentAmount + dblYearlyInterest; // Get new amount
            intNumOfYears ++;
        }

        // Output the number of years
        System.out.println("The target amount will be earned in " + intNumOfYears + " years.");
    }
}
