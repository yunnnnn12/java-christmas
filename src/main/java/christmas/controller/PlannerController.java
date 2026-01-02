package christmas.controller;

import christmas.model.ManageBenefits;
import christmas.model.Order;
import christmas.service.CheckBenefitsService;
import christmas.service.MakeNewOrder;
import christmas.view.InputView;
import christmas.view.OutputView;


public class PlannerController {
    InputView inputView = new InputView();
    OutputView outputView = new OutputView();
    MakeNewOrder makeNewOrder = new MakeNewOrder();

    ManageBenefits benefits = new ManageBenefits();
    CheckBenefitsService checkBenefits = new CheckBenefitsService();

    Order newOrder = new Order();

    public void run(){
        outputView.printWelcome();
        int date = inputView.readDate();

        String order = inputView.readMenuAndCount(date);


        newOrder = makeNewOrder.makeNewOrder(date, order);


        makeNewOrder.setTotalPrice(newOrder);// 오더의 총가격 설정(오리지널)


        outputView.printBenefitMent(date);

        outputView.printMenu(newOrder.getName(), newOrder.getQuantity());


        outputView.printOriginTotalPrice(newOrder);

        outputView.returnGiftEvent(newOrder); //증정 이벤트

        benefits = checkBenefits.setBenefits(newOrder);//혜택 객체 초기화

        outputView.returnBenefits(benefits);//혜택 내역 출력



        benefits.setTotalBenefitPrice(benefits);

        outputView.returnTotalBenefitPrice(benefits);

        outputView.returnAfterDiscountPrice(newOrder, benefits);

        outputView.returnBadge(benefits);



















    }


}
