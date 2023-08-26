package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int GAME_STEPS = 3;

    public static void gameEngine(String exercise, String[][] questionsAndAnswers)  {

        String userAnswer;
        String userName;

        Scanner console = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");

        userName = console.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(exercise);

        for (int i = 0; i < GAME_STEPS; i++) {
            System.out.println("Question: " + questionsAndAnswers[i][0]);
            System.out.print("Your answer: ");

            userAnswer = console.next();

            if (userAnswer.equalsIgnoreCase(questionsAndAnswers[i][1])) {
                System.out.println("Correct!");
                //stepsCounter++;
            } else {
                System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. "
                        + "Correct answer was " + "'" + questionsAndAnswers[i][1] + "'");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
