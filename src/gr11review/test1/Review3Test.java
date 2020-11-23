package gr11review.test1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;

import org.junit.jupiter.api.Test;
import gr11review.part1.*;
import java.io.*;

public class Review3Test {

    private final InputStream sysInBackup = System.in; // backup System.in to restore it later
    private final PrintStream sysOutBackup = System.out; // backup System.out to restore later
    private final String sep = System.getProperty("line.separator");

    @Test
    public void testMain0() throws Exception{

        // Set the output stream expected value
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        // generate the solution string
        String solutionStr = "";


        for(int i = 21; i <= 100; i+=2){
            solutionStr += Integer.toString(i) + sep;
        }

        solutionStr += sep;

        for(int j = 29;  j >= 2; j--){
            solutionStr += Integer.toString(j) + sep;
        }

        System.setOut(new PrintStream(out));

        // run the comparison
        Review3.main(null);
        assertEquals(solutionStr.trim(), out.toString().trim());

    }


    
}