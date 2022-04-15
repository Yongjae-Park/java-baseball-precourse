package baseball.domain;

public class Referee {
    public static final int BALL = 0;
    public static final int STRIKE = 1;
    private static final int ZERO_VALUE = 0;
    private int ballCount;
    private int strikeCount;

    public int[] scoreRater(String input, String answer){
        setBallAndStrikeCountInitialValue();
        for(int i=0;i<input.length();i++){
            ballChecker(input.charAt(i),i,answer);
            strikeChecker(input.charAt(i),i,answer);
        }
        int[] scores = setScores();
        return scores;
    }

    private void setBallAndStrikeCountInitialValue() {
        ballCount = ZERO_VALUE;
        strikeCount = ZERO_VALUE;
    }

    private int[] setScores(){
        int[] scores = new int[2];
        scores[BALL] = ballCount;
        scores[STRIKE] = strikeCount;
        return scores;
    }

    private void ballChecker(char input, int index, String answer){
        if(answer.contains(String.valueOf(input)) && answer.indexOf(input)!=index)
            ballCount++;
    }

    private void strikeChecker(char input, int index, String answer){
        if(answer.indexOf(String.valueOf(input))==index)
            strikeCount++;
    }
}
