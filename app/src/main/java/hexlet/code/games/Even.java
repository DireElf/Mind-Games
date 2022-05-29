package hexlet.code.games;

import hexlet.code.Game;

public final class Even extends Game {
    private static final int RANGE_LIMIT = 100;

    @Override
    public void printHowTo() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
    }

    @Override
    public void defineQuestion() {
        setQuestion(String.valueOf(getRandomNumber(RANGE_LIMIT)));
    }

    @Override
    public void defineRightAnswer() {
        if (Integer.parseInt(getQuestion()) % 2 == 0) {
            setRightAnswer("yes");
        } else {
            setRightAnswer("no");
        }
    }

    @Override
    public boolean isUserAnswerCorrect() {
        return getUserAnswer().equals(getRightAnswer());
    }
}
