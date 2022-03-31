package HeroChios;

public class Water extends Hero{

    public Water(String name, int level , int exp , int maxExp,int hp , int maxHp , int ad , int money) {
        super(name, level, exp ,maxExp ,hp ,maxHp , ad ,money );
    }

    public void show(Water water) {
        System.out.println(name);
        System.out.println(level);
        System.out.println(exp);
        System.out.println(maxExp);
        System.out.println(hp);
        System.out.println(maxHp);
        System.out.println(money);
        System.out.println(ad);
        System.out.println("나는 물입니다");
    }
}
