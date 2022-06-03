package hexlet.code.games;


import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    public static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int LOWER_BOUND = 2;
    private static final int HIGHER_BOUND = 100;

    public static void play() {
        String[] tasks = new String[Engine.ROUNDS_NUMBER];
        for (int i = 0; i < tasks.length; i++) {
            tasks[i] = String.valueOf(Utils.getRandomNumber(LOWER_BOUND, HIGHER_BOUND));
        }
        String[] answers = new String[tasks.length];
        for (int i = 0; i < answers.length; i++) {
            answers[i] = isPrime(Integer.parseInt(tasks[i])) ? "yes" : "no";
        }
        Engine.run(DESCRIPTION, new String[][] {tasks, answers});
    }

    private static boolean isPrime(int number) {
        boolean result = true;
        if (number >= LOWER_BOUND) {
            for (int j = LOWER_BOUND; j <= Math.sqrt(number); j++) {
                if (number % j == 0) {
                    return false;
                }
            }
        }
        return result;
    }
}
