package 패상점;

import java.util.Scanner;

public class Store {
    Item[] menu;
    int sales = 0;

    // 1. 생성자. 메뉴를 생성한다.
    public Store() {
        // TODO Auto-generated constructor stub
        menu = new Item[5];
        menu[0] = new Item("딸기우유", 1000, 10);
        menu[1] = new Item("샌드위치", 2000, 5);
        menu[2] = new Item("메로나", 800, 20);
        menu[3] = new Item("풍선껌", 500, 2);
        menu[4] = new Item("크림빵", 1000, 5);
    }

    // 2. 메뉴를 출력하는 메소드.
    public void showMenu() {
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i].name + " : " + menu[i].price);
        }
    }

    // 3. 메뉴를 선택하는 메소드.
    int selectNumber;

    public int select() {
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 99; i++) {
            this.showMenu();
            System.out.println("구매하고 싶은 메뉴 번호를 입력해주세요. -1 입력 시 종료.");
            try {
                selectNumber = Integer.parseInt(s.nextLine());
                if (selectNumber == -1) {
                    return -1;
                } else if (selectNumber >= 1 && selectNumber <= 5) {
                    return (selectNumber - 1);
                } else {
                    System.out.println("메뉴 버튼의 숫자만 입력해주세요.");
                    continue;
                }
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("메뉴 버튼의 숫자만 입력해주세요.");
            }
        }
        return -1;
    }


    public void sellItem(People people, int number) {
        if (menu[number].stock < 1) {
            System.out.println("재고가 부족합니다.");
        } else {
            this.sales = this.sales + menu[number].price;
            menu[number].stock--;
            System.out.println("판매된 총 금액 : " + this.sales);
            people.buyTotal = people.buyTotal + menu[number].price;
            System.out.println(menu[number].name + "이(가) " + people.name + "에게 판매되었습니다.");
        }
    }
}
