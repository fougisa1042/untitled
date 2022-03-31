package 파석4;

public class Hero extends CharacterEgg {


    public int ad;
    public int df;
    public int money;
    public int exp;

    public Hero (String name , int level , int exp ,int hp , int ad , int df , int money   ){
        this.name = name;
        this.level = level;
        this.ad = ad;
        this.df = df;
        this.money = money;
        this.exp = exp;
        this.hp = hp;
    }

//공격하는 함수
    public int attack() {
        return ad;
    }

    void 상태창(Hero hero){
        System.out.println("---------------스탯창---------------");
        System.out.println("이름 : "+ hero.name);
        System.out.println("레벨 : "+ hero.level);
        System.out.println("경험치 : "+ hero.exp);
        System.out.println("체력 : "+ hero.hp);
        System.out.println("공격력 : "+ hero.ad);
        System.out.println("방어력 : "+ hero.df);
        System.out.println("돈 : "+ hero.money);
        System.out.println("---------------------------------");
    }



    public void attacked(int sum){
        if( df >= sum )
            hp = hp -0;
        else {
            hp = hp + df - sum;
        }
    }
}