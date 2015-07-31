package com.marsRover;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Rover roverOne = new Rover("1 2 N");
        Rover roverTwo = new Rover("3 3 E");
        ArrayList<Rover> roverList = new ArrayList<Rover>();
        roverList.add(roverOne);
        roverList.add(roverTwo);
        View view = new View();
        RoverController roverController = new RoverController();
        Plateau plateau = new Plateau(roverList, view, roverController, 5 ,5);

        plateau.start();
    }
}
