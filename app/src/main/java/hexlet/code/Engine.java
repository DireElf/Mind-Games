package hexlet.code;

import java.util.Scanner;

import hexlet.code.games.*;

class Engine {
    private int userChoice;

    public void chooseGame() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n0 - Exit");
        userChoice = new Scanner(System.in).nextInt();
    }

    public void startChosenGame() {
        if (userChoice == 0) return;
        User user = new User();
        user.greeting();
        if (userChoice == 2) {
            new Even().letsPlay(user);
        } else if (userChoice == 3) {
            new Calc().letsPlay(user);
        } else if (userChoice == 4) {
            new GCD().letsPlay(user);
        } else if (userChoice == 5) {
            new Progression().letsPlay(user);
        }
    }

}