package baseball.console;

import baseball.domain.Message;
import baseball.domain.Validator;
import camp.nextstep.edu.missionutils.Console;

public class Input {

    private static Validator validator = new Validator();

    public static String getNumber() {
        String inputNumber = inputWithMessage(Message.INPUT_MESSAGE.getMessage());
        validator.inputValidator(inputNumber);
        return inputNumber;
    }

    public static String getRestartOption() {
        String isRestart = inputWithMessage(Message.RESTART_OPTION_MESSAGE.getMessage());
        validator.restartOptionValidator(isRestart);
        return isRestart;
    }

    private static String inputWithMessage(String message) {
        System.out.println(message);
        return Console.readLine();
    }
}
