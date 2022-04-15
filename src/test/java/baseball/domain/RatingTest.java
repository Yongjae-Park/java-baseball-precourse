package baseball.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RatingTest {

    @Test
    public void should_OneBallOneStrikeMessage_When_OneBallOneStrikeScore() {
        String score = "1,1";
        String message = Rating.getRatingStore().get(score);
        assertEquals(message, Rating.ONE_BALL_ONE_STRIKE.getMessage());
    }
}