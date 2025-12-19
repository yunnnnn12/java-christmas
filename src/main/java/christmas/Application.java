package christmas;

import christmas.view.InputView;

public class Application {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        try {
            inputView.readDate();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // 메시지 출력
        }
    }
}
