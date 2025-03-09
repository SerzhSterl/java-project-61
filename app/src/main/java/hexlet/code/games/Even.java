package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Even {
    private static final String EXERCISE = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int RAND_BOUND = 100;
    public static void startEvenGame() {

        String[][] questionsAndAnswers = new String[Engine.GAME_STEPS_COUNT][2];

        for (int i = 0; i < Engine.GAME_STEPS_COUNT; i++) {
            questionsAndAnswers[i] = generateData();
        }
        Engine.gameEngineRun(EXERCISE, questionsAndAnswers);
    }
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static String[] generateData() {

        int number = Util.generateRandomNumbers(RAND_BOUND);

        String rightAnswer = isEven(number) ? "yes" : "no";
        String question = String.valueOf(number);

        String[] data = new String[2];
        data[0] = question;
        data[1] = rightAnswer;
        return data;

    }
}
