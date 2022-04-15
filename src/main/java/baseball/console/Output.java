package baseball.console;

import baseball.domain.Rating;

public class Output {
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
