package baseball.console;

import baseball.domain.Rating;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OutputTest {

    @Test
    public void testPrintMessage() {
        int[] scores = new int[2];
        scores[Output.BALL] = 1;
        scores[Output.STRIKE] = 1;
        String message = Output.generateMessage(scores);
        assertEquals(message,Rating.ONE_BALL_ONE_STRIKE.message);
    }

}