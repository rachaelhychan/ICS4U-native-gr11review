package gr11review.test1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;

import org.junit.jupiter.api.Test;
import gr11review.part1.*;
import java.io.*;


public class Review6Test {

    private final InputStream sysInBackup = System.in; // backup System.in to restore it later
    private final PrintStream sysOutBackup = System.out; // backup System.out to restore later
    private final String sep = System.getProperty("line.separator");

    @After
    public void restoreStreams() {
         // restore the backups
         System.setIn(sysInBackup);
         System.setOut(sysOutBackup);
    }

    /**
     * 0 entry for number of products
     * @throws Exception
     */
    @Test
    public void testMain0() throws Exception{

        // input 0 on product prompt
        String simulatedUserInput = "0";
        ByteArrayInputStream in = new ByteArrayInputStream(simulatedUserInput.getBytes());

        // Set the output stream expected value
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        String expectedOutput = "Enter the price for an item: " + "Subtotal: $0.00" + sep
        + "Tax: $0.00" + sep
        + "Total: $0.00" + sep;

        // Set the System in/out to the simulated input/output
        System.setIn(in);
        System.setOut(new PrintStream(out));
   
        // run the comparison
        Review6.main(null);
        assertEquals(expectedOutput.trim(), out.toString().trim(), "Failed testMain0");

    }

    /**
     * 0 entry for number of products
     * @throws Exception
     */
    @Test
    public void testException() throws Exception{

        // input blank on product prompt
        String simulatedUserInput = "";
        ByteArrayInputStream in = new ByteArrayInputStream(simulatedUserInput.getBytes());

        // Set the output stream expected value
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        
        // Set the System in/out to the simulated input/output
        System.setIn(in);
        System.setOut(new PrintStream(out));


        // run the comparison
        assertThrows(NullPointerException.class, () -> {Review6.main(null);});
    }


    /**
     * Test 3 products
     * @throws Exception
     */
    @Test
    public void testMain1() throws Exception{

        // input blank on product prompt
        String simulatedUserInput = "1.99" + sep
        + "1.99" + sep
        + "1.99" + sep
        + "0" + sep;
        ByteArrayInputStream in = new ByteArrayInputStream(simulatedUserInput.getBytes());

        // Set the output stream expected value
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        String expectedOutput = "Enter the price for an item: " + "Enter the price for an item: "
        + "Enter the price for an item: " + "Enter the price for an item: ";

        expectedOutput += "Subtotal: $5.97" + sep
        + "Tax: $0.78" + sep
        + "Total: $6.75" + sep;

        // Set the System in/out to the simulated input/output
        System.setIn(in);
        System.setOut(new PrintStream(out));
   
        // run the comparison
        Review6.main(null);
        assertEquals(expectedOutput.trim(), out.toString().trim(), "Failed testMain1");
    }

    /**
     * Test int $ values
     */
    @Test
    public void testMain2() throws Exception{

        // input blank on product prompt
        String simulatedUserInput = "5" + sep + "2" + sep + "0" + sep;
        ByteArrayInputStream in = new ByteArrayInputStream(simulatedUserInput.getBytes());

        // Set the output stream expected value
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        String expectedOutput = "Enter the price for an item: " + "Enter the price for an item: " + "Enter the price for an item: " ;


        expectedOutput += "Subtotal: $7.00" + sep
        + "Tax: $0.91" + sep
        + "Total: $7.91" + sep;

        // Set the System in/out to the simulated input/output
        System.setIn(in);
        System.setOut(new PrintStream(out));
   
        // run the comparison
        Review6.main(null);
        assertEquals(expectedOutput.trim(), out.toString().trim(), "Failed testMain2");
    }





}