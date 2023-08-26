package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Prime {
    public static void startPrimeGame() {
        final String exercise = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String rightAnswer;
        final int randBound = 100;
        int number;

        String[][] questionsAndAnswers = new String[Engine.GAME_STEPS][2];

        for (int i = 0; i < Engine.GAME_STEPS; i++) {

            number = Util.generateRandomNumbers(randBound);
            questionsAndAnswers[i][0] = Integer.toString(number);

            rightAnswer = Prime.generateRightAnswer(number);
            questionsAndAnswers[i][1] = rightAnswer;
        }
        Engine.gameEngine(exercise, questionsAndAnswers);
    }
    public static String generateRightAnswer(int number) {
        if (number < 2) {
            return "no";
        }
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
}
