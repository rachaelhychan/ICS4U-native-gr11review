package gr11review.test1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;

import org.junit.jupiter.api.Test;
import gr11review.part1.*;
import java.io.*;

public class Review8Test {

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
     * test program length and triple count
     */
    @Test
    public void testMain1() throws Exception{

        String[] outArray;
        String[] singleArray;
        int tripleCount = 0;
        String num1;
        String num2;
        String num3;

        // Set the output stream expected value
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        // Set the System in/out to the simulated input/output
        System.setOut(new PrintStream(out));
   
        // run the comparison
        Review8.main(null);

        outArray = out.toString().trim().split(sep);

        // scan
        for (int i = 0; i< outArray.length-1;i++){

            singleArray = outArray[i].split(" ");
            num1 = singleArray[0].trim();
            num2 = singleArray[1].trim();
            num3 = singleArray[2].trim();

            if(num1.equals(num2) &&  num2.equals(num3)){
                tripleCount++;
            }
        }
        // check triplecount
        assertEquals(tripleCount, Integer.parseInt(outArray[outArray.length - 1]) );

        // check length
        assertEquals(1001, outArray.length);
    }
    
}