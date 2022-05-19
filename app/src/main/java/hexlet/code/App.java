package hexlet.code;

import java.util.Scanner;

class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n0 - Exit");
        int input = scanner.nextInt();
        if(input == 0) return;
        User user = new User();
        user.setChoice(input);
        if (input == 1) {
            user.greeting();
        } else if (input == 2) {
            user.greeting();
            Even newGame = new Even(user);
            newGame.playEvenGame();
        }
    }
}