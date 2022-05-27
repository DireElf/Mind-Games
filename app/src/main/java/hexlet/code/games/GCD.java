package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    public static final String question = "Find the greatest common divisor of given numbers.";
    private static final int RANGE_LIMIT = 100;
    private static final int RANGE_START = 1;

    public static String[] defineTasks() {
        String[] result = new String[Engine.ROUNDS_NUMBER];
        for (int i = 0; i < result.length; i++) {
            int firstNumber = Engine.getRandomNumber(RANGE_LIMIT) + RANGE_START;
            int secondNumber = Engine.getRandomNumber(RANGE_LIMIT) + RANGE_START;
            result[i] = firstNumber + " " + secondNumber;
        }
        return result;
    }

    public static String[] defineRightAnswers(String[] tasks) {
        String[] result = new String[tasks.length];
        for (int i = 0; i < tasks.length; i++) {
            String[] task = tasks[i].split(" ");
            int a = Integer.parseInt(task[0]);
            int b = Integer.parseInt(task[1]);
            result[i] = String.valueOf(findGCD(a, b));
        }
        return result;
    }

    private static int findGCD(int a, int b) {
        while (a != 0 && b != 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        return a + b;
    }
}

