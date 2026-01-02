package christmas.InputValidateTest;

import christmas.validator.DateInputValidator;
import christmas.validator.OrderInputValidator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class InputValidatorTest {
    @DisplayName("입력 받은 날짜 오류 테스트")
    @Test
    void validateDateRange(){
        assertThatThrownBy(() -> DateInputValidator.validateRange("a"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("[ERROR] 유효하지 않은 날짜입니다. 다시 입력해 주세요.");
    }


    @DisplayName("존재하는 메뉴인지와 메뉴 개수 오류 테스트")
    @Test
    void validateMenuQuantity(){
        assertThatThrownBy(() -> OrderInputValidator.validateMenuAndQuantity("3","제로콜라-a"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("[ERROR] 유효하지 않은 주문입니다. 다시 입력해 주세요.");
    }

    @DisplayName("메뉴 입력 형식 테스트")
    @Test
    void validateOrderForm(){
        assertThatThrownBy(()-> OrderInputValidator.validateOrderForm("제로콜라1"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("[ERROR] 유효하지 않은 주문입니다. 다시 입력해 주세요.");
    }

    @DisplayName("메뉴 중복 테스트")
    @Test
    void validateDuplicate(){
        assertThatThrownBy(() -> OrderInputValidator.validateDuplicate("시저샐러드-1,시저샐러드-1"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("[ERROR] 유효하지 않은 주문입니다. 다시 입력해 주세요.");
    }

}
