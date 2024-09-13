package gr11review.part1;

import java.io.*;

import java.util.Random;

public class Review8{
    public static void main(String[] args) throws IOException{

        int intNum1;
        int intNum2;
        int intNum3;
        int intTriple;
        intTriple = 0;
        Random randomNum = new Random();

        for(int intCounter = 0; intCounter < 1000 ; intCounter ++){
            intNum1 = randomNum.nextInt(8 - 0 + 1);
            intNum2 = randomNum.nextInt(8 - 0 + 1);
            intNum3 = randomNum.nextInt(8 - 0 + 1);

            System.out.println(intNum1 + " " + intNum2 + " " + intNum3);

            if((intNum1 == intNum2) && (intNum2 == intNum3)){
                intTriple ++;
            }
        } 

        System.out.println(intTriple);
        
    }
}

