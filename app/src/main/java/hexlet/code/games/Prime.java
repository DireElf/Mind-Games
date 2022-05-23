package hexlet.code.games;

import hexlet.code.*;

public class Prime extends Game {
    int numberToCheck;

    @Override
    public void printHowTo() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

    }

    @Override
    public void setQuestion() {
        numberToCheck = getRandomNumber(100) + 2; // 2 is the first possible prime number
        question = String.valueOf(numberToCheck);
    }

    @Override
    public void getRightAnswer() {
        rightAnswer = "yes";
        if (numberToCheck != 2) {
            for (int i = 3; i < numberToCheck; i++) {
                if (numberToCheck % i == 0) {
                    rightAnswer = "no";
                    break;
                }
            }
        }
    }

    @Override
    public boolean isUserAnswerCorrect() {
        return userAnswer.equals(rightAnswer);
    }
}

