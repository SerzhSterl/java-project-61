package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Even {
    public static void startEvenGame() {

        var gameSteps = 3;
        String rightAnswer;
        String userAnswer;

        Random random = new Random();
        Scanner console = new Scanner(System.in);

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (int i = 0; i < gameSteps; i++) {
            var number = random.nextInt(100);

            System.out.println("Question: " + number);
            rightAnswer = (number % 2 == 0) ? "yes" : "no";

            System.out.print("Your answer: ");
            userAnswer = console.nextLine();
            System.out.println(userAnswer);

            if (rightAnswer.equalsIgnoreCase(userAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println(userAnswer + " is wrong answer ;(. " + "Correct answer was " + rightAnswer);
                System.out.println("Let's try again, " + Cli.userName);
                break;
            }
        }
        System.out.println("Congratulations, " + Cli.userName + "!");
    }
}
