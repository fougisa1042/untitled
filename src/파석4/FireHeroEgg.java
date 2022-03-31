package 파석4;

import java.util.Scanner;

//불속성
public class FireHeroEgg extends Hero {

    public FireHeroEgg(String name , int level , int exp , int hp , int ad , int df , int money) {
        super(name, level, ad, df, money, exp, hp);
    }

    public void hero (String name , int level , int exp , int hp  , int ad , int df , int money   ){
        this.name = name;
        this.level = level;
        this.exp = 100;
        this.ad = ad;
        this.df = df;
        this.money = money;
        this.hp = hp;
    }

    FireHeroEgg fireHeroEgg1 =new FireHeroEgg("0",0,0,0,0,0,0);
    FireHeroEgg fireHeroEgg2 =new FireHeroEgg("0",0,0,0,0,0,0);

//공격하는 함수
    public int attack(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. 박치기 ");
        System.out.println("2. 몸통던지기");
        System.out.println("선택해 주세요");
        int number = scanner.nextInt();

        //sum은 전체 공격력을 의미하는 변수
        int sum = 0;

        //불박치기 공격
        if(number==1){
            sum += level*15;
            sum += ad*15;
            sum += df*15;
            System.out.println("데미지는" + sum + "입니다");
            return sum;
        }
        //불 몸통 던지기
        else if (number ==2){
            sum += level *10;
            sum += ad *20;
            sum += df *10;
            System.out.println("데미지는" + sum + "입니다");
            return sum;
        }
        System.out.println("데미지는" + sum + "입니다");
        return sum;
        //공격을 받는 함수
    }


    public void attacked(int sum){
        //방어력이 받은 데미지보다 큰 경우
        if(df>=sum){
            hp = hp -0 ;
        }else {
            hp = hp +df - sum;
        }
    }

    public void 상태창(){

    }
}
