package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Progression {

    private static final String EXERCISE = "What number is missing in the progression?";
    private static final int RAND_BOUND_COEFFICIENT = 20;
    private static final int RAND_BOUND_ARRAY = 10;
    private static final int ARR_SIZE = 10;
    private static final int FIRST_RAND_NUMBER_BOUND = 20;

    public static void startProgressionGame() {

        String[][] questionsAndAnswers = new String[Engine.GAME_STEPS_COUNT][2];

        for (int i = 0; i < Engine.GAME_STEPS_COUNT; i++) {

            int progressionCoefficient = Util.generateRandomNumbers(RAND_BOUND_COEFFICIENT);
            int firstRandNumber = Util.generateRandomNumbers(FIRST_RAND_NUMBER_BOUND);

            int[] progressionArr = generateProgression(firstRandNumber, progressionCoefficient, ARR_SIZE);

            int randNumber = Util.generateRandomNumbers(RAND_BOUND_ARRAY);
            int rightAnswer = progressionArr[randNumber];
            questionsAndAnswers[i][1] = Integer.toString(rightAnswer);

            String[] progressionToString = new String[ARR_SIZE];

            for (int j = 0; j < ARR_SIZE; j++) {
                progressionToString[j] = String.valueOf(progressionArr[j]);
                progressionToString[randNumber] = "..";
                questionsAndAnswers[i][0] = String.join(" ", progressionToString);
            }
        }
        Engine.gameEngineRun(EXERCISE, questionsAndAnswers);
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
