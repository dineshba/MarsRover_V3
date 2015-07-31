package com.marsRover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoverTest {

    @Test
    public void showTheCurrentPositionOfRover() {
        Rover rover = new Rover("1 2 N");

        assertEquals("1 2 N", rover.getCurrentPosition());
    }
}
