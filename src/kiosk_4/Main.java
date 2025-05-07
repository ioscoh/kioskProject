package kiosk_4;

import java.util.ArrayList;

public class Main {




    public static void main(String[] args) {
        //속

        //생

        //기
        // 1) 음료 메뉴 구성
        Menu drinkMenu = new Menu("[ DRINKS MENU ]");
        drinkMenu.addItem(new MenuItem("콜라", 1.5, "탄산음료"));
        drinkMenu.addItem(new MenuItem("레모네이드", 2.0, "레몬 시럽"));

        // 2) 버거 메뉴 구성
        Menu burgerMenu = new Menu("[ BURGERS MENU ]");
        burgerMenu.addItem(new MenuItem("1. ShackBurger",6.9,
                "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgerMenu.addItem(new MenuItem("2. SmokeShack",8.9,
                "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgerMenu.addItem(new MenuItem("3. Cheeseburger",6.9,
                "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgerMenu.addItem(new MenuItem("4. Hamburger",5.4,
                "비프패티를 기반으로 야채가 들어간 기본버거"));



        // 3) Kiosk 실행
        ArrayList<Menu> allMenus = new ArrayList<>();
        allMenus.add(burgerMenu);
        allMenus.add(drinkMenu);

        Kiosk kiosk = new Kiosk(allMenus);
        kiosk.setStart();


        }
}