package hexlet.code.games;

import hexlet.code.Game;

public final class Prime extends Game {
    private int numberToCheck;
    private final int rangeStart = 2;
    private final int rangeLimit = 100;

    public int getNumberToCheck() {
        return numberToCheck;
    }

    @Override
    public void printHowTo() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

    }

    @Override
    public void defineQuestion() {
        numberToCheck = getRandomNumber(rangeLimit) + rangeStart;
        setQuestion(String.valueOf(getNumberToCheck()));
    }

    @Override
    public void defineRightAnswer() {
        setRightAnswer("yes");
        if (getNumberToCheck() != rangeStart) {
            for (int i = rangeStart + 1; i < getNumberToCheck(); i++) {
                if (getNumberToCheck() % i == 0) {
                    setRightAnswer("no");
                    break;
                }
            }
        }
    }

    @Override
    public boolean isUserAnswerCorrect() {
        return getUserAnswer().equals(getRightAnswer());
    }
}

