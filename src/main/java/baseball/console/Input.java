package baseball.console;

import baseball.domain.Message;
import camp.nextstep.edu.missionutils.Console;

public class Input {
    private static final String RESTART = "1";
    private static final String TERMINATION = "2";

    public static String getNumber() {
        String inputNumber = inputWithMessage(Message.INPUT_MESSAGE.getMessage());
        return inputNumber;
    }

    public static boolean isRestart() {
        boolean isRestart = false;
        String answer = inputWithMessage(Message.RESTART_OPTION_MESSAGE.getMessage());
        if (answer.equals(RESTART))
            isRestart = true;
        return isRestart;
    }

    private static String inputWithMessage(String message) {
        System.out.println(message);
        return Console.readLine();
    }
}
