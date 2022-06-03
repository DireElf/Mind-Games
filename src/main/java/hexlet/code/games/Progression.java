package hexlet.code.games;


import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    public static final String DESCRIPTION = "What number is missing in the progression?";
    private static final int PROGRESSION_DIMENSION = 100;
    private static final int PROGRESSION_SIZE = 10;
    private static final int STEP_DIMENSION = 10;
    private static final int LOWER_BOUND = 0;

    public static void play() {
        String[] tasks = new String[Engine.ROUNDS_NUMBER];
        int[] shadowAnswers = new int[Engine.ROUNDS_NUMBER];
        for (int i = 0; i < tasks.length; i++) {
            int[] progressionRow = createProgressionRow(
                    Utils.getRandomNumber(LOWER_BOUND, PROGRESSION_DIMENSION),
                    Utils.getRandomNumber(LOWER_BOUND, STEP_DIMENSION),
                    PROGRESSION_SIZE
            );
            int answerNumber = Utils.getRandomNumber(LOWER_BOUND, PROGRESSION_SIZE);
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
        String[] answers = new String[Engine.ROUNDS_NUMBER];
        for (int i = 0; i < answers.length; i++) {
            answers[i] = String.valueOf(shadowAnswers[i]);
        }
        Engine.run(DESCRIPTION, new String[][] {tasks, answers});
    }

    private static int[] createProgressionRow(int start, int step, int length) {
        int[] result = new int[length];
        for (int i = 0; i < result.length; i++) {
            result[i] = start + (step * i);
        }
        return result;
    }
}

