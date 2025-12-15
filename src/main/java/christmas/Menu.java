package christmas.menu;

public enum Menu {
    양송이수프("애피타이저",6000),
    타파스("애피타이저",5500),
    시저샐러드("애피타이저",8000),

    티본스테이크("메인",55000),
    바비큐립("메인",54000),
    해산물파스타("메인",35000),
    티본스테이크("메인",55000),




    private final String type;
    private final int num;

    Menu(String type, int num){
        this.type = type;
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public String getType(){
        return type;
    }
}
