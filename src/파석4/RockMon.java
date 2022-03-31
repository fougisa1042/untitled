package 파석4;

//바위 클래스
public class RockMon extends Mon{
    public RockMon(String name , int level , int exp , int hp , int ad , int df , int money) {
        super(name, level, ad, df, money, exp, hp);
    }


    //공격을 하는 함수
    public int attack(){
        System.out.println("데미지는" + ad + "입니다");
        return ad;
    }

    //공격을 받는 함수
    public void attacked(int sum){
        //방어력이 받은 데미지보다 큰 경우
        if(df <= sum) {
            hp = hp - 0;
        } else {
            hp = hp + df - sum;
        }
    }
}