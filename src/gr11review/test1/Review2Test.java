package gr11review.test1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;

import org.junit.jupiter.api.Test;
import gr11review.part1.*;
import java.io.*;
import java.util.Random;

public class Review2Test {

    private final InputStream sysInBackup = System.in; // backup System.in to restore it later
    private final PrintStream sysOutBackup = System.out; // backup System.out to restore later
    private final String sep = System.getProperty("line.separator");

    private final String outputMenu = "0 - print a joke about your hair" + sep +
    "1 - print a joke about your feet" + sep +
    "2 - print a joke about your clothes" + sep + 
    "3 - print a joke about your teacher" + sep +
    "Choose a menu option: ";
    

    @After
    public void restoreStreams() {
         // restore the backups
         System.setIn(sysInBackup);
         System.setOut(sysOutBackup);
    }

    @Test
    void testMain0() throws Exception {

        Random rand = new Random();
        int randchoice = rand.nextInt(4);
        
        // Set the input and output stream expected values
        String simulatedUserInput = Integer.toString(randchoice) + sep;
        ByteArrayInputStream in = new ByteArrayInputStream(simulatedUserInput.getBytes());

        // Set the output stream expected value
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        String noJoke = outputMenu + "" + sep;

        // Set the System in/out to the simulated input/output
        System.setIn(in);
        System.setOut(new PrintStream(out));
   
        // run the comparison
        Review2.main(null);
        assertEquals(true, out.toString().length() >  noJoke.length());
    }

    @Test
    /**
     * Test an invalid menu option
     * @throws Exception
     */
    void testInvalidOption() throws Exception {
        
        // Set the input and output stream expected values
        String simulatedUserInput = "4" + sep;
        ByteArrayInputStream in = new ByteArrayInputStream(simulatedUserInput.getBytes());

        // Set the output stream expected value
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        String expectedOutput = outputMenu + "Invalid menu option" + sep;

        // Set the System in/out to the simulated input/output
        System.setIn(in);
        System.setOut(new PrintStream(out));
   
        // run the comparison
        Review2.main(null);
        assertEquals(expectedOutput.trim(), out.toString().trim());
    }
}
