package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;
import hexlet.code.Util;

import java.util.Random;
import java.util.Scanner;

public class Prime {
    public static void startPrimeGame() {
        String rightAnswer;
        int randBound = 100;
        int number;

        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        String[] questions = new String[Engine.gameSteps];
        int[] numbers = new int[Engine.gameSteps];

        for (int i = 0; i < Engine.gameSteps; i++) {

            number = Util.generateRandomNumbers(randBound);
            numbers[i] = number;
            rightAnswer = Prime.generateRightAnswer(number);
            questions[i] = rightAnswer;
        }

        Engine.gameEngine(questions, numbers);
    }
    public static String generateRightAnswer(int number) {
        if (number < 2) {
            return "no";
        }

        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
}
