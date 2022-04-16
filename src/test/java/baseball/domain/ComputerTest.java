package baseball.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class ComputerTest {

    private Computer computer;

    @BeforeEach
    private void setUp() {
        this.computer = new Computer();
    }

    @Test
    @DisplayName("중복 없는 난수 생성 테스트")
    public void generateNumber_notDuplicated_listAndSetSizeCompare() {
        String randomNumbers = computer.generateNumber();
        List<Character> afterAppendList = new ArrayList<>();
        for (char number : randomNumbers.toCharArray()) {
            afterAppendList.add(number);
        }
        Set<Character> afterAppendSet = new HashSet<>(afterAppendList);
        assertEquals(afterAppendList.size(), afterAppendSet.size());
    }

    @Test
    @DisplayName("restart option 값에 따른 boolean값 테스트")
    public void testisRestart() {
        String restart = "1";
        assertEquals(true, computer.isRestart(restart));
    }

}