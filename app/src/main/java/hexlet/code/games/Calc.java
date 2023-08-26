package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Calc {
    public static void startCalcGame() {
        final String exercise = "What is the result of the expression?";
        final int randBound = 10;
        final int boundNumberOfExpressions = 3;
        int rightAnswer;

        String[][] questionsAndAnswers = new String[Engine.GAME_STEPS][2];

        for (int i = 0; i < Engine.GAME_STEPS; i++) {

            var numberOfExpression = Util.generateRandomNumbers(boundNumberOfExpressions);
            var firstNumber = Util.generateRandomNumbers(randBound);
            var secondNumber = Util.generateRandomNumbers(randBound);

            if (numberOfExpression == 0) {
                rightAnswer = firstNumber + secondNumber;
                String question = firstNumber + " + " + secondNumber;
                questionsAndAnswers[i][0] = question;
                questionsAndAnswers[i][1] = Integer.toString(rightAnswer);
            }

            if (numberOfExpression == 1) {
                rightAnswer = firstNumber * secondNumber;
                String question = firstNumber + " * " + secondNumber;
                questionsAndAnswers[i][0] = question;
                questionsAndAnswers[i][1] = Integer.toString(rightAnswer);
            }

            if (numberOfExpression == 2) {
                rightAnswer = firstNumber - secondNumber;
                String question = firstNumber + " - " + secondNumber;
                questionsAndAnswers[i][0] = question;
                questionsAndAnswers[i][1] = Integer.toString(rightAnswer);
            }
        }
        Engine.gameEngine(exercise, questionsAndAnswers);
    }
}
