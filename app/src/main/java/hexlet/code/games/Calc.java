package hexlet.code.games;


import hexlet.code.Game;

public final class Calc extends Game {
    private int firstNumber;
    private int secondNumber;
    private char operator;
    private static final int RANGE_LIMIT = 10;

    public int getFirstNumber() {
        return firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public char getOperator() {
        return operator;
    }

    @Override
    public void printHowTo() {
        System.out.println("What is the result of the expression?");
    }

    @Override
    public void defineQuestion() {
        firstNumber = getRandomNumber(RANGE_LIMIT);
        secondNumber = getRandomNumber(RANGE_LIMIT);
        char[] operators = {'+', '-', '*'};
        int choiceBound = 2;
        operator = operators[getRandomNumber(choiceBound)];
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
