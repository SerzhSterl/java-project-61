package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Prime {
    public static void startPrimeGame() {
        String rightAnswer;
        int randBound = 100;
        int number;

        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        String[] questions = new String[Engine.gameSteps];
        String[] numbers = new String[Engine.gameSteps];

        for (int i = 0; i < Engine.gameSteps; i++) {

            number = Util.generateRandomNumbers(randBound);
            questions[i] = Integer.toString(number);

            rightAnswer = Prime.generateRightAnswer(number);
            numbers[i] = rightAnswer;

        }
        Engine.gameEngine(numbers, questions);
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
