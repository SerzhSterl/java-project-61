package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

import java.util.Random;
import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void startGreatestCommonDivisor() {

        int randBound = 100;

        String[] questions = new String[Engine.gameSteps];
        int[] numbers = new int[Engine.gameSteps];

        System.out.println("Find the greatest common divisor of given numbers.");

        for (int i = 0; i < Engine.gameSteps; i++) {

            int firstNumber = Util.generateRandomNumbers(randBound) + 1;
            int secondNumber = Util.generateRandomNumbers(randBound) + 1;

            String question =  firstNumber + " " + secondNumber;

            numbers[i] = GreatestCommonDivisor.generateGCD(firstNumber, secondNumber);
            questions[i] = question;
        }
        Engine.gameEngine(numbers, questions);
    }
    public static int generateGCD(int firstNumber, int secondNumber) {
        int rightAnswer;
        while (firstNumber != 0 && secondNumber != 0) {
            if (firstNumber > secondNumber) {
                firstNumber = firstNumber % secondNumber;
            } else {
                secondNumber = secondNumber % firstNumber;
            }
        }
        rightAnswer = firstNumber + secondNumber;
        return rightAnswer;
    }
}
