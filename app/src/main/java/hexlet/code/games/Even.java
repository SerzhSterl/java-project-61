package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Even {
    public static void startEvenGame() {
        String rightAnswer;
        int randBound = 100;
        int number;

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        String[] questions = new String[Engine.gameSteps];
        String[] numbers = new String[Engine.gameSteps];

        for (int i = 0; i < Engine.gameSteps; i++) {
            number = Util.generateRandomNumbers(randBound);
            questions[i] = Integer.toString(number);

            rightAnswer = Even.generateRightAnswer(number);
            numbers[i] = rightAnswer;
        }
        Engine.gameEngine(numbers, questions);
    }
    public static String generateRightAnswer(int number) {
        String rightAnswer;
        rightAnswer =  (number % 2 == 0) ? "yes" : "no";
        return rightAnswer;
    }
}
