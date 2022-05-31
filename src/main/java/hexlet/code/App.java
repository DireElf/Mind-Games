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
                Engine.initialise(Even.QUESTION, Even.defineTasks());
                Engine.initialise(Even.defineRightAnswers(Engine.getTasks()));
                Engine.play();
                break;
            case "3":
                Engine.initialise(Calc.QUESTION, Calc.defineTasks());
                Engine.initialise(Calc.defineRightAnswers(Engine.getTasks()));
                Engine.play();
                break;
            case "4":
                Engine.initialise(GCD.QUESTION, GCD.defineTasks());
                Engine.initialise(GCD.defineRightAnswers(Engine.getTasks()));
                Engine.play();
                break;
            case "5":
                Engine.initialise(Progression.QUESTION, Progression.defineTasks());
                Engine.initialise(Progression.defineRightAnswers());
                Engine.play();
                break;
            case "6":
                Engine.initialise(Prime.QUESTION, Prime.defineTasks());
                Engine.initialise(Prime.defineRightAnswers(Engine.getTasks()));
                Engine.play();
                break;
        }
    }
}
