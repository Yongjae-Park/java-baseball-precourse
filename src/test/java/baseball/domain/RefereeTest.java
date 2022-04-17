package baseball.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RefereeTest {

    private Referee referee;

    @BeforeEach
    private void setUp() {
        this.referee = new Referee();
    }

    @Test
    public void 볼카운트_체크_확인() {
        char input = '3';
        int index = 0;
        String answer = "123";
        boolean isBall = false;
        if(answer.contains(String.valueOf(input)) && answer.indexOf(input)!=index)
            isBall = true;
        assertEquals(true, isBall);
    }

    @Test
    public void 스트라이크카운트_체크_확인() {
        char input = '5';
        int index = 1;
        String answer = "456";
        boolean isStrike = false;
        if(answer.indexOf(input)==index)
            isStrike = true;
        assertEquals(true,isStrike);
    }

    @Test
    @DisplayName("scoreRater 메소드 테스트")
    public void scoreRater_OneBallOneStrike_OneBallOneStrike() {
        int[] scores = referee.scoreRater("123","253");
        assertArrayEquals(new int[] {1,1},scores);
    }
}