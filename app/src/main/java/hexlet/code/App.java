package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        var greet = 1;
        var even = 2;
        var calc = 3;
        var gcd = 4;
        var progression = 5;
        var prime = 6;

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

        if (gameNumber == greet) {
            Cli.greeting();
        }
        if (gameNumber == even) {
            Cli.greeting();
            Even.startEvenGame();
        }
        if (gameNumber == calc) {
            Cli.greeting();
            Calc.startCalcGame();
        }
        if (gameNumber == gcd) {
            Cli.greeting();
            GreatestCommonDivisor.startGreatestCommonDivisor();
        }
        if (gameNumber == progression) {
            Cli.greeting();
            Progression.startProgressionGame();
        }
        if (gameNumber == prime) {
            Cli.greeting();
            Prime.startPrimeGame();
        }
    }
}
