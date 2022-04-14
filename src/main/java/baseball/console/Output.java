package baseball.console;

import baseball.domain.Rating;

public class Output {

    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static String generateMessage(int ballCount, int strikeCount, boolean isNothing) {
        if(isNothing){
            return Rating.getRatingStore().get(Rating.NOTHING.score);
        }
        String score = generateScore(ballCount, strikeCount);
        return Rating.getRatingStore().get(score);
    }

    private static String generateScore(int ballCount, int strikeCount) {
        return String.valueOf(ballCount) +","+ String.valueOf(strikeCount);
    }
}
