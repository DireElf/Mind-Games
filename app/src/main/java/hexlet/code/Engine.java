package hexlet.code;

import java.util.Scanner;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

class Engine {
    private int userChoice;
    private static final int EVEN_NUMBER = 2;
    private static final int CALC_NUMBER = 3;
    private static final int GCD_NUMBER = 4;
    private static final int PROGRESSION_NUMBER = 5;
    private static final int PRIME_NUMBER = 6;
    private static final int EXIT_NUMBER = 0;


    public void chooseGame() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");
        userChoice = new Scanner(System.in).nextInt();
        System.out.println("Your choice: " + userChoice);
    }
    public void startChosenGame() {
        if (userChoice == EXIT_NUMBER) {
            return;
        }
        switch (userChoice) {
            default:
                User.greeting();
            case EVEN_NUMBER:
                new Even().letsPlay();
                break;
            case CALC_NUMBER:
                new Calc().letsPlay();
                break;
            case GCD_NUMBER:
                new GCD().letsPlay();
                break;
            case PROGRESSION_NUMBER:
                new Progression().letsPlay();
                break;
            case PRIME_NUMBER:
                new Prime().letsPlay();
        }
    }
}
