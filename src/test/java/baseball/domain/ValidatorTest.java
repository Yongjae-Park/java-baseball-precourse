package baseball.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ValidatorTest {

    private Validator validator;

    @BeforeEach
    private void setUp() {
        this.validator = new Validator();
    }

    @Test
    @DisplayName("1-9 범위의 숫자 아닌 입력값 validation 테스트")
    public void should_IllegalArgumentException_when_notNumeric() {
        String input = "12!";
        assertThrows(IllegalArgumentException.class, () -> {
            validator.inputValidator(input);
        });
    }

    @Test
    @DisplayName("3자릿수 아닌 입력값 validation 테스트")
    public void should_IllegalArgumentException_when_overSize() {
        String input = "12345";
        assertThrows(IllegalArgumentException.class, () -> {
            validator.inputValidator(input);
        });
    }

    @Test
    @DisplayName("1또는 2가 아닌 restart option 입력값 validation 테스트")
    public void should_IllegalArgumentException_when_notRestartOption() {
        String input = "3";
        assertThrows(IllegalArgumentException.class, () -> {
            validator.restartOptionValidator(input);
        });
    }
}
