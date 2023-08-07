package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Prime {
    public static void startPrimeGame() {

        int randBound = 100;
        int gameSteps = 3;
        int stepsCounter = 0;
        String rightAnswer;
        String userAnswer;

        Random random = new Random();
        Scanner console = new Scanner(System.in);

        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        for (int i = 0; i < gameSteps; i++) {
            var number = random.nextInt(randBound);

            System.out.println("Question: " + number);
            rightAnswer =  Engine.isPrime(number);

            System.out.print("Your answer: ");
            userAnswer = console.nextLine();

            if (rightAnswer.equalsIgnoreCase(userAnswer)) {
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
