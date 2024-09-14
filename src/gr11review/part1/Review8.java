package gr11review.part1;

import java.io.*;

import java.util.Random;

public class Review8{
    public static void main(String[] args) throws IOException{
        // Declare and initialize variables
        int intNum1;
        int intNum2;
        int intNum3;
        int intTriple;
        intTriple = 0;

        // Declare random object
        Random randomNum = new Random();

        // To generate and output three random numbers from 0 to 8 1000 times and track # of triples
        for(int intCounter = 0; intCounter < 1000 ; intCounter ++){
            intNum1 = randomNum.nextInt(8 - 0 + 1);
            intNum2 = randomNum.nextInt(8 - 0 + 1);
            intNum3 = randomNum.nextInt(8 - 0 + 1);

            System.out.println(intNum1 + " " + intNum2 + " " + intNum3);

            // To test if all three numbers are the same
            if((intNum1 == intNum2) && (intNum2 == intNum3)){
                intTriple ++;
            }
        } 

        // Output # of triples 
        System.out.println(intTriple);
        
    }
}

