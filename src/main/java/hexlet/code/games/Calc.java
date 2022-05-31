package hexlet.code.games;


import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final String QUESTION = "What is the result of the expression?";
    private static final int RANGE_LIMIT = 10;
    private static final char[] OPERATORS = {'+', '-', '*'};

    public static void prepare() {
        Engine.setQuestion(QUESTION);
        String[] tasks = new String[Engine.ROUNDS_NUMBER];
        for (int i = 0; i < tasks.length; i++) {
            int firstNumber = Utils.getRandomNumber(RANGE_LIMIT);
            int secondNumber = Utils.getRandomNumber(RANGE_LIMIT);
            char operator = OPERATORS[Utils.getRandomNumber(OPERATORS.length)];
            tasks[i] = firstNumber + " " + operator + " " + secondNumber;
        }
        Engine.setTasks(tasks);
        String[] answers = new String[tasks.length];
        for (int i = 0; i < tasks.length; i++) {
            String[] ops = tasks[i].split(" ");
            int a = Integer.parseInt(ops[0]);
            int b = Integer.parseInt(ops[2]);
            switch (ops[1]) {
                case "*":
                    answers[i] = String.valueOf(a * b);
                    break;
                case "-":
                    answers[i] = String.valueOf(a - b);
                    break;
                case "+":
                    answers[i] = String.valueOf(a + b);
                    break;
                default:
                    break;
            }
        }
        Engine.setRightAnswers(answers);
    }
}
