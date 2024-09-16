package gr11review.part1;

import java.io.*;

/**
 * The Review2 class gives the user a statement of options which prompts the 
 * user to choose a specific joke option, then displays the joke for that option. 
 * 
 * This program uses a switch case structure to react appropriately to the option 
 * selection and outputs the appropriate joke, if an invalid option is entered it 
 * will output the default "Invalid menu option."
 * 
 * @author: R. Chan
 */
public class Review2{

    /**
     * Main method to execute the program logic.
     * 
     * @param args Command-line arguments (not used)
     * @throws IOException If there is an error during input
     */
    public static void main(String[] args) throws IOException{
        // Set up keyboard input
        BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

        // declare variable
        int intUserNum;

        // Print statement of options
        System.out.println("0 - print a joke about your hair");
        System.out.println("1 - print a joke about your feet");
        System.out.println("2 - print a joke about your clothes");
        System.out.println("3 - print a joke about your teacher");

        // Get the user's option
        System.out.print("Choose a menu option: ");
        intUserNum = Integer.parseInt(key.readLine());

        // Outputs the correct joke for each option
        switch (intUserNum){
            case 0: 
                System.out.println("Why do bees have stinky hair?");
                System.out.println("They always use honeycombs");
                break;
            case 1: 
                System.out.println("What's a foot's favourite chocolate??");
                System.out.println("Toe-blerone!");
                break;
            case 2: 
                System.out.println("What did the policeman say to the criminal who hid in a laundry basket?");
                System.out.println("You're under a vest!");
                break;
            case 3: 
                System.out.println("What is a maths teacher's favourite dessert?");
                System.out.println("Pi!");
                break;
            default: 
                System.out.println("Invalid menu option");
        }
    }
}
