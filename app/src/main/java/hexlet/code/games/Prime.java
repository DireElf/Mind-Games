/*package hexlet.code.games;

public class Prime {
    private int numberToCheck;
    private static final int RANGE_START = 2;
    private static final int RANGE_LIMIT = 100;

    public int getNumberToCheck() {
        return numberToCheck;
    }

    @Override
    public void printHowTo() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

    }

    @Override
    public void defineQuestion() {
        numberToCheck = getRandomNumber(RANGE_LIMIT) + RANGE_START;
        setQuestion(String.valueOf(getNumberToCheck()));
    }

    @Override
    public void defineRightAnswer() {
        setRightAnswer("yes");
        if (getNumberToCheck() != RANGE_START) {
            for (int i = RANGE_START + 1; i < getNumberToCheck(); i++) {
                if (getNumberToCheck() % i == 0) {
                    setRightAnswer("no");
                    break;
                }
            }
        }
    }

    @Override
    public boolean isUserAnswerCorrect() {
        return getUserAnswer().equals(getRightAnswer());
    }
}

*/