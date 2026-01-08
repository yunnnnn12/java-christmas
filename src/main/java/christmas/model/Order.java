package christmas.model;

import java.util.List;

public class Order {
    private List<String> name;
    private List<Integer> price;
    private List<String> quantity;
    private List<String> type;

    private int date;
    private int totalPrice = 0;

    public Order() {
    }

    public int getDate() {
        return date;
    }
    public void setDate(int date) {
        this.date = date;
    }


    public List<String> getType() {
        return type;
    }
    public void setType(List<String> types) {
        this.type = types;
    }


    public List<Integer> getPrice() {
        return price;
    }
    public void setPrice(List<Integer> prices) {
        this.price = prices;
    }


    public int getTotalPrice() {
        return this.totalPrice;
    }
    public void setTotalPrice(Order order) {
        for(int i = 0; i < order.getName().size(); i++){
            order.totalPrice += order.getPrice().get(i) * Integer.parseInt(order.getQuantity().get(i));
        }
    }


    public List<String> getName() {
        return name;
    }
    public void setName(List<String> names) {
        this.name = names;
    }


    public List<String> getQuantity() {
        return quantity;
    }
    public void setQuantity(List<String> quantities) {
        this.quantity = quantities;
    }
}
