package baseball.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RefereeTest {

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
}