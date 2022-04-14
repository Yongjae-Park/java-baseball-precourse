package baseball.console;

import baseball.domain.Rating;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OutputTest {

    @Test
    public void testPrintMessage() {
        String message = Output.generateMessage(1,1,false);
        assertEquals(message,Rating.ONE_BALL_ONE_STRIKE.message);
        Output.printMessage(message);
    }

}