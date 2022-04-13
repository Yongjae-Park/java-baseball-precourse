package baseball.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RatingTest {

    @Test
    public void findByScore_Rating_OneBallOneStrike() {
        String score = "1,1";
        assertEquals(Rating.ONE_BALL_ONE_STRIKE.message,
                Rating.findByScore(score).message);
    }

}