package hexlet.code;
import java.util.Scanner;

public class Cli {
    public static void greeting() {
        final String userName;
        Scanner console = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");

        userName = console.next();
        System.out.println("Hello, " + userName + "!");
    }
}
