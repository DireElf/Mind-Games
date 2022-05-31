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
        String userChoice = new Scanner(System.in).next();
        System.out.println("Your choice: " + userChoice);
        if (userChoice.equals("0")) {
            return;
        }
        switch (userChoice) {
            default:
                Cli.greeting();
                break;
            case "2":
                Even.prepare();
                Engine.play();
                break;
            case "3":
                Calc.prepare();
                Engine.play();
                break;
            case "4":
                GCD.prepare();
                Engine.play();
                break;
            case "5":
                Progression.prepare();
                Engine.play();
                break;
            case "6":
                Prime.prepare();
                Engine.play();
                break;
        }
    }
}
