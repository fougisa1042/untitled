package Kiosk;

import java.util.Scanner;

public class 계산 {

    static int 금액들 = 0;
    int 거스름돈;


    void 계산대() {
        Scanner scanner = new Scanner(System.in);


        System.out.print("지불할 금액을 입력해주세요 ");
        int 입금액 = scanner.nextInt();

        /* 금액들 = (금액 * 개수);*/


        거스름돈 = 입금액 - 금액들;

        System.out.println("입금액 : " + 입금액 + "원\n" + "선택 메뉴 : " /*+ 메뉴들*//*+" 수량 : "+ 개수+"개"*/);
        if (금액들 > 입금액) {
            System.out.println("입금액이 부족합니다. 금액을 확인하세요!");
        } else {
            System.out.println("구매금액 : " + 금액들 + "원" + " 거스름돈 : " + 거스름돈 + "원");
        }

        System.out.println();
        System.out.println("계속 구매하기겠습니까? (y/n)");
        String next = scanner.next();

        if (next.equalsIgnoreCase("n")) {
            System.out.println("구매가 완료되었습니다");


        }
    }
}

