package 파석4;

public class Mon extends CharacterEgg {

    public int ad;
    //public int df;
    public int money;
    //public int exp;

    public Mon (String name , int level , int ad , int df , int money , int exp ,int hp ){
        this.name = name;
        this.level = level;
        this.ad = ad;
        this.df = df;
        this.money = money;
        this.exp = exp;
        this.hp = hp;
    }

    Mon(){}

    void 상태창(Mon mon){
        System.out.println("---------------");
        System.out.println("이름 : "+ mon.name);
        System.out.println("레벨 : "+ mon.level);
        System.out.println("경험치 : "+ mon.exp);
        System.out.println("체력 : "+ mon.hp);
        System.out.println("공격력 : "+ mon.ad);
        System.out.println("방어력 : "+ mon.df);
        System.out.println("돈 : "+ mon.money);
        System.out.println("---------------");
    }

    public int attack(){
        return ad;
    }


    public void attacked(int sum){ //방어력이 받는 데미지 보다 큰 경우
        //방어력이 받은 데미지보다 큰 경우
        if(df <= sum) {
            hp = hp - 0;
        } else {
            hp = hp + df - sum;
        }
    }
}
