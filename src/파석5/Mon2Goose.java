package 파석5;

import java.util.Random;
//리퍼
public class Mon2Goose extends Monstar {
    public Mon2Goose(String name, int level, int exp, int maxExp, int hp, int maxHp, int ad, int money) {
        super(name, level, exp, maxExp, hp, maxHp, ad, money);
    }
    Mon2Goose(){
    }


    //공격하기 메소드
    public int GooseBeat() {
        int attack = this.getAd() * 2;
        System.out.println("재채기!");
        return attack;
    }

    public int GooseBeater() {
        int attack = 0;
        Random rd = new Random();
        int rand = rd.nextInt(5);
        if (rand == 5) {
            attack = (int) ((this.getAd() + this.getLevel()) * 2.5);
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + getName() + "의 생채기!");
        } else {
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + getName() + "의 공격이 빗나갔습니다");
        }
        return attack;
    }

    public void attack(Hero hero) {
        Random rd = new Random();
        int num = rd.nextInt(2) + 1;
        if (num == 1) {
            hero.setHp(hero.getHp() - this.GooseBeater());
        } else if (num == 2) {
            hero.setHp(hero.getHp() - this.GooseBeat());
        }
    }



}
