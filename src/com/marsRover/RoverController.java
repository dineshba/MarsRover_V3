package com.marsRover;

import apple.laf.JRSUIConstants;

public class RoverController {

    private final String position;
    private char orientation;
    private int yCoOrdinate;
    private int xCoOrdinate;

    public RoverController(String position) {
        this.position = position;
        getLocationAndOrientation(position);
    }

    private void getLocationAndOrientation(String position) {
        xCoOrdinate = Integer.parseInt("" + position.charAt(0));
        yCoOrdinate = Integer.parseInt("" + position.charAt(2));
        orientation = position.charAt(4);
    }

    public String doThis(String commands) {
        for(int i =0; i < commands.length(); i++) {
            char command = commands.charAt(i);
            if(command == 'M')
                move();
        }
        return currentPosition();
    }

    private String currentPosition() {
        return xCoOrdinate + " " + yCoOrdinate + " " + orientation;
    }

    private void move() {
        if(orientation == 'N'){
            yCoOrdinate++;
        }
    }
}
