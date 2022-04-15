package baseball.console;

import camp.nextstep.edu.missionutils.Console;

public class Input {

    private static final String INPUT_MESSAGE ="숫자를 입력해주세요 : ";
    private static final String RESTART_OPTION_MESSAGE = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";
    private static final String RESTART = "1";
    private static final String TERMINATION = "2";

    public static String getNumber() {
        System.out.print(INPUT_MESSAGE);
        String inputNumber = Console.readLine();
        return inputNumber;
    }

    public static boolean isRestart(){
        boolean isRestart = false;
        System.out.println(RESTART_OPTION_MESSAGE);
        String answer = Console.readLine();
        if(answer.equals(RESTART))
            isRestart = true;
        return isRestart;
    }
}
