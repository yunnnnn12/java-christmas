package christmas.validator;

public class DateInputValidator {
    public static int validateRange(String input){
        if(!input.matches("^[1-9]{1}$|^[1-3]{1}[0-9]{1}$|^3{1}[0-1]{1}$")){
                throw new IllegalArgumentException("[ERROR] 유효하지 않은 날짜입니다. 다시 입력해 주세요.");
        }
        return Integer.parseInt(input);
    }
}

