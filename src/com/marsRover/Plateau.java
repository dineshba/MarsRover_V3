package com.marsRover;

import java.util.ArrayList;

public class Plateau {

    private final int xLimit;
    private final int yLimit;
    private View view;
    private ArrayList<Rover> roverList ;
    private RoverController roverController;

    public Plateau(ArrayList<Rover> roverList, View view, RoverController roverController, int xLimit, int yLimit) {
        this.xLimit = xLimit;
        this.yLimit = yLimit;
        this.view = view;
        this.roverController = roverController;
        this.roverList = roverList;

    }

    public void start() {
        for(Rover rover : roverList) {
            deployRover(rover);
        }
        displayRoverPositions(roverList);
    }

    private void deployRover(Rover rover) {
        rover.getCommands(view);
        rover.executeCommands(roverController);
    }

    private void displayRoverPositions(ArrayList<Rover> RoverList) {
        for(Rover rover : RoverList) {
            view.show(rover.getCurrentPosition());
        }
    }
}
