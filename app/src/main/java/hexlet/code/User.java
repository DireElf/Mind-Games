package hexlet.code;

import java.util.Scanner;

public class User {
    private String name;
    private int choice;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChoice() {
        return choice;
    }

    public void setChoice(int choice) {
        this.choice = choice;
    }

    public void greeting() {
        System.out.println("Welcome to the Brain Games");
        Scanner scanner = new Scanner(System.in);
        System.out.println("May I have your name?");
        String name = scanner.nextLine();
        this.setName(name);
        System.out.println("Hello, " + name + "!");
    }
}