package org.example;

import java.util.Random;
import java.util.Scanner;

public class Game {

    private Sonnet sonnet;
    private Scanner scanner;
    private Random random;

    private int correct;
    private int incorrect;

    public Game() {

        sonnet = new Sonnet();
        scanner = new Scanner(System.in);
        random = new Random();

        correct = 0;
        incorrect = 0;
    }

    public void start() {
        String[] lines = sonnet.getLines();

        for (String line : lines) {
            System.out.println(line);
        }
    }
}