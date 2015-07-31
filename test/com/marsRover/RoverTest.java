package com.marsRover;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class RoverTest {

    @Test
    public void showTheCurrentPositionOfRover() {
        Rover rover = new Rover("1 2 N");

        assertEquals("1 2 N", rover.getCurrentPosition());
    }

    @Test
    public void getCommandsFromTheUser() {
        Rover rover = new Rover("1 2 N");
        View view = Mockito.mock(View.class);

        rover.getCommands(view);

        Mockito.verify(view).show("Enter the commands");
        Mockito.verify(view).getInput();
    }
}
