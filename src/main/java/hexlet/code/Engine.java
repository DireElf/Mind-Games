package hexlet.code;


import java.util.Scanner;
import java.util.Random;

public class Engine {
    public static final int ROUNDS_NUMBER = 3;
    private static int gameCount;
    private static String question;

    public static String[] getTasks() {
        return tasks;
    }

    public static void setTasks(String[] newTasks) {
        Engine.tasks = newTasks;
    }

    private static String[] tasks;
    private static String[] rightAnswers;
    private static String userAnswer;

    public static void initialise(String gameQuestion, String[] gameTasks) {
        question = gameQuestion;
        tasks = gameTasks;
    }

    public static void initialise(String[] gameAnswers) {
        rightAnswers = gameAnswers;
    }

    public static void play() {
        Cli.greeting();
        for (int i = 0; i < ROUNDS_NUMBER; i++) {
            System.out.println(question);
            printTask(tasks[gameCount]);
            userAnswer = getUserAnswer();
            if (isUserAnswerCorrect(gameCount, rightAnswers)) {
                System.out.println("Correct!");
                gameCount++;
            } else {
                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was "
                        + rightAnswers[gameCount] + ".\nLet's try again, " + Cli.getUserName() + "!");
                return;
            }
        }
        congrats();
    }

    public static void congrats() {
        System.out.println("Congratulations, " + Cli.getUserName() + "!");
    }

    public static void printTask(String task) {
        System.out.print("Question: " + task + "\nYour answer: ");
    }

    public static String getUserAnswer() {
        return new Scanner(System.in).next();
    }

    public static int getRandomNumber(int bound) {
        return new Random().nextInt(bound);
    }

    public static boolean isUserAnswerCorrect(int roundNumber, String[] answers) {
        return userAnswer.equals(answers[roundNumber]);
    }
}
