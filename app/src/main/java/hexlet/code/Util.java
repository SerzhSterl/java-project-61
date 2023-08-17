package hexlet.code;

import java.util.Random;

public class Util {
    public static int generateRandomNumbers(int randBound) {
        Random random = new Random();
        int number = random.nextInt(randBound);
        return number;
    }

}
