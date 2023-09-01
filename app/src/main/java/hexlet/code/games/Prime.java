package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Prime {
    private static final String EXERCISE = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int RAND_BOUND = 100;
    public static void startPrimeGame() {

        String[][] questionsAndAnswers = new String[Engine.GAME_STEPS_COUNT][2];

        for (int i = 0; i < Engine.GAME_STEPS_COUNT; i++) {

            int number = Util.generateRandomNumbers(RAND_BOUND);
            questionsAndAnswers[i][0] = Integer.toString(number);

            String rightAnswer = generateRightAnswer(number) ? "yes" : "no";
            questionsAndAnswers[i][1] = rightAnswer;
        }
        Engine.gameEngineRun(EXERCISE, questionsAndAnswers);
    }
    public static boolean generateRightAnswer(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
