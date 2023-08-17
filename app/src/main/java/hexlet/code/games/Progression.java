package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;
import hexlet.code.Util;

import java.util.Scanner;

public class Progression {
    public static void startProgressionGame() {

        int randBoundCoefficient = 20;
        int randBoundArray = 10;
        int arrSize = 10;
        int firstRandNumber;
        int firstRandNumberBound = 20;
        int randNumber;
        int progressionCoefficient;
        int rightAnswer;

        String[] questions = new String[Engine.gameSteps];
        int[] numbers = new int[Engine.gameSteps];

        System.out.println("What number is missing in the progression?");

        for (int i = 0; i < Engine.gameSteps; i++) {

            progressionCoefficient = Util.generateRandomNumbers(randBoundCoefficient);
            firstRandNumber = Util.generateRandomNumbers(firstRandNumberBound);

            int[] progressionArr = generateProgression(firstRandNumber, progressionCoefficient, arrSize);

            randNumber = Util.generateRandomNumbers(randBoundArray);
            rightAnswer = progressionArr[randNumber];
            numbers[i] = rightAnswer;

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
