package christmas.view;

import christmas.model.ManageBenefits;
import christmas.model.Order;
import christmas.service.CheckBenefitsService;

import java.text.DecimalFormat;
import java.util.List;


public class OutputView {
    DecimalFormat df = new DecimalFormat("###,###");
    public void printWelcome(){
        System.out.println("안녕하세요! 우테코 식당 12월 이벤트 플래너입니다.");
    }

    public void printBenefitMent(int date){
        System.out.printf("12월 %d일에 우테코 식당에서 받을 이벤트 혜택 미리 보기!\n", date);
        System.out.println();
    }

    public void printMenu(List<String> menus, List<String> quantities) {
        System.out.println("<주문 메뉴>");
        for(int i = 0; i < menus.size(); i++){
            System.out.printf("%s %d개\n",menus.get(i), Integer.parseInt(quantities.get(i)));
        }
        System.out.println();
    }

    public void printOriginTotalPrice(Order order){
        String totalPrice = df.format(order.getTotalPrice());
        System.out.println("<할인 전 총주문 금액>");
        System.out.printf("%s" + "원\n", totalPrice);
        System.out.println();
    }

    public void returnGiftEvent(Order order){
        System.out.println("<증정 메뉴>");
        if(order.getTotalPrice() >= 120000){
            System.out.println("샴페인 1개");
            System.out.println();
            return;
        }
        System.out.println("없음");
        System.out.println();
    }

    public void returnBenefits(ManageBenefits benefits){
        CheckBenefitsService checkBenefit = new CheckBenefitsService();
        System.out.println("<혜택 내역>");
        checkBenefit.calculateBenefits(benefits);
    }

    public void returnTotalBenefitPrice(ManageBenefits benefits){
        String totalDiscountPrice = df.format(benefits.getTotalBenefitPrice() + benefits.getGiftPrice());

        System.out.println("<총혜택 금액>");
        if(totalDiscountPrice.equals("0")){
            System.out.printf("%s원\n", totalDiscountPrice);
        }
        if(!totalDiscountPrice.equals("0")){
            System.out.printf("-%s원\n", totalDiscountPrice);
        }
        System.out.println();
    }

    public void returnAfterDiscountPrice(Order order, ManageBenefits benefits){
        String afterDiscountPrice = df.format(order.getTotalPrice() - benefits.getTotalBenefitPrice());

        System.out.println("<할인 후 예상 결제 금액>");
        System.out.printf("%s원\n", afterDiscountPrice);
        System.out.println();
    }

    public void returnBadge(ManageBenefits benefits){
        CheckBenefitsService checkBenefitsService = new CheckBenefitsService();
        System.out.println("<12월 이벤트 배지>");
        checkBenefitsService.calculateBadge(benefits);
    }
}
