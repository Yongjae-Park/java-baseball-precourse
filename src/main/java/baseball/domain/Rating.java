package baseball.domain;

import java.util.HashMap;
import java.util.Map;

public enum Rating {
    NOTHING("0,0","낫싱"),
    ONE_BALL("1,0","1볼"),
    TWO_BALL("2,0","2볼"),
    THREE_BALL("3,0","3볼"),
    ONE_STRIKE("0,1","1스트라이크"),
    TWO_STRIKE("0,2","2스트라이크"),
    THREE_STRIKE("0,3","3스트라이크"),
    ONE_BALL_ONE_STRIKE("1,1","1볼 1스트라이크"),
    ONE_BALL_TWO_STRIKE("1,2","1볼 2스트라이크"),
    TWO_BALL_ONE_STRIKE("2,1","2볼 1스트라이크");

    public String score;
    public String message;

    Rating(String score, String message){
        this.score = score;
        this.message = message;
    }

    static public Map<String,String> getRatingStore() {
        return ratingStore;
    }

    static private Map<String,String> ratingStore = new HashMap<>();
    static{
        ratingStore.put(NOTHING.score, NOTHING.message);
        ratingStore.put(ONE_BALL.score, ONE_BALL.message);
        ratingStore.put(TWO_BALL.score, TWO_BALL.message);
        ratingStore.put(THREE_BALL.score, THREE_BALL.message);
        ratingStore.put(ONE_STRIKE.score, ONE_STRIKE.message);
        ratingStore.put(TWO_STRIKE.score, TWO_STRIKE.message);
        ratingStore.put(THREE_STRIKE.score, THREE_STRIKE.message);
        ratingStore.put(ONE_BALL_ONE_STRIKE.score, ONE_BALL_ONE_STRIKE.message);
        ratingStore.put(ONE_BALL_TWO_STRIKE.score, ONE_BALL_TWO_STRIKE.message);
        ratingStore.put(TWO_BALL_ONE_STRIKE.score, TWO_BALL_ONE_STRIKE.message);
    }
}
