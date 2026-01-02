package christmas.validator;

import christmas.Menu;
import christmas.service.FormatService;

import java.util.ArrayList;
import java.util.List;

public class OrderInputValidator {
    public static String validateMenuAndQuantity(String date, String inputs){
        FormatService format = new FormatService();
        List<String> inputMenus = (format.formatingOrder(inputs)).get(0);
        List<String> inputQuantity = (format.formatingOrder(inputs)).get(1);

        List<String> menus = new ArrayList<>();

        for (Menu menu : Menu.values()) {
            menus.add(menu.name());
        }

        for (String menu : inputMenus) {
            if (!menus.contains(menu)) {
                throw new IllegalArgumentException("[ERROR] 유효하지 않은 주문입니다. 다시 입력해 주세요.");
            }
        }

        for (String quantity : inputQuantity) {
            if(!quantity.matches("^[1-9]{1}$")){
                throw new IllegalArgumentException("[ERROR] 유효하지 않은 주문입니다. 다시 입력해 주세요.");
            }
        }
        return inputs;
    }

    public static void validateOrderForm(String inputs){
        if(!inputs.matches("(.*)-(.*)")){
            throw new IllegalArgumentException("[ERROR] 유효하지 않은 주문입니다. 다시 입력해 주세요.");
        }

    }

    public static void validateDuplicate(String inputs){
        FormatService format = new FormatService();
        List<String> inputMenus = (format.formatingOrder(inputs)).get(0);

        if(inputMenus.size() != inputMenus.stream().distinct().count()){
            throw new IllegalArgumentException("[ERROR] 유효하지 않은 주문입니다. 다시 입력해 주세요.");
        }
    }
}
