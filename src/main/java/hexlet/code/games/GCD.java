package hexlet.code.games;


import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    public static final String[] QUESTION = {"Find the greatest common divisor of given numbers."};
    private static final int LOWER_BOUND = 1;
    private static final int HIGHER_BOUND = 100;

    public static void play() {
        String[] tasks = new String[Engine.ROUNDS_NUMBER];
        for (int i = 0; i < tasks.length; i++) {
            int firstNumber = Utils.getRandomNumber(LOWER_BOUND, HIGHER_BOUND);
            int secondNumber = Utils.getRandomNumber(LOWER_BOUND, HIGHER_BOUND);
            tasks[i] = firstNumber + " " + secondNumber;
        }
        String[] answers = new String[tasks.length];
        for (int i = 0; i < answers.length; i++) {
            String[] task = tasks[i].split(" ");
            int a = Integer.parseInt(task[0]);
            int b = Integer.parseInt(task[1]);
            answers[i] = String.valueOf(findGCD(a, b));
        }
        Engine.run(new String[][] {QUESTION, tasks, answers});
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

