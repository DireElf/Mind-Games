package hexlet.code;


import java.util.Scanner;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");
        Scanner scanner = new Scanner(System.in);
        String userChoice = scanner.next();
        System.out.println("Your choice: " + userChoice);
        switch (userChoice) {
            case "0":
                System.out.println("Goodbye!");
                break;
            case "1":
                Cli.greeting();
                break;
            case "2":
                Even.play();
                break;
            case "3":
                Calc.play();
                break;
            case "4":
                GCD.play();
                break;
            case "5":
                Progression.play();
                break;
            case "6":
                Prime.play();
                break;
            default:
                throw new RuntimeException("Wrong input: " + userChoice);
        }
        scanner.close();
    }
}
