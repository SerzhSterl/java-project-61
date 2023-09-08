package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GreatestCommonDivisor;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");

        Scanner console = new Scanner(System.in);
        var gameNumber = console.next();

        System.out.println("Your choice: " + gameNumber);

        switch (gameNumber) {
            case "1" -> Cli.greeting();
            case "2" -> Even.startEvenGame();
            case "3" -> Calc.startCalcGame();
            case "4" -> GreatestCommonDivisor.startGreatestCommonDivisor();
            case "5" -> Progression.startProgressionGame();
            case "6" -> Prime.startPrimeGame();
            default -> throw new RuntimeException("\"" + gameNumber + "\"" + " - incorrect input.");
        }
    }
}
