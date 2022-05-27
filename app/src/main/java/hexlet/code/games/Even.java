package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    public static String[] tasks;
    public static String[] rightAnswers;
    private static final int RANGE_LIMIT = 100;
    public static final String question = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void initialise(int roundsNumber) {
        tasks = new String[roundsNumber];
        for (int i = 0; i < tasks.length; i++) {
            tasks[i] = defineTask();
        }
        rightAnswers = new String[roundsNumber];
        for (int j = 0; j < tasks.length; j++) {
            rightAnswers[j] = defineRightAnswer(tasks[j]);
        }
    }

    public static String defineTask() {
        return String.valueOf(Engine.getRandomNumber(RANGE_LIMIT));
    }

    public static String defineRightAnswer(String input) {
        if (Integer.parseInt(input) % 2 == 0) {
            return "yes";
        } else {
            return "no";
        }
    }
}


