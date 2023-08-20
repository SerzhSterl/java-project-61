package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Calc {
    public static void startCalcGame() {

        int randBound = 10;
        int boundNumberOfExpressions = 3;
        int rightAnswer;

        System.out.println("What is the result of the expression?");

        String[] questions = new String[Engine.gameSteps];
        String[] numbers = new String[Engine.gameSteps];

        for (int i = 0; i < Engine.gameSteps; i++) {

            var numberOfExpression = Util.generateRandomNumbers(boundNumberOfExpressions);
            var firstNumber = Util.generateRandomNumbers(randBound);
            var secondNumber = Util.generateRandomNumbers(randBound);

            if (numberOfExpression == 0) {
                rightAnswer = firstNumber + secondNumber;
                String question = firstNumber + " + " + secondNumber;
                questions[i] = question;
                numbers[i] = Integer.toString(rightAnswer);
            }

            if (numberOfExpression == 1) {
                rightAnswer = firstNumber * secondNumber;
                String question = firstNumber + " * " + secondNumber;
                questions[i] = question;
                numbers[i] = Integer.toString(rightAnswer);
            }

            if (numberOfExpression == 2) {
                rightAnswer = firstNumber - secondNumber;
                String question = firstNumber + " - " + secondNumber;
                questions[i] = question;
                numbers[i] = Integer.toString(rightAnswer);
            }
        }
       Engine.gameEngine(numbers, questions);
    }
}
