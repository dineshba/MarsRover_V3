package com.marsRover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class RoverControllerTest {

    @Test
    public void doNothingForNoCommands() {
        RoverController controller = new RoverController("1 2 N");

        assertEquals("1 2 N", controller.doThis(" "));
    }

    @Test
    public void MoveOnlyCommandsWhenOrientationInNorth() {
        RoverController controller = new RoverController("1 2 N");

        assertEquals("1 4 N", controller.doThis("MM"));
    }
}
