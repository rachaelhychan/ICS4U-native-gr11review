package gr11review.part1;

import java.io.*;

import java.text.*;

public class Review4{
    public static void main(String[] args) throws IOException{
        BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
        
        NumberFormat numberFormat = new DecimalFormat("#,###.00");

        int intNumOfItems;
        double dblCurrentItem;
        double dblSubtotal;
        dblSubtotal = 0;
        double dblTax;
        double dblTotal;

        System.out.print("How many items do you want to buy? ");
        intNumOfItems = Integer.parseInt(key.readLine());

        for(int intCounter = 1; intCounter <= intNumOfItems; intCounter ++){
            System.out.print("Enter the price for item " + intCounter + ": ");
            dblCurrentItem = Double.parseDouble(key.readLine());
            dblSubtotal = dblSubtotal + dblCurrentItem;
        }

        System.out.println("Subtotal: $" + numberFormat.format(dblSubtotal));

        dblTax = dblSubtotal * 0.13;
        System.out.println("Tax: $" + numberFormat.format(dblTax));

        dblTotal = dblSubtotal + dblTax;
        System.out.println("Total: $" + numberFormat.format(dblTotal));

        


    }
}
