package gr11review.part1;

import java.io.*;

import java.text.*;

/**
 * The Review6 class prompts the user to enter the prices for each of the items they 
 * have until the user enters zero, then the programcalculates and outputs the subtotal,
 * tax, and grand total of the items.
 * 
 * This program loops a loop that takes the item prices from the user input in the console
 * and adds them together. The loop is looped until the user enters 0 as the price of an item, 
 * then the subtotal is outputted, the tax is calculated at 13% of the subtotal, 
 * and then the grand total is outputted.
 * 
 * @author: R. Chan
 */

public class Review6{

    /**
     * Main method to execute the program logic.
     * 
     * @param args Command-line arguments (not used)
     * @throws IOException If there is an error during input
     */
    public static void main(String[] args) throws IOException{
        // Set up keyboard input
        BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
        
        // Set up number format for currency
        NumberFormat numberFormat = new DecimalFormat("#,##0.00");

        // Declare and initialize variables
        double dblCurrentItem;
        dblCurrentItem = 1;
        double dblSubtotal;
        dblSubtotal = 0;
        double dblTax;
        double dblTotal;

        // Get user input for the price of each item and add them together
        while(!(dblCurrentItem == 0)){
            System.out.print("Enter the price for an item: ");
            dblCurrentItem = Double.parseDouble(key.readLine());
            dblSubtotal = dblSubtotal + dblCurrentItem;
        }

        // Output subtotal
        System.out.println("Subtotal: $" + numberFormat.format(dblSubtotal));

        // Calculate and output tax amount
        dblTax = dblSubtotal * 0.13;
        System.out.println("Tax: $" + numberFormat.format(dblTax));

        // Calculate and output final total 
        dblTotal = dblSubtotal + dblTax;
        System.out.println("Total: $" + numberFormat.format(dblTotal));
    }
}

