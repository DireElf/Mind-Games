package hexlet.code.games;


import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    public static final String QUESTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int RANGE_LIMIT = 100;
    private static final int RANGE_START = 2;

    public static void prepare() {
        Engine.setQuestion(QUESTION);
        String[] tasks = new String[Engine.ROUNDS_NUMBER];
        for (int i = 0; i < tasks.length; i++) {
            tasks[i] = String.valueOf(Utils.getRandomNumber(RANGE_LIMIT) + RANGE_START);
        }
        Engine.setTasks(tasks);
        String[] answers = new String[tasks.length];
        for (int i = 0; i < answers.length; i++) {
            answers[i] = "yes";
            int a = Integer.parseInt(tasks[i]);
            if (a != RANGE_START) {
                for (int j = RANGE_START + 1; j < a; j++) {
                    if (a % j == 0) {
                        answers[i] = "no";
                        break;
                    }
                }
            }
        }
        Engine.setRightAnswers(answers);
    }
}
