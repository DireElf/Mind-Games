package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    private static final int RANGE_LIMIT = 100;
    public static final String question = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static String[] defineTasks() {
        String[] result = new String[Engine.ROUNDS_NUMBER];
        for (int i = 0; i < result.length; i++) {
            result[i] = String.valueOf(Engine.getRandomNumber(RANGE_LIMIT));
        }
        return result;
    }

    public static String[] defineRightAnswers(String[] tasks) {
        String[] result = new String[tasks.length];
        for (int i = 0; i < result.length; i++) {
            if (Integer.parseInt(tasks[i]) % 2 == 0) {
                result[i] = "yes";
            } else {
                result[i] = "no";
            }
        }
        return result;
    }
}


