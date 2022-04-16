package baseball.domain;

public enum ScoreOption {
    BALL(0),
    STRIKE(1);

    private int option;

    ScoreOption(int option) {
        this.option = option;
    }

    public int getOption() {
        return option;
    }
}
