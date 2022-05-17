package hexlet.code;

import java.util.Scanner;

class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n0 - Exit");
        var input = scanner.nextInt();
        if (input == 1) {
            Greetings.greeting();
        } else if (input == 0) {
            return;
        }
    }
}