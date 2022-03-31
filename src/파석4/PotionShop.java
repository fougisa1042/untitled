package 파석4;

public class PotionShop extends Map {
    int adP = 100;
    int dfP = 100;
    int expP = 100;
    int hpP = 10;

    public int show(int money, int number) {
        name = "포션 상점";
        System.out.println(name + "에서 포션을 구매하는 중입니다");

        if (number == 1) {
            //힘 포션 가격보다 돈이 많을 때
            if (adP <= money)
                return money - adP;
        }

        if (number == 2) {
            //방어력 포션 가격보다 돈이 많을 때
            if (dfP <= money)
                return money - dfP;
        }

        if (number == 3) {
            //경험치 포션 가격보다 돈이 많을 때
            if (expP <= money)
                return money - expP;
        }

        if (number == 4) {
            //체력 포션 가격보다 돈이 많을 때
            if (hpP <= money)
                return money - hpP;
        }
        //돈이 부족 할 때
        return -1;
    }
}