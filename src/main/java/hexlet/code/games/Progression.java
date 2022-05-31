package hexlet.code.games;


import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    public static final String QUESTION = "What number is missing in the progression?";
    private static final int PROGRESSION_DIMENSION = 100;
    private static final int PROGRESSION_SIZE = 10;
    private static final int STEP_DIMENSION = 10;
    private static int[] shadowAnswers;

    public static void prepare() {
        Engine.setQuestion(QUESTION);
        String[] tasks = new String[Engine.ROUNDS_NUMBER];
        int[] progressionRow = new int[PROGRESSION_SIZE];
        shadowAnswers = new int[Engine.ROUNDS_NUMBER];
        for (int i = 0; i < tasks.length; i++) {
            int step = Utils.getRandomNumber(STEP_DIMENSION);
            progressionRow[0] = Utils.getRandomNumber(PROGRESSION_DIMENSION);
            for (int j = 1; j < progressionRow.length; j++) {
                progressionRow[j] = progressionRow[j - 1] + step;
            }
            int answerNumber = Utils.getRandomNumber(PROGRESSION_SIZE);
            shadowAnswers[i] = progressionRow[answerNumber];
            StringBuilder sb = new StringBuilder();
            for (int k = 0; k < answerNumber; k++) {
                sb.append(progressionRow[k]);
                sb.append(" ");
            }
            sb.append(".. ");
            for (int m = answerNumber + 1; m < progressionRow.length; m++) {
                sb.append(progressionRow[m]);
                sb.append(" ");
            }
            tasks[i] = sb.toString();
        }
        Engine.setTasks(tasks);
        String[] answers = new String[Engine.ROUNDS_NUMBER];
        for (int i = 0; i < answers.length; i++) {
            answers[i] = String.valueOf(shadowAnswers[i]);
        }
        Engine.setRightAnswers(answers);
    }
}

