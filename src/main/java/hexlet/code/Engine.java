package hexlet.code;


import java.util.Scanner;

public class Engine {
    public static final int ROUNDS_NUMBER = 3;
    private static int gameCount;
    private static String question;
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
            System.out.print("Question: " + tasks[gameCount] + "\nYour answer: ");
            userAnswer = new Scanner(System.in).next();
            if (userAnswer.equals(rightAnswers[gameCount])) {
                System.out.println("Correct!");
                gameCount++;
            } else {
                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was "
                        + rightAnswers[gameCount] + ".\nLet's try again, " + Cli.getUserName() + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + Cli.getUserName() + "!");
    }

    public static String[] getTasks() {
        return tasks;
    }

    public static void setTasks(String[] newTasks) {
        Engine.tasks = newTasks;
    }
}
