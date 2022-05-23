package hexlet.code.games;

import hexlet.code.*;

public class Progression extends Game {
    int[] progressionRow;
    int shadowAnswer;

    @Override
    public void printHowTo() {
        System.out.println("What number is missing in the progression?");

    }

    @Override
    public void setQuestion() {
        progressionRow = new int[10];
        int step = getRandomNumber(10);
        progressionRow[0] = getRandomNumber(100);
        for (int i = 1; i < progressionRow.length; i++) {
            progressionRow[i] = progressionRow[i - 1] + step;
        }
        int answerNumber = getRandomNumber(10);
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
        question = sb.toString();
    }

    @Override
    public void getRightAnswer() {
        rightAnswer = String.valueOf(shadowAnswer);
    }

    @Override
    public boolean isUserAnswerCorrect() {
        return userAnswer.equals(rightAnswer);
    }
}

