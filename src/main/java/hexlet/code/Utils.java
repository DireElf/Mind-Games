package hexlet.code;


import java.util.Random;

public class Utils {
    public static int getRandomNumber(int lowerBound, int higherBound) {
        int range = higherBound - lowerBound;
        return new Random().nextInt(range) + lowerBound;
    }
}
