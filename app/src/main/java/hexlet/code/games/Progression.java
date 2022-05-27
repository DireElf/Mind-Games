package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    public static final String question = "What number is missing in the progression?";
    private int[] progressionRow;
    private int shadowAnswer;
    private static final int PROGRESSION_DIMENSION = 100;
    private static final int PROGRESSION_SIZE = 10;
    private static final int PROGRESSION_STEP_SIZE = 10;

    public static String[] defineTasks() {
        String[] result = new String[Engine.ROUNDS_NUMBER];
        for (int i = 0; i < result.length; i++) {
            
        }
        return result;
        progressionRow = new int[PROGRESSION_SIZE];
        int step = Engine.getRandomNumber(PROGRESSION_STEP_SIZE);
        progressionRow[0] = Engine.getRandomNumber(PROGRESSION_DIMENSION);
        for (int i = 1; i < progressionRow.length; i++) {
            progressionRow[i] = progressionRow[i - 1] + step;
        }
        int answerNumber = Engine.getRandomNumber(PROGRESSION_SIZE);
        shadowAnswer = progressionRow[answerNumber];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < answerNumber; i++) {
            sb.append(progressionRow[i]);
            sb.append(" ");
        }
        sb.append(".. ");
        for (int j = answerNumber + 1; j < progressionRow.length; j++) {
            sb.append(progressionRow[j]);
            sb.append(" ");
        }
        setQuestion(sb.toString());
    }

    @Override
    public void defineRightAnswer() {
        setRightAnswer(String.valueOf(getShadowAnswer()));
    }
}

