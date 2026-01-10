package christmas.service;

import christmas.Menu;
import christmas.model.ManageBenefits;
import christmas.model.Order;

import java.text.DecimalFormat;

public class CheckBenefitsService {
    public ManageBenefits setBenefits(Order order){
        ManageBenefits manageBenefits = new ManageBenefits();

        if(order.getTotalPrice() >= 10000 && order.getType().contains("음료")){
            manageBenefits.setWeekdayDiscount(calculateWeekday(order));
            manageBenefits.setWeekendDiscount(calculateWeekend(order));
            manageBenefits.setSpecialDiscount(calculateSpecial(order));
            manageBenefits.setChristmasDiscount(calculateChristmas(order));
            manageBenefits.setGiftPrice(calculateGiftEvent(order));
        }

        return manageBenefits;
    }

    public int calculateWeekday(Order order){
        int discount = 0;
        for(int i = 0; i < order.getName().size(); i++){
            Menu menu = Menu.valueOf(order.getName().get(i));
            String type = menu.getType();
            if((type == "디저트") && (order.getDate() >=1 && order.getDate() <= 31)){
                for(int j = 0; j < Integer.parseInt(order.getQuantity().get(i)); j++){
                    discount += 2023;
                }
            }
        }

        return discount;
    }

    public int calculateWeekend(Order order){
        int discount = 0;
        for(int i = 0; i < order.getName().size(); i++){
            Menu menu = Menu.valueOf(order.getName().get(i));
            String type = menu.getType();
            if(type == "메인메뉴" && (order.getDate() >=1 && order.getDate() <= 31)){
                discount += 2023;
            }
        }

        return discount;
    }

    public int calculateSpecial(Order order){
        int date = order.getDate();
        int discount = 0;
        if(date == 3 || date == 10 || date == 17 || date == 24 || date == 25 || date == 31 ){
            discount = 1000;
        }

        return discount;
    }

    public int calculateChristmas(Order order){
        int date = order.getDate();
        int discount = 1000 + ((date-1) * 100);

        return discount;
    }

    public int calculateGiftEvent(Order order){
        int discount = 0;
        if(order.getTotalPrice() >= 120000){
            discount = 25000;
        }

        return discount;
    }

    public void calculateBadge(ManageBenefits benefits){
        if(benefits.getTotalBenefitPrice()+benefits.getGiftPrice() >= 5000 && benefits.getTotalBenefitPrice()+benefits.getGiftPrice() <= 9000){
            System.out.println("별");
        }
        if(benefits.getTotalBenefitPrice()+benefits.getGiftPrice() >= 10000 && benefits.getTotalBenefitPrice()+benefits.getGiftPrice() <= 19000){
            System.out.println("트리");
        }
        if(benefits.getTotalBenefitPrice()+benefits.getGiftPrice() >= 20000){
            System.out.println("산타");
        }
        if(benefits.getTotalBenefitPrice()+benefits.getGiftPrice() == 0){
            System.out.println("없음");
        }
    }

    public void calculateBenefits(ManageBenefits benefits){
        DecimalFormat df = new DecimalFormat("###,###");

        String weekday = df.format(benefits.getWeekdayDiscount());
        String weekend = df.format(benefits.getWeekendDiscount());
        String special = df.format(benefits.getSpecialDiscount());
        String christmas = df.format(benefits.getChristmasDiscount());
        String gift = df.format(benefits.getGiftPrice());

        if(!weekday.equals("0")){
            System.out.printf("평일 할인: -%s원", weekday);
            System.out.println();
        }
        if(!weekend.equals("0")){
            System.out.printf("주말 할인: -%s원", weekend);
            System.out.println();
        }
        if(!special.equals("0")){
            System.out.printf("특별 할인: -%s원", special);
            System.out.println();
        }
        if(!christmas.equals("0")){
            System.out.printf("크리스마스 디데이 할인: -%s원", christmas);
            System.out.println();
        }
        if(!gift.equals("0")){
            System.out.printf("증정 이벤트: -%s원", gift);
            System.out.println();
        }

        if(weekday.equals("0") && weekend.equals("0") && special.equals("0") && christmas.equals("0")){
            System.out.println("없음");
            System.out.println();
        }
    }
}
