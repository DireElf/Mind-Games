/*package hexlet.code.games;


import hexlet.code.Engine;

public class Calc {
    private static int firstNumber;
    private static int secondNumber;
    private static char operator;
    private static final int RANGE_LIMIT = 10;
    private static String howTo = "What is the result of the expression?";
    private static String rightAnswer;

    public int getFirstNumber() {
        return firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public char getOperator() {
        return operator;
    }

    public static void defineQuestion() {
        firstNumber = ;
        secondNumber = Engine.getRandomNumber(RANGE_LIMIT);
        char[] operators = {'+', '-', '*'};
        int choiceBound = 2;
        operator = operators[Engine.getRandomNumber(choiceBound)];
        setQuestion(getFirstNumber() + " " + getOperator() + " " + getSecondNumber());
    }

    @Override
    public void defineRightAnswer() {
        switch (getOperator()) {
            case '*':
                setRightAnswer(String.valueOf(getFirstNumber() * getSecondNumber()));
                break;
            case '-':
                setRightAnswer(String.valueOf(getFirstNumber() - getSecondNumber()));
                break;
            case '+':
                setRightAnswer(String.valueOf(getFirstNumber() + getSecondNumber()));
                break;
            default:
                break;
        }
    }

    @Override
    public boolean isUserAnswerCorrect() {
        return getUserAnswer().equals(getRightAnswer());
    }
}
*/