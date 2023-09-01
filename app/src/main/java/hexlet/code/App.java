package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GreatestCommonDivisor;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        final var greet = 1;
        final var even = 2;
        final var calc = 3;
        final var gcd = 4;
        final var progression = 5;
        final var prime = 6;

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");

        Scanner console = new Scanner(System.in);
        var gameNumber = console.nextInt();

        System.out.println("Your choice: " + gameNumber);

        switch (gameNumber) {
            case greet -> Cli.greeting();
            case even -> Even.startEvenGame();
            case calc -> Calc.startCalcGame();
            case gcd -> GreatestCommonDivisor.startGreatestCommonDivisor();
            case progression -> Progression.startProgressionGame();
            case prime -> Prime.startPrimeGame();
            default -> throw new Error("\"" + gameNumber + "\"" + " - incorrect input.");
        }
    }
}
