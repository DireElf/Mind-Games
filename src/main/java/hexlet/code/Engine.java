package hexlet.code;


import java.util.Scanner;

public class Engine {
    public static final int ROUNDS_NUMBER = 3;

    public static void run(String question, String[][] gameData) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
        for (int i = 0; i < ROUNDS_NUMBER; i++) {
            System.out.println(question);
            System.out.print("Question: " + gameData[0][i] + "\nYour answer: ");
            String userAnswer = scanner.next();
            if (userAnswer.equals(gameData[1][i])) {
                System.out.println("Correct!");
            } else {
                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was "
                        + gameData[1][i] + ".\nLet's try again, " + userName + "!");
                scanner.close();
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
        scanner.close();
    }
}
