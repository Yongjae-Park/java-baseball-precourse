package baseball.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RatingTest {

//    @Test
//    public void findByScore_Rating_OneBallOneStrike() {
//        String score = "1,1";
//        assertEquals(Rating.ONE_BALL_ONE_STRIKE.message,
//                Rating.findByScore(score).message);
//    }

    @Test
    public void should_OneBallOneStrikeMessage_When_OneBallOneStrikeScore() {
        String score = "1,1";
        String message = Rating.getRatingStore().get(score);
        assertEquals(Rating.ONE_BALL_ONE_STRIKE.message,message);
    }
}