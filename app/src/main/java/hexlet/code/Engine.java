package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int GAME_STEPS_COUNT = 3;

    public static void gameEngineRun(String exercise, String[][] questionsAndAnswers)  {

        Scanner console = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");

        String userName = console.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(exercise);

        for (int i = 0; i < GAME_STEPS_COUNT; i++) {
            System.out.println("Question: " + questionsAndAnswers[i][0]);
            System.out.print("Your answer: ");

            String userAnswer = console.next();

            if (userAnswer.equalsIgnoreCase(questionsAndAnswers[i][1])) {
                System.out.println("Correct!");
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
