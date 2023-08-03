package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        var greet = 1;
        var even = 2;

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
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

    }
}
