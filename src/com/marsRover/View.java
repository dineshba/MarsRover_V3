package com.marsRover;

import java.util.Scanner;


public class View {
    Scanner in = new Scanner(System.in);

    public void show(String message) {
        System.out.println(message);
    }

    public String getInput() {
        return in.next();
    }
}
