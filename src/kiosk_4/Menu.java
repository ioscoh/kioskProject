package kiosk_4;

import java.util.ArrayList;

public class Menu {
    //속

    //생

    //기
    //키오스크가 관리한던 MenuItem을 여기Menu에서 관리합니다.
    // 1) 카테고리 이름 (예: "버거", "음료")
    private String categoryName;
    // 2) 해당 카테고리의 MenuItem 리스트
    private ArrayList<MenuItem> items;

    // 생성자: 이름과 빈 리스트 초기화
    public Menu(String categoryName) {
        this.categoryName = categoryName;
        this.items = new ArrayList<>();
    }

    // 메뉴 항목 추가
    public void addItem(MenuItem item) {
        items.add(item);
    }

    // 카테고리 이름 반환
    public String getCategoryName() {
        return categoryName;
    }

    // 항목 전체 반환
    public ArrayList<MenuItem> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "[" + categoryName + " 메뉴] 총 " + items.size() + "개 항목";
    }
}
