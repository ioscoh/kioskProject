package kiosk_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Kiosk {
    //속
    private ArrayList<MenuItem> menuItems;
    private Scanner scanner;


    //생
    public Kiosk(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
        this.scanner = new Scanner(System.in);
    }
    //기
    //main 함수에서 관리하던 전체 순서 제어를 Kiosk 클래스를 통해 관리합니다. (o)
    //Main에서 직접 하던 메뉴 출력·입력·반복 로직을 이곳으로 이동합니다. (o)
    //메인에 있는 메뉴아이템 객체들을 카오스크의 셋스타트의 흐름 제어 로직으로 관리하는 기능 (o)
    //흐름제어 로직은 반복문을 통해 사용자가 종료하기 전까지 반뵥 (x)
    //1)메인에서 컬렉션의 아이템 리스트 출력후에 (o)
    //2 ~ 3-3) 지시 사항인 아래의 로직 til 작성 해보기
    //2)여기 셋 스타트에서 리스트의 각요소들을 개별로 선택지정할수 있게 하기 (o)
    //3)위의 정보를 사용자의 입력으로 받게 하기 (o)
    //3-1)사용자의 입력을 받아 메뉴를 선택하거나 프로그램을 종료하기 (o)
    //3-2)유효하지 않은 입력에 대해 오류 메시지를 출력합니다. (o)
    //3-3)0을 입력하면 프로그램이 ‘뒤로가기’되거나 ‘종료’됩니다. (x)
    public void setStart() {


        //흐름제어 로직은 반복문을 통해 사용자가 종료하기 전까지 반복
        // (로직 지시 수정하기)
        //1) 원하는 항목의 번호를 입력 하세요.'0'입력시 종료
        //2) 결과값 나옴
        //3) '-1'을 입력하면 프로그램이 ‘뒤로가기’됩니다.'0' 입력시 ‘종료’.
        //3-1) 뒤로가기는 > 원하는 항목의 번호를 입력 하세요.'0'입력시 종료
        //     가 나와 로직이 반복
        //     종료 > 종료 후 끝남


        //while (종결조건) {
        //		반복할 명령문;
        //}
        int answer;
        while (true) {
            //아래는 메인에서 컬렉션의 아이템 리스트 출력시키는 로직
            System.out.println("[MenuItem: Burgeres]");
            for (MenuItem menuItem : menuItems) {
                System.out.println(menuItem.getName() + " | " + menuItem.getPrice() +
                        " | " + menuItem.getContent());
            }
            //1) 원하는 항목의 번호를 입력 하세요.'0'입력시 종료
            System.out.println("원하는 항목의 번호를 입력 하세요." +
                    "'0'입력시 종료 :");
            //2) 결과값 나옴
            String input = scanner.nextLine();
            answer = Integer.parseInt(input);
            if (answer >= 1 && answer <= menuItems.size()) {
                MenuItem selected = menuItems.get(answer - 1);
                System.out.println(selected);
            } else if (answer == 0) {
                //3) '-1'을 입력하면 프로그램이 ‘뒤로가기’됩니다.'0' 입력시 ‘종료’.
                System.out.println("종료");
                break;
            } else if (answer == -1) {
                System.out.println("뒤로가기");
            } else {
                System.out.println("잘못된 입력 > 다시 입력해 주세요");
            }
          System.out.println();//이 출력은 터미널에서 보기에 좋아보일려고 띄어쓰를 한것이다.
        }

    }
}
