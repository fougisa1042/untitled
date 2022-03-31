package 파석5;

import java.util.Random;
//야스오
public class Mon1Qauil extends Monstar {
    public Mon1Qauil(String name, int level, int exp, int maxExp, int hp, int maxHp, int ad, int money) {
        super(name, level, exp, maxExp, hp, maxHp, ad, money);
    }
    Mon1Qauil(){}

    public int QauilBeat() {
        int attack = this.getAd() * this.getLevel();
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + getName() + "의 그냥 박치기");
        return attack;
    }

    public int QauilBeater() {
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + getName() + "의 머리 박치기!!!");
        int QauilBeaterUp = 0;
        Random rd = new Random();
        int rand = rd.nextInt(10) + 1;
        if (rand < 3) {
            QauilBeaterUp = getAd() * 2;
        } else {
            QauilBeaterUp = this.getAd();
        }
        return QauilBeaterUp;
    }

    public void attack(Hero hero) {
        Random rd = new Random();
        int num = rd.nextInt(2) + 1;
        if (num == 1) {
            hero.setHp(hero.getHp() - this.QauilBeat());
        } else if (num == 2) {
            hero.setHp(hero.getHp() - this.QauilBeater());
        }
    }

    /*public void attack(Qauil qauil , Hero hero){
        if (qauil.getHp() > 0) {
            System.out.println("\n" + qauil.getName() + "의 공격");
            qauil.attack(hero);
        }
    }*/
}
