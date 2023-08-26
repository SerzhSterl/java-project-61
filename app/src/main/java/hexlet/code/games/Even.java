package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Even {
    public static void startEvenGame() {
        final String exercise = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String rightAnswer;
        final int randBound = 100;
        int number;

        String[][] questionsAndAnswers = new String[Engine.GAME_STEPS][2];
       // String[] numbers = new String[Engine.GAME_STEPS];

        for (int i = 0; i < Engine.GAME_STEPS; i++) {
            number = Util.generateRandomNumbers(randBound);
            questionsAndAnswers[i][0] = Integer.toString(number);

            rightAnswer = Even.generateRightAnswer(number);
            questionsAndAnswers[i][1] = rightAnswer;
        }
        Engine.gameEngine(exercise, questionsAndAnswers);
    }
    public static String generateRightAnswer(int number) {
        String rightAnswer;
        rightAnswer =  (number % 2 == 0) ? "yes" : "no";
        return rightAnswer;
    }
}
