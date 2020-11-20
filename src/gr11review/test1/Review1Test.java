package gr11review.test1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;

import org.junit.jupiter.api.Test;
import gr11review.part1.*;
import java.io.*;


public class Review1Test {


    private final InputStream sysInBackup = System.in; // backup System.in to restore it later
    private final PrintStream sysOutBackup = System.out; // backup System.out to restore later
    private final String sep = System.getProperty("line.separator");

    private final String[][]testInputs = {
        {"1","1"},
        {"12", "31"},
        {"2", "1"},
        {"3", "1"},
        {"4", "14"}
    };

    private final String[] testOutputs = {
        "1",
        "365",
        "32",
        "60",
        "104"
    };

    /**
     * Builds the simulatted input string with separators
     * @param inputList
     * @return
     */
    private String getFormattedInput(String[] inputList){
        String inputString = "";

        for (int i = 0; i < inputList.length - 1; i++){
            inputString += inputList[i];
            inputString += sep;
        }
        inputString += inputList[inputList.length - 1]; // add the last value without the separator
        return inputString;
    }


    private String getFormattedOutput(String output){
        return "Enter the month number: " + "Enter the day number: " + output + sep;
    }


    @After
    public void restoreStreams() {
         // restore the backups
         System.setIn(sysInBackup);
         System.setOut(sysOutBackup);
    }



    @Test
    void testMain0() throws Exception {
        
        // Set the input and output stream expected values
        String simulatedUserInput = getFormattedInput(testInputs[0]);
        ByteArrayInputStream in = new ByteArrayInputStream(simulatedUserInput.getBytes());

        // Set the output stream expected value
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        String expectedOutput = getFormattedOutput(testOutputs[0]);

        // Set the System in/out to the simulated input/output
        System.setIn(in);
        System.setOut(new PrintStream(out));
   
        // run the comparison
        Review1.main(null);
        assertEquals(expectedOutput, out.toString(), "Failed testMain0");
    }

    @Test
    void testMain1() throws Exception {
        
        // Set the input and output stream expected values
        String simulatedUserInput = getFormattedInput(testInputs[1]);
        ByteArrayInputStream in = new ByteArrayInputStream(simulatedUserInput.getBytes());

        // Set the output stream expected value
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        String expectedOutput = getFormattedOutput(testOutputs[1]);

        // Set the System in/out to the simulated input/output
        System.setIn(in);
        System.setOut(new PrintStream(out));
   
        // run the comparison
        Review1.main(null);
        assertEquals(expectedOutput, out.toString(), "Failed testMain1");
    }
    
    @Test
    void testMain2() throws Exception {
        
        // Set the input and output stream expected values
        String simulatedUserInput = getFormattedInput(testInputs[2]);
        ByteArrayInputStream in = new ByteArrayInputStream(simulatedUserInput.getBytes());

        // Set the output stream expected value
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        String expectedOutput = getFormattedOutput(testOutputs[2]);

        // Set the System in/out to the simulated input/output
        System.setIn(in);
        System.setOut(new PrintStream(out));
   
        // run the comparison
        Review1.main(null);
        assertEquals(expectedOutput, out.toString(), "Failed testMain2");
    }


    @Test
    void testMain3() throws Exception {
        
        // Set the input and output stream expected values
        String simulatedUserInput = getFormattedInput(testInputs[3]);
        ByteArrayInputStream in = new ByteArrayInputStream(simulatedUserInput.getBytes());

        // Set the output stream expected value
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        String expectedOutput = getFormattedOutput(testOutputs[3]);

        // Set the System in/out to the simulated input/output
        System.setIn(in);
        System.setOut(new PrintStream(out));
   
        // run the comparison
        Review1.main(null);
        assertEquals(expectedOutput, out.toString(), "Failed testMain3");
    }

    @Test
    void testMain4() throws Exception {
        
        // Set the input and output stream expected values
        String simulatedUserInput = getFormattedInput(testInputs[4]);
        ByteArrayInputStream in = new ByteArrayInputStream(simulatedUserInput.getBytes());

        // Set the output stream expected value
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        String expectedOutput = getFormattedOutput(testOutputs[4]);

        // Set the System in/out to the simulated input/output
        System.setIn(in);
        System.setOut(new PrintStream(out));
   
        // run the comparison
        Review1.main(null);
        assertEquals(expectedOutput, out.toString(), "Failed testMain4");
    }


}

