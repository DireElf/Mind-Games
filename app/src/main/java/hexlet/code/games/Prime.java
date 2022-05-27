package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    public static final String question = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int RANGE_LIMIT = 100;
    private static final int RANGE_START = 2;

    public static String[] defineTasks() {
        String[] result = new String[Engine.ROUNDS_NUMBER];
        for (int i = 0; i < result.length; i++) {
            result[i] = String.valueOf(Engine.getRandomNumber(RANGE_LIMIT) + RANGE_START);
        }
        return result;
    }

    public static String[] defineRightAnswers(String[] tasks) {
        String[] result = new String[tasks.length];
        for (int i = 0; i < tasks.length; i++) {
            result[i] = "yes";
            int a = Integer.parseInt(tasks[i]);
            if (a != RANGE_START) {
                for (int j = RANGE_START + 1; j < a; j++) {
                    if (a % j == 0) {
                        result[i] = "no";
                        break;
                    }
                }
            }
        }
        return result;
    }
}
