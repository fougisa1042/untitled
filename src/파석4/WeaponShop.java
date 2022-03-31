package 파석4;

public class WeaponShop extends Map {
    int commonAwl = 100;
    int commonArmor = 100;

    public int show(int money, int number){
        name = "무기상점";
        System.out.println(name + "에서 무기 구매를 시도 하는 중");

        if (number==1) {
            //송곳 가격보다 돈이 많을 때
            if (commonAwl <= money) {
                return money - commonAwl;
            }
        }

        if (number==2) {
            //갑옷 가격보다 돈이 많을 때
            if (commonArmor <= money) {
                return money - commonArmor;
            }
        }

        //돈이 부족 할 때
        return -1;
    }
}
