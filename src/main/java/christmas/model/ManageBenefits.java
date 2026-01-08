package christmas.model;

public class ManageBenefits {

    private int weekdayDiscount;
    private int weekendDiscount;
    private int christmasDiscount;
    private int specialDiscount;
    private int giftPrice;

    private int totalBenefitPrice;
    private int afterDiscountPrice;

    public int getGiftPrice() {
        return giftPrice;
    }
    public void setGiftPrice(int giftPrice) {
        this.giftPrice = giftPrice;
    }


    public int getWeekdayDiscount() {
        return weekdayDiscount;
    }
    public void setWeekdayDiscount(int weekdayDiscount) {
        this.weekdayDiscount = weekdayDiscount;
    }


    public int getAfterDiscountPrice() {
        return afterDiscountPrice;
    }
    public void setAfterDiscountPrice(int afterDiscountPrice) {
        this.afterDiscountPrice = afterDiscountPrice;
    }


    public int getChristmasDiscount() {
        return christmasDiscount;
    }
    public void setChristmasDiscount(int christmasDiscount) {
        this.christmasDiscount = christmasDiscount;
    }


    public int getSpecialDiscount() {
        return specialDiscount;
    }
    public void setSpecialDiscount(int specialDiscount) {
        this.specialDiscount = specialDiscount;
    }


    public int getWeekendDiscount() {
        return weekendDiscount;
    }
    public void setWeekendDiscount(int weekendDiscount) {
        this.weekendDiscount = weekendDiscount;
    }


    public int getTotalBenefitPrice() {
        return this.totalBenefitPrice;
    }
    public void setTotalBenefitPrice(ManageBenefits benefits) {
        this.totalBenefitPrice = benefits.getWeekdayDiscount() + benefits.getWeekendDiscount() + benefits.getSpecialDiscount() + benefits.getChristmasDiscount() ;
    }
}
