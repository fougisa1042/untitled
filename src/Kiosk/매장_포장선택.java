package Kiosk;
import java.util.Scanner;

class 매장_포장선택 {
    String 출력값 = "" ;
    Scanner sc = new Scanner(System.in);
    void 매장포장입력1() {

       /* 매장포장입력클 매장출력1 = new 매장포장입력클();
        매장포장입력클 포장출력1 = new 매장포장입력클();*/


        /*매장출력1.입력값 = "매장주문";
        포장출력1.입력값 = "포장주문";
*/
       /* 출력값=  매장출력1.입력값;
        출력값=  포장출력1.입력값;*/

        System.out.println("선택해주세요. (매장 : 1 , 포장 : 2)");
        String 유저입력 = sc.nextLine();//입력받은것을 UserInput에 넣어둠   // 33

        if (유저입력.equals("1")) {
            System.out.println( "매장/포장정보 :" + 출력값);
        } else if (유저입력.equals("2")) {
            System.out.println( "매장/포장정보 :" + 출력값);

        }
    }
    /*매장포장입력클 매포2 = new 매장포장입력클();
                매포2.매장포장입력1();*/


    void 매장포장입력2() {

        출력값.equals("1");
        출력값.equals("2");

        출력값 = "매장주문";
        출력값 = "포장주문";
        System.out.println("매장/포장정보 :" + 출력값 );
    }

}


/*
        매장포장입력클 매장출력2 = new 매장포장입력클();
        매장출력2.입력값 = "매장주문";

        매장포장입력클 포장출력2 = new 매장포장입력클();
        포장출력2.입력값 = "포장주문";
        */


    /*매장포장입력클 매포3 = new 매장포장입력클();
            매포3.매장포장입력2();*/



   /* public static void main(String[] args) {
        매장포장입력클래스 매장포장입력메소드 = new 매장포장입력클래스();
        매장포장입력메소드.매장포장입력메소드();

        매장포장입력클래스 매장출력 = new 매장포장입력클래스();
        매장포장입력클래스 포장출력 = new 매장포장입력클래스();
        매장출력.유저입력66 = "매장주문";
        포장출력.유저입력66 = "포장주문";



        System.out.println(포장출력.유저입력66);




            }
        }
*/
