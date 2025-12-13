package christmas.model;

import java.util.List;

public class Order {
    private List<String> menu;

    private List<Integer> count;

    private int day;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public Order(List<String> menu, List<Integer> count, int day) {
        this.menu = menu;
        this.count = count;
        this.day = day;
    }

    public List<String> getMenu() {
        return menu;
    }

    public void setMenu(List<String> menu) {
        this.menu = menu;
    }

    public List<Integer> getCount() {
        return count;
    }

    public void setCount(List<Integer> count) {
        this.count = count;
    }
}
