package kiosk_2;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[]args) {
        ArrayList<MenuItem> menuItemBurgerList = new ArrayList<>();

        MenuItem shackBurger = new MenuItem("1. ShackBurger",6.9,
                "토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        menuItemBurgerList.add(shackBurger);
        MenuItem smokeShack = new MenuItem("2. SmokeShack",8.9,
                "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        menuItemBurgerList.add(smokeShack);
        MenuItem cheeseburger = new MenuItem("3. Cheeseburger",6.9,
                "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        menuItemBurgerList.add(cheeseburger);
        MenuItem burger = new MenuItem("4. Hamburger",5.4,
                "비프패티를 기반으로 야채가 들어간 기본버거");
        menuItemBurgerList.add(burger);
        //컬렉션의 각 요소를 반복문으로 출력해보기.
        for (MenuItem menuItem : menuItemBurgerList ) {
            String name = menuItem.getName();
            double price = menuItem.getPrice();
            String content = menuItem.getContent();
            System.out.println(name + " | " + price + " | " + content);
        }




    }



}
