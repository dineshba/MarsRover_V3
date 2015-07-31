package com.marsRover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class RoverControllerTest {

    @Test
    public void doNothingForNoCommands() {
        RoverController controller = new RoverController();

        assertEquals("1 2 N", controller.doThis(" ", "1 2 N"));
    }

    @Test
    public void MoveOnlyCommandsWhenOrientationInNorth() {
        RoverController controller = new RoverController();

        assertEquals("1 4 N", controller.doThis("MM", "1 2 N"));
    }

    @Test
    public void MoveOnlyForAllInitialOrientation() {
        RoverController controller = new RoverController();

        assertEquals("1 0 S", controller.doThis("MM", "1 2 S"));
    }

    @Test
    public void ChangeInOrientationInLeftDirectionOnly() {
        RoverController controller = new RoverController();

        assertEquals("1 2 N", controller.doThis("LL", "1 2 S"));
    }

    @Test
    public void ChangeInOrientationInRightDirectionAlso() {
        RoverController controller = new RoverController();

        assertEquals("1 2 W", controller.doThis("R", "1 2 S"));
    }
}
