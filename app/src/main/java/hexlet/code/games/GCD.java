package hexlet.code.games;

import hexlet.code.Game;

public final class GCD extends Game {
    private int firstNumber;
    private int secondNumber;
    private static final int RANGE_LIMIT = 100;

    public int getFirstNumber() {
        return firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    @Override
    public void printHowTo() {
        System.out.println("Find the greatest common divisor of given numbers.");

    }

    @Override
    public void defineQuestion() {
        firstNumber = getRandomNumber(RANGE_LIMIT) + 1; // add 1 to avoid zero value
        secondNumber = getRandomNumber(RANGE_LIMIT) + 1; // add 1 to avoid zero value
        setQuestion(getFirstNumber() + " " + getSecondNumber());
    }

    @Override
    public void defineRightAnswer() {
        int a = getFirstNumber();
        int b = getSecondNumber();
        while (a != 0 && b != 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        setRightAnswer(String.valueOf(a + b));
    }

    @Override
    public boolean isUserAnswerCorrect() {
        return getUserAnswer().equals(getRightAnswer());
    }
}

