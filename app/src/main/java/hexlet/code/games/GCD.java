package hexlet.code.games;

import hexlet.code.*;

public class GCD extends Game {
    int firstNumber;
    int secondNumber;

    @Override
    public void printHowTo() {
        System.out.println("Find the greatest common divisor of given numbers.");

    }

    @Override
    public void setQuestion() {
        firstNumber = getRandomNumber(100) + 1; // add 1 to avoid zero value
        secondNumber = getRandomNumber(100) + 1; // add 1 to avoid zero value
        question = firstNumber + " " + secondNumber;
    }

    @Override
    public void getRightAnswer() {
        int a = firstNumber;
        int b = secondNumber;
        while (a != 0 && b != 0) {
            if (a > b) a = a % b;
            else b = b % a;
        }
        rightAnswer = String.valueOf(a + b);
    }

    @Override
    public boolean isUserAnswerCorrect() {
        return userAnswer.equals(rightAnswer);
    }
}

