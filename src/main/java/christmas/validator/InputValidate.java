package christmas.validator;

public class InputValidate {
    public static void validateRange(String input){
        if(!input.matches("^(?:[1-9]|[12][0-9]|3[01])$")){
                throw new IllegalArgumentException("[ERROR] 유효하지 않은 날짜입니다. 다시 입력해 주세요.");

            }

        }

    }
}
