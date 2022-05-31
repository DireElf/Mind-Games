package hexlet.code.games;


import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static final String QUESTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int RANGE_LIMIT = 100;

    public static void prepare() {
        Engine.setQuestion(QUESTION);
        String[] tasks = new String[Engine.ROUNDS_NUMBER];
        for (int i = 0; i < tasks.length; i++) {
            tasks[i] = String.valueOf(Utils.getRandomNumber(RANGE_LIMIT));
        }
        Engine.setTasks(tasks);
        String[] answers = new String[tasks.length];
        for (int i = 0; i < answers.length; i++) {
            if (Integer.parseInt(tasks[i]) % 2 == 0) {
                answers[i] = "yes";
            } else {
                answers[i] = "no";
            }
        }
        Engine.setRightAnswers(answers);
    }
}


