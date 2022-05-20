package hexlet.code.games;

import hexlet.code.*;

public class Calc extends Game {
    int firstNumber;
    int secondNumber;
    char operator;

    @Override
    public void printHowTo() {
        System.out.println("What is the result of the expression?");
    }

    @Override
    public void setQuestion() {
        firstNumber = getRandomNumber(10);
        secondNumber = getRandomNumber(10);
        char[] operators = {'+','-','*'};
        operator = operators[getRandomNumber(2)];
        question = firstNumber + " " + operator + " " + secondNumber;
    }

    @Override
    public void getRightAnswer() {
        switch(operator) {
            case '*':
                rightAnswer = String.valueOf(firstNumber * secondNumber);
                break;
            case '-':
                rightAnswer = String.valueOf(firstNumber - secondNumber);
                break;
            case '+':
                rightAnswer = String.valueOf(firstNumber + secondNumber);
                break;
        }
    }

    @Override
    public boolean isUserAnswerCorrect() {
        return userAnswer.equals(rightAnswer);
    }
}
