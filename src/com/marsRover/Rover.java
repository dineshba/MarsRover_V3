package com.marsRover;

public class Rover {
    private String position;
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

    public void executeCommands(RoverController roverController) {
        position = roverController.doThis(commands, position);
    }
}
