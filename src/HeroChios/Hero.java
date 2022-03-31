package HeroChios;

import java.util.Scanner;

public class Hero {
    String name;
    int level , exp , maxExp;
    int hp, maxHp;
    int ad;
    int money;
    public Hero(String name, int level , int exp , int maxExp,int hp , int maxHp , int ad , int money) {
        this.name = name;
        this.level = level;
        this.exp = exp;
        this.maxExp = maxExp;
        this.hp = hp;
        this.maxHp = maxHp;
        this.ad = ad;
        this.money = money;
    }

    String 쿠키;

    Hero hero3 = new Hero("0" ,0,0,0,0,0,0,0);



    Scanner scanner = new Scanner(System.in);

    void selectHero() {
        System.out.println("영웅을 선택해주세요");
        while (true) {
            int number = scanner.nextInt();
            if (number == 1) {
                Water hero3 = new Water("물", 11111,1,1,1,1,1 ,999999999);
                hero3.showInfo(hero3);
                break;
            }

            else if (number == 2) {
                Fire hero3 = new Fire("불", 9999,1,1,1,1,1 ,1111111111);
                hero3.show(hero3);
                break;
            }

            else {
                System.out.println("다시 선택 해주세요 ");
                selectHero();
            }
        }
    }



    void show(Hero hero3) {
        System.out.println("히어로 변수에 불 물 스탯값을 넣으면 그 스탯값으로 움직인다  ");
        System.out.println("이름 : " + name);
        System.out.println("레벨 : " + level);
        System.out.println("경험치 : " + exp);
        System.out.println("최대 경험치 : " + maxExp);
        System.out.println("체력 : " + hp);
        System.out.println("최대 체력 : " + maxHp);
        System.out.println("공격력 : " + ad);
        System.out.println("소지금 : " + money);
    }

    void showInfo(Hero hero3) {
        hero3.show(hero3);
    }


}
