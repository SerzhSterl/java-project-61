package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class GreatestCommonDivisor {
    public static void startGreatestCommonDivisor() {
        final String exercise = "Find the greatest common divisor of given numbers.";
        final int randBound = 100;

        String[][] questionsAndAnswers = new String[Engine.GAME_STEPS][2];

        for (int i = 0; i < Engine.GAME_STEPS; i++) {

            int firstNumber = Util.generateRandomNumbers(randBound) + 1;
            int secondNumber = Util.generateRandomNumbers(randBound) + 1;

            String question =  firstNumber + " " + secondNumber;

            questionsAndAnswers[i][1] = Integer.toString(GreatestCommonDivisor.generateGCD(firstNumber, secondNumber));
            questionsAndAnswers[i][0] = question;
        }
        Engine.gameEngine(exercise, questionsAndAnswers);
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
