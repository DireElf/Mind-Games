package hexlet.code;


import java.util.Random;
import java.util.Scanner;

public abstract class Game implements Playable {
    private String question;
    private String rightAnswer;
    private String userAnswer;
    private int gameCount;
    private final int roundsAmount = 3;

    public final String getQuestion() {
        return question;
    }

    public final void setQuestion(String question) {
        this.question = question;
    }

    public final String getRightAnswer() {
        return rightAnswer;
    }

    public final void setRightAnswer(String rightAnswer) {
        this.rightAnswer = rightAnswer;
    }

    public final String getUserAnswer() {
        return userAnswer;
    }

    public final void setUserAnswer(String userAnswer) {
        this.userAnswer = userAnswer;
    }

    public final int getGameCount() {
        return gameCount;
    }

    public final void setGameCount(int gameCount) {
        this.gameCount = gameCount;
    }


    public final void letsPlay() {
        printHowTo();
        while (gameCount < roundsAmount) {
            defineQuestion();
            defineRightAnswer();
            printQuestion();
            defineUserAnswer();
            if (isUserAnswerCorrect()) {
                System.out.println("Correct!");
                gameCount++;
            } else {
                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was "
                        + rightAnswer + ".\nLet's try again, " + User.getName() + "!");
                return;
            }
        }
        User.congrats();
    }

    public final void printQuestion() {
        System.out.print("Question: " + question + "\nYour answer: ");
    }

    public final void defineUserAnswer() {
        userAnswer = new Scanner(System.in).next();
    }

    public final int getRandomNumber(int bound) {
        Random random = new Random();
        return random.nextInt(bound);
    }
}
