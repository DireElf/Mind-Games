package hexlet.code;

import java.util.Scanner;

public class User {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void greeting() {
        System.out.println("Welcome to the Brain Games");
        Scanner scanner = new Scanner(System.in);
        System.out.println("May I have your name?");
        String name = scanner.nextLine();
        this.setName(name);
        System.out.println("Hello, " + name + "!");
    }
    public void congrats() {
        System.out.println("Congratulations, " + name + "!");
    }
}