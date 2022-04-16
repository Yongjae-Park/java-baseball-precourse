package baseball.domain;

public enum InputCondition {
    MIN_VALUE(1),
    MAX_VALUE(9),
    NUMBER_LENGTH(3);

    private int value;

    InputCondition(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
