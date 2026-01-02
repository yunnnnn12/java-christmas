package christmas.service;

import christmas.Menu;

import java.util.ArrayList;
import java.util.List;

public class MakePriceService {
    //메뉴명 리스트 넘겨 받아야 함
    public List<Integer> makePriceService(List<String> menuList){
        List<Integer> prices = new ArrayList<>();
        for(int i = 0; i < menuList.size(); i++){

            Menu menu = Menu.valueOf(menuList.get(i));
            int price = menu.getPrice();
            prices.add(price);
        }

        return prices;
    }
}
