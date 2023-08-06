package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Random;
import java.util.Scanner;

public class Calc {
    public static void startCalcGame() {

        int randBound = 10;
        int boundNumberOfExpressions = 3;
        int gameSteps = 3;
        int stepsCounter = 0;
        int rightAnswer;
        int userAnswer;

        Random random = new Random();
        Scanner console = new Scanner(System.in);

        System.out.println("What is the result of the expression?");

        for (int i = 0; i < gameSteps; i++) {
            var numberOfExpression = random.nextInt(boundNumberOfExpressions);
            var firstNumber = random.nextInt(randBound);
            var secondNumber = random.nextInt(randBound);

            if (numberOfExpression == 0) {
                System.out.println("Question: " + firstNumber + "+" + secondNumber);
                rightAnswer = firstNumber + secondNumber;
                System.out.print("Your answer: ");
                userAnswer = console.nextInt();
                System.out.println(userAnswer);

                if (rightAnswer == userAnswer) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. "
                            + "Correct answer was " + "'" + rightAnswer + "'");
                    System.out.println("Let's try again, " + Cli.userName);
                    break;
                }
            }
            if (numberOfExpression == 1) {
                System.out.println("Question: " + firstNumber + "*" + secondNumber);
                rightAnswer = firstNumber * secondNumber;
                System.out.print("Your answer: ");
                userAnswer = console.nextInt();
                System.out.println(userAnswer);

                if (rightAnswer == userAnswer) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. "
                            + "Correct answer was " + "'" + rightAnswer + "'");
                    System.out.println("Let's try again, " + Cli.userName);
                    break;
                }
            }
            if (numberOfExpression == 2) {
                System.out.println("Question: " + firstNumber + "-" + secondNumber);
                rightAnswer = firstNumber - secondNumber;
                System.out.print("Your answer: ");
                userAnswer = console.nextInt();
                System.out.println(userAnswer);

                if (rightAnswer == userAnswer) {
                    System.out.println("Correct!");
                    stepsCounter++;

                } else {
                    System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. "
                            + "Correct answer was " + "'" + rightAnswer + "'");
                    System.out.println("Let's try again, " + Cli.userName);
                    break;
                }
            }
        }
        if (stepsCounter == gameSteps) {
            System.out.println("Congratulations, " + Cli.userName + "!");
        }
    }
}
