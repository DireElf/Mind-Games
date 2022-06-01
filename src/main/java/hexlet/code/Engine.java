package hexlet.code;


import java.util.Scanner;

public class Engine {
    public static final int ROUNDS_NUMBER = 3;
    private static int gameCount;
    private static String question;
    private static String[] tasks;
    private static String[] rightAnswers;
    private static String userAnswer;

    public static void play() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
        for (int i = 0; i < ROUNDS_NUMBER; i++) {
            System.out.println(question);
            System.out.print("Question: " + tasks[gameCount] + "\nYour answer: ");
            userAnswer = scanner.next();
            if (userAnswer.equals(rightAnswers[gameCount])) {
                System.out.println("Correct!");
                gameCount++;
            } else {
                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was "
                        + rightAnswers[gameCount] + ".\nLet's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
        scanner.close();
    }

    public static String[] getTasks() {
        return tasks;
    }

    public static void setTasks(String[] newTasks) {
        Engine.tasks = newTasks;
    }

    public static String getQuestion() {
        return question;
    }

    public static void setQuestion(String newQuestion) {
        Engine.question = newQuestion;
    }

    public static String[] getRightAnswers() {
        return rightAnswers;
    }

    public static void setRightAnswers(String[] newRightAnswers) {
        Engine.rightAnswers = newRightAnswers;
    }

    public static String getUserAnswer() {
        return userAnswer;
    }

    public static void setUserAnswer(String newUserAnswer) {
        Engine.userAnswer = newUserAnswer;
    }
}
