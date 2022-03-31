package 파석5;

import java.util.Random;

public class Mon4Rock extends Mon3Tree {
    public Mon4Rock(String name , int level , int exp , int maxExp , int hp , int maxHp , int ad , int money ){
        super(name, level, exp, maxExp, hp, maxHp, ad, money);
    }

    Mon4Rock(){}


    public int rockBeat() {
        int attack = this.getAd() * this.getLevel();
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+ getName() + "의 금강불괴");
        return attack;
    }

    public void rockAnger() {
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+ getName() + "의 더욱 더 단단하게!!!!!");
        this.setAd(this.getAd() + 10);
    }


    public void attack(Hero hero) {
        Random rd = new Random();
        int num = rd.nextInt(4) + 1;
        if (num == 1) {
            hero.setHp(hero.getHp() - this.rockBeat());
        } else if (num == 2) {
            this.rockAnger();
        } else if (num == 3) {
            hero.setHp(hero.getHp() - this.treeBeat());
        } else if (num == 4) {
            this.treeHeal();
        }
    }
}
