package hexlet.code.games;


import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int LOWER_BOUND = 1;
    private static final int HIGHER_BOUND = 100;

    public static void play() {
        String[] tasks = new String[Engine.ROUNDS_NUMBER];
        for (int i = 0; i < tasks.length; i++) {
            tasks[i] = String.valueOf(Utils.getRandomNumber(LOWER_BOUND, HIGHER_BOUND));
        }
        String[] answers = new String[tasks.length];
        for (int i = 0; i < answers.length; i++) {
            answers[i] = checkParity(Integer.parseInt(tasks[i]));
        }
        Engine.run(DESCRIPTION, new String[][] {tasks, answers});
    }

    private static String checkParity(int number) {
        if (number % 2 == 0) {
            return "yes";
        } else {
            return "no";
        }
    }
}


