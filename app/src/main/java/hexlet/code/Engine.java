package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;

import java.util.Scanner;

public class Engine {
    public static void gameSelection() {

        var greet = 1;
        var even = 2;
        var calc = 3;

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
    }
}
