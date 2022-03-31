package 파석4;

import java.util.Scanner;

//물속성
public class WaterHeroEgg extends Hero {
    public WaterHeroEgg(String name , int level , int exp , int hp , int ad , int df , int money) {
        super(name, level, ad, df, money, exp, hp);
    }

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
            sum += ad*30;
            System.out.println("데미지는" + sum + "입니다");
            return sum;
        }
        //불 몸통 던지기
        else if (number ==2){
            sum += level * 20;
            sum += ad * 15;
            sum += df * 15;
            System.out.println("데미지는" + sum + "입니다");
            return sum;
        }
        System.out.println("데미지는" + sum + "입니다");
        return sum;
    }

    //공격을 받는 함수
    public void attacked(int sum){
        //방어력이 받은 데미지보다 큰 경우
        if(df>=sum){
            hp = hp;
        }else {
            hp = (hp + df) - sum;
        }
    }

}
