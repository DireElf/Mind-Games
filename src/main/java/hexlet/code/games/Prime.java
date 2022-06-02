package hexlet.code.games;


import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    public static final String[] QUESTION = {"Answer 'yes' if given number is prime. Otherwise answer 'no'."};
    private static final int LOWER_BOUND = 2;
    private static final int HIGHER_BOUND = 100;

    public static void play() {
        String[] tasks = new String[Engine.ROUNDS_NUMBER];
        for (int i = 0; i < tasks.length; i++) {
            tasks[i] = String.valueOf(Utils.getRandomNumber(LOWER_BOUND, HIGHER_BOUND));
        }
        String[] answers = new String[tasks.length];
        for (int i = 0; i < answers.length; i++) {
            answers[i] = checkPrime(Integer.parseInt(tasks[i]));
        }
        Engine.run(new String[][] {QUESTION, tasks, answers});
    }

    private static String checkPrime(int number) {
        if (number != LOWER_BOUND) {
            for (int j = LOWER_BOUND + 1; j < number; j++) {
                if (number % j == 0) {
                    return "no";
                }
            }
        }
        return "yes";
    }
}
