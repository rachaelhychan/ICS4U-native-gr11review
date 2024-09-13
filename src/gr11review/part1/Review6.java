package gr11review.part1;

import java.io.*;

import java.text.*;

public class Review6{
    public static void main(String[] args) throws IOException{
        // Set up keyboard input
        BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
        
        // Set up number format for currency
        NumberFormat numberFormat = new DecimalFormat("#,###.00");

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

