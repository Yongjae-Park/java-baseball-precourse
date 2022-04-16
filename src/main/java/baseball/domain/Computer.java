package baseball.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class Computer {
    private static final String RESTART = "1";

    public String generateNumber() {
        StringBuilder randomNumbers = new StringBuilder();
        while (randomNumbers.length() != InputCondition.NUMBER_LENGTH.getValue()) {
            randomNumbers.append(randomNumberAppender(randomNumbers));
        }
        return randomNumbers.toString();
    }

    private String randomNumberAppender(StringBuilder randomNumbers) {
        int randomNumber = Randoms.pickNumberInRange(
                InputCondition.MIN_VALUE.getValue(), InputCondition.MAX_VALUE.getValue());
        while (randomNumbers.indexOf(String.valueOf(randomNumber)) > -1) {
            randomNumber = Randoms.pickNumberInRange(
                    InputCondition.MIN_VALUE.getValue(), InputCondition.MAX_VALUE.getValue());
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
