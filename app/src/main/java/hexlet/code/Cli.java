package hexlet.code;
import java.util.Scanner;

public class Cli {
    private static String userName;
    public static void greeting() {
        Scanner console = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");

        userName = console.next();
        System.out.println("Hello, " + userName + "!");
    }
}
