package baseball.console;

import baseball.domain.Rating;

public class Output {
    public static final String WIN_MESSAGE = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";
    public static final String END_MESSAGE = "2를 선택하셨습니다. 진짜 종료";
    public static final int BALL = 0;
    public static final int STRIKE = 1;

    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static String generateMessage(int[] scores) {
        String score = generateScore(scores);
        return Rating.getRatingStore().get(score);
    }

    private static String generateScore(int[] scores) {
        return String.valueOf(scores[BALL]) +","+ String.valueOf(scores[STRIKE]);
    }
}
