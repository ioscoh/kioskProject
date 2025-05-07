package kiosk_5;

import java.util.ArrayList;
import java.util.Scanner;

public class Kiosk {
    //속
    private ArrayList<Menu> menus;
    private Scanner scanner;


    //생
    public Kiosk(ArrayList<Menu> menus) {
        this.menus = menus;
        this.scanner = new Scanner(System.in);
    }

    //기categoryName
    public void setStart() {
        int answer;
        while (true) {
            System.out.println("=== 카테고리 선택 ===");
            for (int i = 0; i < menus.size(); i++) {
                System.out.printf("%d. %s%n", i + 1, menus.get(i).getCategoryName());
            }
            System.out.println("0. 종료");
            System.out.println("원하는 항목의 번호를 입력하세요. '0' 입력시 종료 :");
            int catSel = Integer.parseInt(scanner.nextLine());
            if (catSel == 0) break;
            if (catSel < 1 || catSel > menus.size()) { // 잘못된 입력
                System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
                continue; // 프로그램 종료
            }

            // 4) 선택된 카테고리의 MenuItem 출력
            Menu chosenMenu = menus.get(catSel - 1);
            System.out.println("[" + chosenMenu.getCategoryName() + "]");
            ArrayList<MenuItem> items = chosenMenu.getItems();
            for (int j = 0; j < items.size(); j++) {
                System.out.printf("%d. %s%n", j + 1, items.get(j));
            }
            System.out.println("0. 뒤로가기");

            System.out.println("원하는 항목의 번호를 입력하세요. '0' 입력시 뒤로가기 :");
            String input = scanner.nextLine();                    // <- 사용자 입력 읽기
            int itemSel = Integer.parseInt(input);                // <- 숫자로 변환

            if (itemSel == 0) continue;                           // 뒤로가기
            if (itemSel < 1 || itemSel > items.size()) {         // 잘못된 입력 처리
                System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
                continue;
            }
            System.out.println("선택한 메뉴: " + items.get(itemSel - 1));
            System.out.println();
        }
        System.out.println("프로그램 종료");
    }



}