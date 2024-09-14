package gr11review.part1;

import java.io.*;

public class Review7{
    public static void main(String[] args) throws IOException{
        // Set up keyboard input
        BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

        String theSentence;
        int intNumOfSpaces;
        int intNumOfA;
        intNumOfSpaces = 0;
        intNumOfA = 0;
        
        System.out.print("");
        theSentence = key.readLine();

        System.out.println("There are " + theSentence.length() + " characters in the sentence.");

        for(int intIndex = 0; intIndex < theSentence.length(); intIndex ++){
            if (theSentence.charAt(intIndex) == ' '){
                intNumOfSpaces ++;
            }
        }

        System.out.println("There are " + intNumOfSpaces + " spaces in the sentence.");

        for(int intIndex = 0; intIndex < theSentence.length(); intIndex ++){
            if (theSentence.charAt(intIndex) == 'a'){ // ask if it includes capital A
                intNumOfA ++;
            }
        }

        System.out.println("There are " + intNumOfA + " letter a in the sentence.");

        if(theSentence.length() % 2 == 0){
            for(int intCounter = 0; intCounter < ((theSentence.length()) / 2); intCounter++){
                System.out.print("-");
            }
        }else{
            for(int intCounter = 0; intCounter < ((theSentence.length()) / 2) + 1; intCounter++){
                System.out.print("-");
            }
        }
    }
}
