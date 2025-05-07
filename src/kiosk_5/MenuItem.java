package kiosk_5;

public class MenuItem {
    //속
    private String name;
    private double price;
    private String content;

    //생
    //생성자에서 속성들을 정의를 해주기.

    public MenuItem(String name, double price,String content) {
        this.name = name;
        this.price = price;
        this.content = content;
    }
    //기
    public String getName() {
        String result = this.name;
        return result;
    }
    public double getPrice() {
        double result = this.price;
        return result;
    }
    public String getContent() {
        String result = this.content;
        return result;
    }
    public String toString() {
        return name + " | " + price + " | " + content;
    }
}
