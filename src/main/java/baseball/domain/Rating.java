package baseball.domain;

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

    public static Rating findByScore(String score) {
        for (Rating rating : values()) {
            if (score.equals(rating.score)) {
                return rating;
            }
        }
        return null;
    }
}
