package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Random;
import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void startGreatestCommonDivisor() {

        int randBound = 100;
        int gameSteps = 3;
        int stepsCounter = 0;
        int rightAnswer;
        int userAnswer;

        Random random = new Random();
        Scanner console = new Scanner(System.in);

        System.out.println("Find the greatest common divisor of given numbers.");

        for (int i = 0; i < gameSteps; i++) {

            var firstNumber = random.nextInt(randBound) + 1;
            var secondNumber = random.nextInt(randBound) + 1;

            System.out.println("Question: " + firstNumber + " " + secondNumber);

            while (firstNumber != 0 && secondNumber != 0) {
                if (firstNumber > secondNumber) {
                    firstNumber = firstNumber % secondNumber;
                } else {
                    secondNumber = secondNumber % firstNumber;
                }
            }
            rightAnswer = firstNumber + secondNumber;

            System.out.print("Your answer: ");
            userAnswer = console.nextInt();

            if (rightAnswer == userAnswer) {
                System.out.println("Correct!");
                stepsCounter++;
            } else {
                System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. "
                       + "Correct answer was " + "'" + rightAnswer + "'");
                System.out.println("Let's try again, " + Cli.userName + "!");
                break;
            }
        }
        if (stepsCounter == gameSteps) {
            System.out.println("Congratulations, " + Cli.userName + "!");
        }
    }
}
