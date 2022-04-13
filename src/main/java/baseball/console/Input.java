package baseball.console;

import camp.nextstep.edu.missionutils.Console;

public class Input {

    private static final String INPUT_MESSAGE ="숫자를 입력해주세요 : ";

    public static String getNumber() {
        System.out.print(INPUT_MESSAGE);
        String inputNumber = Console.readLine();
        return inputNumber;
    }

}
