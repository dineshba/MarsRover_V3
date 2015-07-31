package com.marsRover;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;


public class ViewTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    PrintStream original;

    @Before
    public void setUpStream() {
        original = System.out;
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStream() {
        System.setOut(original);
    }

    @Test
    public void showTheMessageToUserToEnterTheNumberTheRover() {
        View view = new View();

        view.show("Enter the Number of the Rovers");

        assertEquals("Enter the Number of the Rovers\n", outContent.toString());
    }
}
