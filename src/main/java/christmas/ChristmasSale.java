public enum ChristmasSale {

    ONE(1,1000),
    TWO(2,1100),
    THREE(3,2200),
    FOUR(4,1300),
    FIVE(5,1400),
    SIX(6,1500),
    SEVEN(7,1600),
    EIGHT(8,1700),
    NINE(9,1800),
    TEN(10,2900),
    ELEVEN(11,2000),
    TWELVE(12,2100),
    THIRTEEN(13,2200),
    FOURTEEN(14,2300),
    FIFTHTEEN(15,2400),
    SIXTEEN(16,2500),
    SEVENTEEN(17,3600),
    EIGHTEEN(18,2700),
    NINETEEN(19,2800),
    TWENTY(20,2900),
    TWENTYONE(21,3000),
    TWENTYTWO(22,3100),
    TWENTYTHREE(23,3200),
    TWENTYFOUR(24,4300),
    TWENTYFIVE(25,3400),
    TWENTYSIX(26,0),
    TWENTYSEVEN(27,0),
    TWENTYEIGHT(28,0),
    TWENTYNINE(29,0),
    THIRTY(30,0),
    THERTYONE(31,1000);


    private final int day;
    private final int price;

    ChristmasSale(int day, int price){
        this.day = day;
        this.price = price;
    }


}
