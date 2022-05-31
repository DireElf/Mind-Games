package hexlet.code;


import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
import java.util.Random;
import java.util.Scanner;

public class Engine {
    private static final int EVEN_NUMBER = 2;
    private static final int CALC_NUMBER = 3;
    private static final int GCD_NUMBER = 4;
    private static final int PROGRESSION_NUMBER = 5;
    private static final int PRIME_NUMBER = 6;
    private static final int EXIT_NUMBER = 0;
    public static final int ROUNDS_NUMBER = 3;

    private static int userChoice;
    private static String userName;
    private static int gameCount;
    private static String question;
    private static String[] tasks;
    private static String[] rightAnswers;
    private static String userAnswer;

    public static void chooseGame() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");
        userChoice = new Scanner(System.in).nextInt();
        System.out.println("Your choice: " + userChoice);
    }
    public static void startChosenGame() {
        if (userChoice == EXIT_NUMBER) {
            return;
        }
        switch (userChoice) {
            default:
                greeting();
                break;
            case EVEN_NUMBER:
                initialise(Even.QUESTION, Even.defineTasks());
                initialise(Even.defineRightAnswers(tasks));
                play();
                break;
            case CALC_NUMBER:
                initialise(Calc.QUESTION, Calc.defineTasks());
                initialise(Calc.defineRightAnswers(tasks));
                play();
                break;
            case GCD_NUMBER:
                initialise(GCD.QUESTION, GCD.defineTasks());
                initialise(GCD.defineRightAnswers(tasks));
                play();
                break;
            case PROGRESSION_NUMBER:
                initialise(Progression.QUESTION, Progression.defineTasks());
                initialise(Progression.defineRightAnswers());
                play();
                break;
            case PRIME_NUMBER:
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
        greeting();
        while (gameCount < ROUNDS_NUMBER) {
            System.out.println(question);
            printTask(tasks[gameCount]);
            userAnswer = getUserAnswer();
            if (isUserAnswerCorrect(gameCount, rightAnswers)) {
                System.out.println("Correct!");
                gameCount++;
            } else {
                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was "
                        + rightAnswers[gameCount] + ".\nLet's try again, " + Engine.userName + "!");
                return;
            }
        }
        congrats();
    }

    public static void greeting() {
        System.out.println("Welcome to the Brain Games!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("May I have your name?");
        userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
    }

    public static void congrats() {
        System.out.println("Congratulations, " + userName + "!");
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
