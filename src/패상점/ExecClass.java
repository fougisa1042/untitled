package 패상점;

public class ExecClass {
    public static void main(String[] args) {
        // 1. 파는 상품 목록 (표시)
        // 2. 메뉴 숫자를 눌러서 구매
        // 3. 현재 판매된 누적 금액 표시
        // 4. 구매자 만들어서 구매자별 누적 금액 표
        // 5. 종료 조건 (-1) 종료

        People p1 = new People("홍길동");
        People p2 = new People("장보고");

        Store store = new Store();


        for (int i = 0; i < 9999; i++) {
            int select = store.select();
            if (select == -1) {	// -1이면 종료.
                break;
            } else if (i % 2 == 0) {	// i 가 짝수일 때는 홍길동이 구매.
                store.sellItem(p1, select);
            } else {					// i 가 홀수일 때는 장보고가 구매.
                store.sellItem(p2, select);
            }
            System.out.println("----------------------------------------");
        }
        System.out.println(p1.name + "이 구매한 총 금액 : " + p1.buyTotal);
        System.out.println(p2.name + "이 구매한 총 금액 : " + p2.buyTotal);
    }
}
