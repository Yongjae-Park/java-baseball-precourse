package baseball.domain;

public enum Message {
    INPUT_MESSAGE("숫자를 입력해주세요 : "),
    RESTART_OPTION_MESSAGE("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요."),
    WIN_MESSAGE("3개의 숫자를 모두 맞히셨습니다! 게임 종료"),
    END_MESSAGE("2를 선택하셨습니다. 진짜 종료"),
    IS_NOT_ONLY_NUMBER_MESSAGE("숫자만 입력해야 합니다."),
    IS_NOT_THREE_DIGIT_NUMBER_MESSAGE("3자리 숫자만 입력해야 합니다."),
    IS_NOT_TERMINATE_OPTION_MESSAGE("1또는 2를 입력해야 합니다.");

    private final String message;

    Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
