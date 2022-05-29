package hexlet.code;

import java.util.Scanner;

public class User {
    private static String name;

    public static String getName() {
        return name;
    }

    public static void greeting() {

        System.out.println("Welcome to the Brain Games!q");

        System.out.println("Welcome to the Brain Games!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("May I have your name?");
        name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }

    public static void congrats() {
        System.out.println("Congratulations, " + name + "!");
    }
}
