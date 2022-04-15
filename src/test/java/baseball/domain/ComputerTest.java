package baseball.domain;

import camp.nextstep.edu.missionutils.Randoms;
import org.junit.jupiter.api.BeforeEach;
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
    public void should_IllegalArgumentException_when_notNumeric() {
        String input = "12!";
        assertThrows(IllegalArgumentException.class, () -> {
            computer.inputValidator(input);
        });
    }

    @Test
    public void should_IllegalArgumentException_when_overSize() {
        String input = "12345";
        assertThrows(IllegalArgumentException.class, () -> {
            computer.inputValidator(input);
        });
    }

    @Test
    public void generateNumber_notDuplicated_listAndSetSizeCompare() {
        String randomNumbers = computer.generateNumber();
        List<Character> afterAppendList = new ArrayList<>();
        for (char number : randomNumbers.toCharArray()) {
            afterAppendList.add(number);
        }
        Set<Character> afterAppendSet = new HashSet<>(afterAppendList);
        assertEquals(afterAppendList.size(), afterAppendSet.size());
    }

}