package hexlet.code;


import java.util.Random;

public class Utils {
    public static int getRandomNumber(int bound) {
        return new Random().nextInt(bound);
    }
}
