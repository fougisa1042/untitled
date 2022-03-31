package 파석4;


public class woodDoor extends Mon{
    public woodDoor(String name , int level , int exp ,int hp , int ad , int df , int money){
        super(name, level, ad, df, money, exp, hp);
    }



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
