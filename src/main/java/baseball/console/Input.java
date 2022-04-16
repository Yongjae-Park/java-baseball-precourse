package baseball.console;

import baseball.domain.Message;
import camp.nextstep.edu.missionutils.Console;

public class Input {
    private static final String RESTART = "1";
    private static final String TERMINATION = "2";

    public static String getNumber() {
        System.out.print(Message.INPUT_MESSAGE.getMessage());
        String inputNumber = Console.readLine();
        return inputNumber;
    }

    public static boolean isRestart() {
        boolean isRestart = false;
        System.out.println(Message.RESTART_OPTION_MESSAGE.getMessage());
        String answer = Console.readLine();
        if (answer.equals(RESTART))
            isRestart = true;
        return isRestart;
    }
}
