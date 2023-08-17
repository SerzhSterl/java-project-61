package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;
import hexlet.code.Util;

import java.util.Random;
import java.util.Scanner;

public class Even {
    public static void startEvenGame() {
        String rightAnswer;
        int randBound = 100;
        int number;

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        String[] questions = new String[Engine.gameSteps];
        int[] numbers = new int[Engine.gameSteps];

        for (int i = 0; i < Engine.gameSteps; i++) {
            number = Util.generateRandomNumbers(randBound);
            numbers[i] = number;
            rightAnswer = Even.generateRightAnswer(number);
            questions[i] = rightAnswer;
        }

        Engine.gameEngine(questions, numbers);
    }
    public static String generateRightAnswer(int number) {
        String rightAnswer;
        rightAnswer =  (number % 2 == 0) ? "yes" : "no";
        return rightAnswer;
    }
}
