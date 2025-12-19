package christmas.InputValidateTest;

import christmas.validator.InputValidate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class InputValidatorTest {
    @DisplayName("입력 받은 날짜 오류 테스트")
    @Test
    void validateRange(){
        assertThatThrownBy(() -> InputValidate.validateRange("a"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("[ERROR] 유효하지 않은 날짜입니다. 다시 입력해 주세요.");
    }

}
