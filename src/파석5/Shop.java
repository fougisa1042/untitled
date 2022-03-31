package 파석5;

import java.util.Scanner;

public class Shop extends Map {
    String shopName;
    int cost;
    int upGage;
    int count;
    
    Shop(String shopName , int cost , int upGage ,int count){
        this.shopName = shopName;
        this.cost = cost;
        this.upGage = upGage;
        this.count = count;
    }

    Shop(){
    }

   // Hero hero = new Hero();
    
    void sell(Hero hero) {
        Scanner scanner = new Scanner(System.in);


        Shop adEnhance = new Shop("[공격력 인챈트]" , 100 , 100,0);
        Shop maxHpEnhance = new Shop("[최대 체력 인챈트]" , 100 , 100,0);
        Shop hpPotion = new Shop("[체력 물약]" , 100 , 100,0);
        Shop expPotion = new Shop("[경험치 물약]" , 100 , 100,0);

        shopName = "---------------상점---------------";
        System.out.println(shopName + "[소지금] : " + hero.getMoney() + "원");
        System.out.println("1." + adEnhance.shopName + " : " + adEnhance.cost + " 원");
        System.out.println("2." + maxHpEnhance.shopName + " : " + maxHpEnhance.cost + " 원");
        System.out.println("3." + hpPotion.shopName + " : " + hpPotion.cost + " 원");
        System.out.println("4." + expPotion.shopName + " : " + expPotion.cost + " 원");
        System.out.println("5. 뒤로가기");
        String number = scanner.nextLine();



        if (number.equals("1")) {
            //힘 인챈트 가격보다 돈이 많을 때
            if (adEnhance.cost <= hero.getMoney()) {
                hero.setMoney(hero.getMoney() - adEnhance.cost);
                hero.setAd(hero.getAd()+ adEnhance.upGage);
                System.out.println(adEnhance.shopName+"를 구입이 하였습니다");
                System.out.println("인챈트에 성공하여 공격력이 " + adEnhance.upGage + " 만큼 증가 \n" + "현재 공격력 : " + hero.getAd());
                System.out.println("현재 남은 금액 : " + hero.getMoney() + "원 ");
                System.out.println();
            }else {
                System.out.println("소지금이 부족합니다\n");
            }
        }

        else if (number.equals("2")) {
            //최대 체력 인챈트 가격보다 돈이 많을 때
            if (maxHpEnhance.cost <= hero.getMoney()) {
                hero.setMoney(hero.getMoney() - maxHpEnhance.cost);
                hero.setMaxHp(hero.getMaxHp() + maxHpEnhance.upGage);
                System.out.println(maxHpEnhance.shopName+"를 구입이 하였습니다");
                System.out.println("인챈트에 성공하여 최대 체력이 " + maxHpEnhance.upGage + " 만큼 증가 \n" + "현재 최대 체력 : " + hero.getMaxHp());
                System.out.println("현재 남은 금액 : " + hero.getMoney()+ "원 ");
                System.out.println();
            }else {
                System.out.println("소지금이 부족합니다\n");
            }
        }

        else if (number.equals("3")) {
            //체력 포션 가격보다 돈이 많을 때
            if (hpPotion.cost <= hero.getMoney()) {
                hero.setMoney(hero.getMoney() - hpPotion.cost);
                hero.setHp(hero.getHp()+ hpPotion.upGage);
                System.out.println(hpPotion.shopName+"를 구입이 하였습니다");
                System.out.println("체력이 " + hpPotion.upGage + " 만큼 증가 \n" + "현재 체력 : " + hero.getHp());
                System.out.println("현재 남은 금액 : " + hero.getMoney()+ "원 ");
                System.out.println();
            }else {
                System.out.println("소지금이 부족합니다\n");
            }
        }

        else if (number.equals("4")) {
            //경험치 포션 가격보다 돈이 많을 때
            if (expPotion.cost <= hero.getMoney()) {
                hero.setMoney(hero.getMoney() - expPotion.cost);
                hero.setExp(hero.getExp()+ expPotion.upGage);
                System.out.println(expPotion.shopName+"를 구입이 하였습니다");
                System.out.println("경험치가 " + expPotion.upGage + " 만큼 증가 \n" +"현재 경험치 : " + hero.getExp());
                System.out.println("현재 남은 금액 : " + hero.getMoney()+ "원 ");
                System.out.println();
            }else {
                System.out.println("소지금이 부족합니다\n");
            }
        }else if (number.equals("5")){
            System.out.println("(끼익... 철컥)\n");
        }

        else {
            System.out.println("제대로 입력하지 않거면 나가");
        }
        //돈이 부족 할 때

    }
}
