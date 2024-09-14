package gr11review.part1;

import java.io.*;

public class Review3{
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
