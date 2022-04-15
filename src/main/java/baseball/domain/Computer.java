package baseball.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class Computer {
    private final static int MIN_VALUE = 1;
    private final static int MAX_VALUE = 9;
    private final static int NUMBER_LENGTH = 3;
    private final String NUMBER_REGEX = "[0-9]+";

    public String generateNumber(){
        StringBuilder randomNumbers = new StringBuilder();
        while(randomNumbers.length() != NUMBER_LENGTH) {
            randomNumbers.append(randomNumberAppender(randomNumbers));
        }
        return randomNumbers.toString();
    }

    private String randomNumberAppender(StringBuilder randomNumbers) {
        int randomNumber = Randoms.pickNumberInRange(MIN_VALUE, MAX_VALUE);
        while(randomNumbers.indexOf(String.valueOf(randomNumber)) > -1) {
            randomNumber = Randoms.pickNumberInRange(MIN_VALUE, MAX_VALUE);
        }
        return String.valueOf(randomNumber);
    }

    public void inputValidator(String inputNumber) {
        if(!validateNumeric(inputNumber)) {
            throw new IllegalArgumentException(Message.IS_NOT_ONLY_NUMBER_MESSAGE.getMessage());
        }
        if(!validateSize(inputNumber)) {
            throw new IllegalArgumentException(Message.IS_NOT_THREE_DIGIT_NUMBER_MESSAGE.getMessage());
        }
    }

    private boolean validateNumeric(String inputNumber) {
        boolean isNumeric = inputNumber.matches(NUMBER_REGEX);
        return isNumeric;
    }

    private boolean validateSize(String inputNumber) {
        boolean isThreeDigitNumber = true;
        if(inputNumber.length() != 3)
            isThreeDigitNumber = false;
        return isThreeDigitNumber;

    }
}
