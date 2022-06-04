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
        String[] answers = new String[Engine.ROUNDS_NUMBER];
        int[] hiddenAnswers = new int[Engine.ROUNDS_NUMBER];
        for (int i = 0; i < tasks.length; i++) {
            int[] progressionRow = createProgressionRow(
                    Utils.getRandomNumber(LOWER_BOUND, PROGRESSION_DIMENSION),
                    Utils.getRandomNumber(LOWER_BOUND, STEP_DIMENSION),
                    PROGRESSION_SIZE
            );
            int answerNumber = Utils.getRandomNumber(LOWER_BOUND, PROGRESSION_SIZE);
            hiddenAnswers[i] = progressionRow[answerNumber];
            answers[i] = String.valueOf(hiddenAnswers[i]);
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < progressionRow.length; j++) {
                if (j == answerNumber) {
                    sb.append("..");
                } else {
                    sb.append(progressionRow[j]);
                }
                sb.append(" ");
            }
            tasks[i] = sb.toString();
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

