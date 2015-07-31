package com.marsRover;

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
            else if(command == 'L' || command == 'R')
                rotate(command);
        }
        return currentPosition();
    }

    private void rotate(char command) {
        String referenceList = "NESW";
        int referenceNumber = referenceList.indexOf(orientation);
        if (command == 'L')
            referenceNumber--;
        else
            referenceNumber++;
        if (referenceNumber < 0)
            referenceNumber += 4;
        if (referenceNumber > 4)
            referenceNumber -= 4;
        orientation = referenceList.charAt(referenceNumber);
    }

    private String currentPosition() {
        return xCoOrdinate + " " + yCoOrdinate + " " + orientation;
    }

    private void move() {
        switch (orientation) {
            case 'N':
                yCoOrdinate++;
                break;
            case 'S':
                yCoOrdinate--;
                break;
            case 'W':
                xCoOrdinate--;
                break;
            case 'E':
                xCoOrdinate++;
                break;
        }
    }
}
