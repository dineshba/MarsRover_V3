package com.marsRover;

public class Rover {
    private final String position;
    private String commands;

    Rover(String position) {
        this.position = position;
    }

    public String getCurrentPosition() {
        return position;
    }

    public void getCommands(View view) {
        view.show("Enter the commands");
        commands = view.getInput();
    }

    public void executeCommands() {
        for(int i =0; i < commands.length(); i++) {
            char command = commands.charAt(i);
        }
    }
}
