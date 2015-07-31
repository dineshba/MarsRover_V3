package com.marsRover;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class RoverControllerTest {

    @Test
    public void doNothingForNoCommands() {
        RoverController controller = new RoverController("1 2 N");

        assertTrue(controller.doThis(" "));
    }
}
