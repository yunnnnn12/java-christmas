package christmas.model;

import java.util.ArrayList;

public class Orders {
    private ArrayList<Order> orders = new ArrayList<>();
    private int totalOrderPrice = 0;

    public Orders() {
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(Order order) {
        this.orders.add(order);
    }

    public int getTotalOrderPrice() {
        return totalOrderPrice;
    }

    public void setTotalOrderPrice(int totalOrderPrice) {
        for(Order order : orders){
            this.totalOrderPrice += order.getTotalPrice();
        }
    }
}
