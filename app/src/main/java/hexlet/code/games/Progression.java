package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Progression {
    public static void startProgressionGame() {

        final int randBoundCoefficient = 20;
        final int randBoundArray = 10;
        final int arrSize = 10;
        final int firstRandNumberBound = 20;
        int firstRandNumber;
        int randNumber;
        int progressionCoefficient;
        int rightAnswer;

        String[] questions = new String[Engine.gameSteps];
        String[] numbers = new String[Engine.gameSteps];

        System.out.println("What number is missing in the progression?");

        for (int i = 0; i < Engine.gameSteps; i++) {

            progressionCoefficient = Util.generateRandomNumbers(randBoundCoefficient);
            firstRandNumber = Util.generateRandomNumbers(firstRandNumberBound);

            int[] progressionArr = generateProgression(firstRandNumber, progressionCoefficient, arrSize);

            randNumber = Util.generateRandomNumbers(randBoundArray);
            rightAnswer = progressionArr[randNumber];
            numbers[i] = Integer.toString(rightAnswer);

            String[] progressionToString = new String[arrSize];

            for (int j = 0; j < arrSize; j++) {
                progressionToString[j] = String.valueOf(progressionArr[j]);
                progressionToString[randNumber] = "..";
                questions[i] = String.join(" ", progressionToString);
            }
        }
        Engine.gameEngine(numbers, questions);
    }
    public static int[] generateProgression(int firstRandNumber, int progressionCoefficient, int arrSize) {

        int[] progressionArr = new int[arrSize];

        for (int j = 0; j < arrSize; j++) {
            progressionArr[j] = firstRandNumber;
            firstRandNumber = firstRandNumber + progressionCoefficient;
        }
        return progressionArr;
    }
}
