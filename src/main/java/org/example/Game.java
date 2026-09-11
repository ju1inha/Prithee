package org.example;

public class Game {

    private Sonnet sonnet;

    public Game() {
        sonnet = new Sonnet();
    }

    public void start() {
        String[] lines = sonnet.getLines();

        for (String line : lines) {
            System.out.println(line);
        }
    }
}