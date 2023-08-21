package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int gameSteps = 3;

    public static void gameEngine(String[] numbers, String[] questions)  {

        String userAnswer;
        int stepsCounter = 0;
        Scanner console = new Scanner(System.in);

        for (int i = 0; i < gameSteps; i++) {
            System.out.println("Question: " + questions[i]);
            System.out.print("Your answer: ");

            userAnswer = console.next();

            if (numbers[i].equalsIgnoreCase(userAnswer)) {

                System.out.println("Correct!");
                stepsCounter++;

            } else {
                System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. "
                        + "Correct answer was " + "'" + numbers[i] + "'");
                System.out.println("Let's try again, " + Cli.userName + "!");
                break;
            }
            if (stepsCounter == gameSteps) {
                System.out.println("Congratulations, " + Cli.userName + "!");
            }
        }
    }
}
