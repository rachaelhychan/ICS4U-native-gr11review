package gr11review.part1;

import java.io.*;

import java.text.*;

/**
 * The Review4 class prompts the user to enter how many items they would like to 
 * purchase, then gets the prices for each of the items, then calculates and 
 * outputs the subtotal, tax, and grand total of the items.
 * 
 * This program asks the user for the number of items, then loops a loop for the number
 * of items the user has. This loop takes the item prices and adds them together, 
 * then the subtotal is outputted, the tax is calculated at 13% of the subtotal, 
 * and then the grand total is outputted.
 * 
 * @author: R. Chan
 */

public class Review4{

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
        int intNumOfItems;
        double dblCurrentItem;
        double dblSubtotal;
        dblSubtotal = 0;
        double dblTax;
        double dblTotal;

        // Get user input for number of items
        System.out.print("How many items do you want to buy? ");
        intNumOfItems = Integer.parseInt(key.readLine());

        // Get user input for the price of each item and add them together
        for(int intCounter = 1; intCounter <= intNumOfItems; intCounter ++){
            System.out.print("Enter the price for item " + intCounter + ": ");
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
