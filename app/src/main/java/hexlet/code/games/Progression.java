package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Progression {
    public static void startProgressionGame() {

        final String exercise = "What number is missing in the progression?";

        final int randBoundCoefficient = 20;
        final int randBoundArray = 10;
        final int arrSize = 10;
        final int firstRandNumberBound = 20;
        int firstRandNumber;
        int randNumber;
        int progressionCoefficient;
        int rightAnswer;

        String[][] questionsAndAnswers = new String[Engine.GAME_STEPS][2];

        for (int i = 0; i < Engine.GAME_STEPS; i++) {

            progressionCoefficient = Util.generateRandomNumbers(randBoundCoefficient);
            firstRandNumber = Util.generateRandomNumbers(firstRandNumberBound);

            int[] progressionArr = generateProgression(firstRandNumber, progressionCoefficient, arrSize);

            randNumber = Util.generateRandomNumbers(randBoundArray);
            rightAnswer = progressionArr[randNumber];
            questionsAndAnswers[i][1] = Integer.toString(rightAnswer);

            String[] progressionToString = new String[arrSize];

            for (int j = 0; j < arrSize; j++) {
                progressionToString[j] = String.valueOf(progressionArr[j]);
                progressionToString[randNumber] = "..";
                questionsAndAnswers[i][0] = String.join(" ", progressionToString);
            }
        }
        Engine.gameEngine(exercise, questionsAndAnswers);
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
