package 파석5;

import java.util.Random;
import java.util.Scanner;

public class FireHero extends Hero {
    Scanner scanner = new Scanner(System.in);

    public FireHero(String name , int level , int exp , int maxExp ,int hp ,int maxHp , int ad , int money ){
        super(name, level, exp, maxExp, hp, maxHp, ad, money);
    }
    public FireHero(){}

    public int beat(){
        return this.getAd();
    }//그냥 공격

    public int fireBeat(){
        Random random = new Random();
        int rand = random.nextInt(4) + 1;
        int fireBeatUp = 0;
        if (rand == 1) {
            System.out.println("불꽃 박치기!!!");
            fireBeatUp = this.getAd() * 5;
        }else {
            System.out.println("빗나갔습니다");
        }
        return fireBeatUp;
    }


    public void attack(Monstar monstar){
        System.out.println(this.getName() + "의 행동을 선택해주세요");
        System.out.println("1. 몸통 박치기 2. 불꽃 박치기 3. 가방열기 4. 도망가기  "); //3. 가방(미구) 4. 도망가기(미구)
        int num = scanner.nextInt();
        if (num == 1){
            System.out.println(this.getName() +"의 몸통 박치기");
            monstar.setHp(monstar.getHp() - this.beat());
        } else if (num == 2) {
            System.out.println(this.getName() +"의 불꽃 박치기!!!");
            monstar.setHp(monstar.getHp() - this.fireBeat());
        } else if (num == 3){
            /*backpack;*/
        } else if (num == 4 ){
            run();
        } else {
            System.out.println("다시 입력해주세요");
        }
    }
}




