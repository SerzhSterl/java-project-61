package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class GreatestCommonDivisor {
    final static String EXERCISE = "Find the greatest common divisor of given numbers.";
    final static int RAND_BOUND = 100;
    public static void startGreatestCommonDivisor() {

        String[][] questionsAndAnswers = new String[Engine.GAME_STEPS_COUNT][2];

        for (int i = 0; i < Engine.GAME_STEPS_COUNT; i++) {

            int firstNumber = Util.generateRandomNumbers(RAND_BOUND) + 1;
            int secondNumber = Util.generateRandomNumbers(RAND_BOUND) + 1;

            String question =  firstNumber + " " + secondNumber;

            questionsAndAnswers[i][1] = Integer.toString(GreatestCommonDivisor.generateGCD(firstNumber, secondNumber));
            questionsAndAnswers[i][0] = question;
        }
        Engine.gameEngineRun(EXERCISE, questionsAndAnswers);
    }
    public static int generateGCD(int firstNumber, int secondNumber) {
        int rightAnswer;
        while (firstNumber != 0 && secondNumber != 0) {
            if (firstNumber > secondNumber) {
                firstNumber = firstNumber % secondNumber;
            } else {
                secondNumber = secondNumber % firstNumber;
            }
        }
        rightAnswer = firstNumber + secondNumber;
        return rightAnswer;
    }
}
