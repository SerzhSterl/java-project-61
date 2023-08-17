package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static int gameSteps = 3;

    public static void gameEngine(String[] questions, int[] numbers) {
        String userAnswer;
        int stepsCounter = 0;
        Scanner console = new Scanner(System.in);

        for (int i = 0; i < gameSteps; i++) {
            System.out.println("Question: " + numbers[i]);
            System.out.print("Your answer: ");
            userAnswer = console.nextLine();

            if (questions[i].equalsIgnoreCase(userAnswer)) {
                System.out.println("Correct!");
                stepsCounter++;

            } else {
                System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. "
                        + "Correct answer was " + "'" + questions[i] + "'");
                System.out.println("Let's try again, " + Cli.userName + "!");
                break;
            }

            if (stepsCounter == gameSteps) {
                System.out.println("Congratulations, " + Cli.userName + "!");
            }
        }
    }
    public static void gameEngine(int[] numbers, String[] questions)  {
        int userAnswer;
        int stepsCounter = 0;
        Scanner console = new Scanner(System.in);

        for (int i = 0; i < gameSteps; i++) {
            System.out.println("Question: " + questions[i]);
            System.out.print("Your answer: ");

            userAnswer = console.nextInt();

            if (numbers[i] == userAnswer) {
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
