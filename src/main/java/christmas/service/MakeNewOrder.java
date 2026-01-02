package christmas.service;

import christmas.Menu;
import christmas.model.Order;

import java.util.ArrayList;
import java.util.List;

public class MakeNewOrder {
    //날짜 세팅
    public Order makeNewOrder(int date, String inputs){
        Order newOrder = new Order();
        ArrayList<List> menuList = makeMenuAndQuantity(inputs);

        newOrder.setName(makeMenu(menuList));
        newOrder.setQuantity(makeQuantity(menuList));

        newOrder.setPrice(makePrice(menuList.get(0)));
        newOrder.setType(makeType(menuList.get(0)));
        newOrder.setDate(date);

        return newOrder;
    }

    public void setTotalPrice(Order order){
        order.setTotalPrice(order);
    }

    public ArrayList<List> makeMenuAndQuantity(String inputs){
        FormatService formatService = new FormatService();

        ArrayList<List> menuList = formatService.formatingOrder(inputs);

        return menuList;
    }

    public List<String> makeMenu(List<List> menuList){
        List<String> menus = menuList.get(0);

        return menus;
    }

    public List<String> makeQuantity(List<List> menuList) {
        List<String> quantities = menuList.get(1);

        return quantities;
    }

    public List<String> makeType(List<String> menus){
        ArrayList<String> types = new ArrayList<>();
        for(int i = 0; i < menus.size(); i++){
            Menu menu = Menu.valueOf(menus.get(i));
            String type = menu.getType();
            types.add(type);
        }

        return types;
    }

    public List<Integer> makePrice(List<String> menus){
        ArrayList<Integer> prices = new ArrayList<>();
        for(int i = 0; i < menus.size(); i++){
            Menu menu = Menu.valueOf(menus.get(i));
            int price = menu.getPrice();
            prices.add(price);
        }

        return prices;
    }
}
