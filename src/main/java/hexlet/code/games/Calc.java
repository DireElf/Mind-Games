package hexlet.code.games;


import hexlet.code.Engine;

public class Calc {
    public static final String QUESTION = "What is the result of the expression?";
    private static final int RANGE_LIMIT = 10;
    private static final char[] OPERATORS = {'+', '-', '*'};

    public static String[] defineTasks() {
        String[] result = new String[Engine.ROUNDS_NUMBER];
        for (int i = 0; i < result.length; i++) {
            int firstNumber = Engine.getRandomNumber(RANGE_LIMIT);
            int secondNumber = Engine.getRandomNumber(RANGE_LIMIT);
            char operator = OPERATORS[Engine.getRandomNumber(OPERATORS.length)];
            result[i] = firstNumber + " " + operator + " " + secondNumber;
        }
        return result;
    }

    public static String[] defineRightAnswers(String[] tasks) {
        String[] result = new String[tasks.length];
        for (int i = 0; i < tasks.length; i++) {
            String[] task = tasks[i].split(" ");
            int a = Integer.parseInt(task[0]);
            int b = Integer.parseInt(task[2]);
            switch (task[1]) {
                case "*":
                    result[i] = String.valueOf(a * b);
                    break;
                case "-":
                    result[i] = String.valueOf(a - b);
                    break;
                case "+":
                    result[i] = String.valueOf(a + b);
                    break;
                default:
                    break;
            }
        }
        return result;
    }
}
