package hexlet.code;

import java.util.Scanner;
import hexlet.code.games.*;

class Engine {
    private int userChoice;
    public void chooseGame() {
        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n3 - Calc\n0 - Exit");
        userChoice = new Scanner(System.in).nextInt();
    }

    public void startChosenGame() {
        if(userChoice == 0) return;
        User user = new User();
        if (userChoice == 1) {
            user.greeting();
        } else if (userChoice == 2) {
            user.greeting();
            new Even().letsPlay(user);
        } else if (userChoice == 3) {
            user.greeting();
            new Calc().letsPlay(user);
        }
    }

}