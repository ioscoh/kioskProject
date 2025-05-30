package kiosk_1;

import java.util.Scanner;
// **요구사항이 가지는 의도**
//  입력 처리와 간단한 흐름 제어를 복습합니다. (프로그래밍 검증**)**
// `Scanner` 활용법, 조건문, 반복문을 재확인하며 입력 데이터를 처리하는 방법 강화
// **햄버거 메뉴 출력 및 선택하기**
// `Scanner`를 사용하여 여러 햄버거 메뉴를 출력합니다.
//  제시된 메뉴 중 입력받은 숫자에 따라 다른 로직을 실행하는 코드를 작성합니다.
//  반복문을 이용해서 특정 번호가 입력되면 프로그램을 종료합니다.
public class Main {
    //속

    //생

    //기
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);


        String answer = "1";
        //23줄은 엔서가 0이 아닐때 네용을 반복한다.
        while (!answer.equals("0")) {
                System.out.println("1.ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
                System.out.println("2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
                System.out.println("3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
                System.out.println("4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
                System.out.println("0. 종료      | 종료");
                System.out.println("0 <- // 0을 입력");
                answer = scanner.next();
            }
        System.out.println("프로그램을 종료합니다.");
    }
}
