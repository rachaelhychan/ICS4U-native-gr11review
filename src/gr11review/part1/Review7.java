package gr11review.part1;

import java.io.*;

public class Review7{
    public static void main(String[] args) throws IOException{
        // Set up keyboard input
        BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

        // Declare and initialize variables
        String theSentence;
        int intNumOfSpaces;
        int intNumOfA;
        intNumOfSpaces = 0;
        intNumOfA = 0;
        
        // Set up place for user to enter the sentence
        System.out.print("");
        theSentence = key.readLine();

        // Output sentence length
        System.out.println("There are " + theSentence.length() + " characters in the sentence.");

        // Loop through characters in the sentence to count # of spaces
        for(int intIndex = 0; intIndex < theSentence.length(); intIndex ++){
            if (theSentence.charAt(intIndex) == ' '){
                intNumOfSpaces ++;
            }
        }

        // Output number of spaces
        System.out.println("There are " + intNumOfSpaces + " spaces in the sentence.");

        // Loop through the characters in the sentence to count # of letter a
        for(int intIndex = 0; intIndex < theSentence.length(); intIndex ++){
            if (theSentence.charAt(intIndex) == 'a'){
                intNumOfA ++;
            }
        }

        // Output number of letter a
        System.out.println("There are " + intNumOfA + " letter a in the sentence.");

        // Find the number of odd number characters in the sentence and output that # of dashes
        if(theSentence.length() % 2 == 0){ // determine if sentence length is divisible by 2 (even)
            for(int intCounter = 0; intCounter < ((theSentence.length()) / 2); intCounter++){
                System.out.print("-");
            }
        }else{
            for(int intCounter = 0; intCounter < ((theSentence.length()) / 2) + 1; intCounter++){ // add one to account for when sentence has odd # of characters
                System.out.print("-");
            }
        }
    }
}
