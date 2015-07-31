package com.marsRover;

public class Rover {

    private final String position;

    Rover(String position) {
        this.position = position;
    }

    public String getCurrentPosition() {
        return position;
    }
}
