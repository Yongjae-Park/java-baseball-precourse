package baseball.domain;

public class Validator {
    private final String NUMBER_REGEX = "[0-9]+";
    private final String RESTART_REGEX = "[1-2]+";

    public void inputValidator(String inputNumber) {
        if (!validateNumeric(inputNumber)) {
            throw new IllegalArgumentException(Message.IS_NOT_ONLY_NUMBER_MESSAGE.getMessage());
        }
        if (!validateSize(inputNumber)) {
            throw new IllegalArgumentException(Message.IS_NOT_THREE_DIGIT_NUMBER_MESSAGE.getMessage());
        }
    }

    private boolean validateNumeric(String inputNumber) {
        boolean isNumeric = inputNumber.matches(NUMBER_REGEX);
        return isNumeric;
    }

    private boolean validateSize(String inputNumber) {
        boolean isThreeDigitNumber = true;
        if (inputNumber.length() != 3)
            isThreeDigitNumber = false;
        return isThreeDigitNumber;
    }

    public void restartOptionValidator(String inputNumber) {
        if (!validateRestartOption(inputNumber)) {
            throw new IllegalArgumentException(Message.IS_NOT_TERMINATE_OPTION_MESSAGE.getMessage());
        }
    }

    private boolean validateRestartOption(String inputNumber) {
        boolean isRestartOptionNumeric = inputNumber.matches(RESTART_REGEX);
        return isRestartOptionNumeric;
    }
}
