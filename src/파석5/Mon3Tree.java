package 파석5;

import java.util.Random;
//손
public class Mon3Tree extends Monstar{
    public Mon3Tree(String name , int level , int exp , int maxExp , int hp , int maxHp , int ad , int money ){
        super(name, level, exp, maxExp, hp, maxHp, ad, money);
    }

    Mon3Tree(){    }
    //공격하기 메소드

    public int treeBeat(){
        int attack = this.getAd() /* * 3*/;
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + getName() + "의 텟카이!");
        return attack;
    }

    public void treeHeal(){
        this.setHp(this.getHp() + 100);
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+ getName() + "의 생명의 힘!!!!!");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+ this.getName() + "체력이 " + 100 + " 증가했습니다");
    }

    public void attack(Hero hero){
        Random rd = new Random();
        int num = rd.nextInt(2) + 1 ;
        if (num == 1){
            hero.setHp(hero.getHp() - this.treeBeat());
        }else if (num == 2){
            this.treeHeal();
        }
    }
}
