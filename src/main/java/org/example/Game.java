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
        while (correct < 3 && incorrect < 3) {

            String[] lines = sonnet.getLines();
            int randomLine = random.nextInt(lines.length);

            String[] words = lines[randomLine].split(" ");
            int randomWord = random.nextInt(words.length);

            for (int i = 0; i < randomLine; i++) {
                System.out.print(words[i] + " ");
            }
            for (int i = 0; i < randomWord; i++) {
                System.out.print(words[i] + " ");
            }

            System.out.println("____");

            System.out.print("What is the missing word?");
            String answer = scanner.nextLine();

            String correctWord = words[randomWord].replaceAll("[^a-zA-A]", "");

            if (answer.equalsIgnoreCase(correctWord)) {
                System.out.println("Correct!");
                correct++;
            } else {
                System.out.println("Incorrect. The word was:" + correctWord);
                incorrect++;
            }
            System.out.println();
        }

        for (String line : lines) {
            System.out.println(line);
        }
    }
}