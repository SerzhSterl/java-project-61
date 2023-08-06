package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Random;
import java.util.Scanner;

public class Progression {
    public static void startProgressionGame() {

        int randBoundCoefficient = 20;
        int randBoundArray = 10;
        int gameSteps = 3;
        int arrSize = 10;
        int stepsCounter = 0;
        int firstRandNumber;
        int firstRandNumberBound = 20;
        int randNumber;
        int progressionCoefficient;
        int rightAnswer;
        int userAnswer;

        Random random = new Random();
        Scanner console = new Scanner(System.in);

        System.out.println("What number is missing in the progression?");

        for (int i = 0; i < gameSteps; i++) {

            progressionCoefficient = random.nextInt(randBoundCoefficient);
            firstRandNumber = random.nextInt(firstRandNumberBound);

            int[] progressionArr = new int[arrSize];

            for (int j = 0; j < arrSize; j++) {
                progressionArr[j] = firstRandNumber;
                firstRandNumber = firstRandNumber + progressionCoefficient;
            }
            randNumber = random.nextInt(randBoundArray);
            rightAnswer = progressionArr[randNumber];

            String[] progressionToString = new String[arrSize];

            System.out.print("Question: ");
            for (int j = 0; j < arrSize; j++) {
                progressionToString[j] = String.valueOf(progressionArr[j]);
                if (j == randNumber) {
                    progressionToString[j] = "..";
                }
                System.out.print(progressionToString[j] + " ");
            }
            System.out.println();

            System.out.print("Your answer: ");
            userAnswer = console.nextInt();

            if (rightAnswer == userAnswer) {
                System.out.println("Correct!");
                stepsCounter++;
            } else {
                System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. "
                        + "Correct answer was " + "'" + rightAnswer + "'");
                System.out.println("Let's try again, " + Cli.userName);
                break;
            }
        }
        if (stepsCounter == gameSteps) {
            System.out.println("Congratulations, " + Cli.userName + "!");
        }
    }
}
