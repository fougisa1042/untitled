package HeroChios;

public class Fire  extends Hero{

    public Fire(String name, int level , int exp , int maxExp,int hp , int maxHp , int ad , int money) {
        super(name, level, exp ,maxExp ,hp ,maxHp , ad , money);
    }

    public void show(Fire fire) {
        System.out.println(name);
        System.out.println(level);
        System.out.println(exp);
        System.out.println(maxExp);
        System.out.println(hp);
        System.out.println(maxHp);
        System.out.println(ad);
        System.out.println(money);
        System.out.println(" 나는 불입니다 ");
    }
}
