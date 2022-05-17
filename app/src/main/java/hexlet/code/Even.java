package hexlet.code;

import java.util.Scanner;

public class Even {
    private User user;

    public Even(User user) {
        this.user = user;
    }
    public void playEvenGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int randomNumber = getRandomNumberLessThan100();
        int count = 0;
        System.out.print("Question: " + randomNumber + "\nYour answer: ");
        var userAnswer = scanner.nextLine();
        while (count < 2) {
            if (isUserAnswerCorrect(randomNumber, userAnswer)) {
                System.out.println("Correct!");
                randomNumber = getRandomNumberLessThan100();
                count++;
                System.out.print("Question: " + randomNumber + "\nYour answer: ");
                userAnswer = scanner.nextLine();
            } else {
                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was "
                        + getRightAnswer(randomNumber) + ".\nLet's try again, " + user.getName() + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + user.getName() + "!");
    }
    private int getRandomNumberLessThan100() {
        return (int)(Math.random() * 100);
    }
    private boolean isUserAnswerCorrect(int number, String userInput) {
        return getRightAnswer(number).equals(userInput);
    }
    private String getRightAnswer(int number) {
        if(number % 2 == 0) {
            return "yes";
        } else {
            return "no";
        }
    }
}