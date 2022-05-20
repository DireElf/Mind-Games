package hexlet.code.games;

import hexlet.code.*;

public class Even extends Game {

    @Override
    public void printHowTo() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
    }

    @Override
    public void setQuestion() {
        question = String.valueOf((int)(Math.random() * 100));
    }

    @Override
    public void getRightAnswer() {
        if (Integer.parseInt(question) % 2 == 0) {
            rightAnswer = "yes";
        } else {
            rightAnswer = "no";
        }
    }

    @Override
    public boolean isUserAnswerCorrect() {
        return userAnswer.equals(rightAnswer);
    }
}
