package baseball.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class Computer {
    private final static int MIN_VALUE = 1;
    private final static int MAX_VALUE = 9;
    private final static int NUMBER_LENGTH = 3;
    private static final String RESTART = "1";

    public String generateNumber() {
        StringBuilder randomNumbers = new StringBuilder();
        while (randomNumbers.length() != NUMBER_LENGTH) {
            randomNumbers.append(randomNumberAppender(randomNumbers));
        }
        return randomNumbers.toString();
    }

    private String randomNumberAppender(StringBuilder randomNumbers) {
        int randomNumber = Randoms.pickNumberInRange(MIN_VALUE, MAX_VALUE);
        while (randomNumbers.indexOf(String.valueOf(randomNumber)) > -1) {
            randomNumber = Randoms.pickNumberInRange(MIN_VALUE, MAX_VALUE);
        }
        return String.valueOf(randomNumber);
    }

    public static boolean isRestart(String option) {
        boolean isRestart = false;
        if (option.equals(RESTART))
            isRestart = true;
        return isRestart;
    }

}
