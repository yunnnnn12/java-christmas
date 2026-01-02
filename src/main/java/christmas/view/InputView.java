package christmas.view;

import camp.nextstep.edu.missionutils.Console;
import christmas.validator.DateInputValidator;
import christmas.validator.OrderInputValidator;

public class InputView {
    public int readDate() {
        int date;
        while(true){
            System.out.println("12월 중 식당 예상 방문 날짜는 언제인가요? (숫자만 입력해 주세요!)");
            String input = Console.readLine();
            try{
                date = DateInputValidator.validateRange(input);
                break;
            } catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
        return date;
    }

    public String readMenuAndCount(int date){
        String menuAndQuantity;
        while(true){
            System.out.println("주문하실 메뉴를 메뉴와 개수를 알려 주세요. (e.g. 해산물파스타-2,레드와인-1,초코케이크-1)");
            String input = Console.readLine();
            try{
                menuAndQuantity = OrderInputValidator.validateMenuAndQuantity(Integer.toString(date), input);
                break;
            } catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
        return menuAndQuantity;
    }

}
