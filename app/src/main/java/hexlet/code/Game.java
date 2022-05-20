package hexlet.code;


import java.util.Random;
import java.util.Scanner;

public abstract class Game {
    public String question;
    public String rightAnswer;
    public String userAnswer;
    public int gameCount;

    public void letsPlay(User user) {
        printHowTo();
        setQuestion();
        getRightAnswer();
        printQuestion();
        getUserAnswer();
        while (gameCount < 2) {
            if (isUserAnswerCorrect()) {
                System.out.println("Correct!");
                gameCount++;
                setQuestion();
                getRightAnswer();
                printQuestion();
                getUserAnswer();
            } else {
                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was "
                        + rightAnswer + ".\nLet's try again, " + user.getName() + "!");
                return;
            }
        }
        user.congrats();
    }

    public abstract void printHowTo();

    public abstract void setQuestion();

    public void printQuestion() {
        System.out.print("Question: " + question + "\nYour answer: ");
    }

    public void getUserAnswer() {
        userAnswer = new Scanner(System.in).next();
    }

    public abstract void getRightAnswer();

    public abstract boolean isUserAnswerCorrect();

    public int getRandomNumber(int bound) {
        Random random = new Random();
        return random.nextInt(bound);
    }
}