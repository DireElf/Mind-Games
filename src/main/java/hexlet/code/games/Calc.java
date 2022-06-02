package hexlet.code.games;


import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final String QUESTION = "What is the result of the expression?";
    private static final int LOWER_BOUND = 1;
    private static final int HIGHER_BOUND = 100;
    private static final char[] OPERATORS = {'+', '-', '*'};

    public static void prepare() {
        Engine.setQuestion(QUESTION);
        String[] tasks = new String[Engine.ROUNDS_NUMBER];
        for (int i = 0; i < tasks.length; i++) {
            int firstNumber = Utils.getRandomNumber(LOWER_BOUND, HIGHER_BOUND);
            int secondNumber = Utils.getRandomNumber(LOWER_BOUND, HIGHER_BOUND);
            char operator = OPERATORS[Utils.getRandomNumber(LOWER_BOUND, OPERATORS.length)];
            tasks[i] = firstNumber + " " + operator + " " + secondNumber;
        }
        Engine.setTasks(tasks);
        String[] answers = new String[tasks.length];
        for (int i = 0; i < tasks.length; i++) {
            String[] ops = tasks[i].split(" ");
            answers[i] = calculate(Integer.parseInt(ops[0]), Integer.parseInt(ops[2]), ops[1]);
        }
        Engine.setRightAnswers(answers);
    }

    private static String calculate(int arg1, int arg2, String operator) {
        switch (operator) {
            case "*":
                return String.valueOf(arg1 * arg2);
            case "-":
                return String.valueOf(arg1 - arg2);
            case "+":
                return String.valueOf(arg1 + arg2);
            default:
                throw new RuntimeException("Unknown operator: " + operator);
        }
    }
}
