package kiosk_3;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



            ArrayList<MenuItem> burgeres = new ArrayList<>();
            Kiosk burger = new Kiosk(burgeres);
            burger.setStart();
            System.out.println("원하는 항목의 번호를 입력 하세요. :" );
            int answer = scanner.nextInt();
            if (answer >= 1 && answer <= burgeres.size()) {
               MenuItem burgerItem = burgeres.get(answer - 1);
            } else if (answer == 0) {
                System.out.println("종료");
            } else {
                System.out.println("잘못된 입력");
            }




    }
}