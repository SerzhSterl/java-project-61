package hexlet.code;

import hexlet.code.games.*;
import java.util.Scanner;

public class Engine {
    public static void gameSelection() {

        var greet = 1;
        var even = 2;
        var calc = 3;
        var gcd = 4;
        var progression = 5;
        var prime = 6;

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
    public static String isPrime(int number) {
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
