package hexlet.code;


import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
import java.util.Random;
import java.util.Scanner;

public class Engine {
    public static final int ROUNDS_NUMBER = 3;

    private static String userChoice;
    private static int gameCount;
    private static String question;
    private static String[] tasks;
    private static String[] rightAnswers;
    private static String userAnswer;

    public static void chooseGame() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");
        userChoice = new Scanner(System.in).next();
        System.out.println("Your choice: " + userChoice);
    }
    public static void startChosenGame() {
        if (userChoice.equals("0")) {
            return;
        }
        switch (userChoice) {
            default:
                Cli.greeting();
                break;
            case "2":
                initialise(Even.QUESTION, Even.defineTasks());
                initialise(Even.defineRightAnswers(tasks));
                play();
                break;
            case "3":
                initialise(Calc.QUESTION, Calc.defineTasks());
                initialise(Calc.defineRightAnswers(tasks));
                play();
                break;
            case "4":
                initialise(GCD.QUESTION, GCD.defineTasks());
                initialise(GCD.defineRightAnswers(tasks));
                play();
                break;
            case "5":
                initialise(Progression.QUESTION, Progression.defineTasks());
                initialise(Progression.defineRightAnswers());
                play();
                break;
            case "6":
                initialise(Prime.QUESTION, Prime.defineTasks());
                initialise(Prime.defineRightAnswers(tasks));
                play();
                break;
        }
    }

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
