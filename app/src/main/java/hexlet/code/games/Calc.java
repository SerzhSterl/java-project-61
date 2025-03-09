package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Calc {
    private static final String EXERCISE = "What is the result of the expression?";
    private static final int RAND_BOUND = 10;
    private static final int BOUND_NUMBER_OF_EXPRESSIONS = 3;
    public static void startCalcGame() {

        String[][] questionsAndAnswers = new String[Engine.GAME_STEPS_COUNT][2];

        for (int i = 0; i < Engine.GAME_STEPS_COUNT; i++) {
            questionsAndAnswers[i] = generateData();
        }
        Engine.gameEngineRun(EXERCISE, questionsAndAnswers);
    }
    public static int calculate(int firstNumber, int secondNumber, String operation) {

        if (operation.equals("+")) {
            return firstNumber + secondNumber;
        } else if (operation.equals("-")) {
            return firstNumber - secondNumber;
        } else {
            return firstNumber * secondNumber;
        }
    }
    public static String[] generateData() {

        int numberOfExpression = Util.generateRandomNumbers(BOUND_NUMBER_OF_EXPRESSIONS);
        int firstNumber = Util.generateRandomNumbers(RAND_BOUND);
        int secondNumber = Util.generateRandomNumbers(RAND_BOUND);
        String operation = String.valueOf("+-*".charAt(numberOfExpression));

        String question = firstNumber + " " + operation + " " + secondNumber;
        String rightAnswer = String.valueOf(calculate(firstNumber, secondNumber, operation));

        String[] data = new String[2];
        data[0] = question;
        data[1] = rightAnswer;
        return data;

    }
}
