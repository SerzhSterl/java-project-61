package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Random;
import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void startGreatestCommonDivisor() {

        int randBound = 20;
        var gameSteps = 3;
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
                if (firstNumber > secondNumber){
                    firstNumber = firstNumber % secondNumber;
                } else {
                    secondNumber = secondNumber % firstNumber;
                }
            }
                rightAnswer = firstNumber + secondNumber;

                System.out.print("Your answer: ");
                userAnswer = console.nextInt();
                System.out.println(userAnswer);

                if (rightAnswer == userAnswer) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. " + "Correct answer was " + "'" + rightAnswer + "'");
                    System.out.println("Let's try again, " + Cli.userName);
                    break;
                }

        }
    }
}
