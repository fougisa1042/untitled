package Kiosk;

import java.util.Scanner;

public class 면류9 {
    String 이름;
    int 금액;

    면류9(String 이름 , int 금액){
        this.이름 = 이름;
        this.금액 = 금액;
    }
    면류9() {

    }
    Scanner 입력 = new Scanner(System.in); //스캐너 객체 생성

    void 면류선택() { //시스템 메소드
        면류9 면1 = new 면류9("짜장" , 5000);
        면류9 면2 = new 면류9("짬뽕" , 6000);
        면류9 면3 = new 면류9("쟁반짜장" , 10000);
        면류9 면4 = new 면류9("쟁반짬뽕" , 12000);

        System.out.println(/*"---------------------MENU---------------------"*/);
        System.out.println("==================면류==================");
        System.out.println("1. " + 면1.이름 +" : " +면1.금액 +"원");
        System.out.println("2. " + 면2.이름 +" : " +면2.금액 +"원");
        System.out.println("3. " + 면3.이름 +" : " +면3.금액 +"원");
        System.out.println("4. " + 면4.이름 +" : " +면4.금액 +"원");

        System.out.print("메뉴를 입력하세요 : ");
        String 유저입력 = 입력.nextLine(); //메뉴를 입력하는 것을 담아두는 곳 UserInput2



        if (유저입력.equals("1")) {
            키오스크.메뉴들[키오스크.인덱스] = 면1.이름 +" : " +면1.금액 +"원";
            키오스크.금액들 +=면1.금액; //클래스 변수 Price 값을 추가함
            키오스크.인덱스 +=1;//클래스변수 index에 1을 추가함 (하지않으면 배열에 똑같은위치에서 돌아버림)
            /*Price = 5000;*/

        } else if (유저입력.equals("2")) {
            키오스크.메뉴들[키오스크.인덱스] = 면2.이름 +" : " +면2.금액 +"원";
            키오스크.금액들 +=면2.금액;
            키오스크.인덱스 +=1;
            /*Price = 6000;*/
        } else if (유저입력.equals("3")) {
            키오스크.메뉴들[키오스크.인덱스] = 면3.이름 +" : " +면3.금액 +"원";
            키오스크.금액들 +=면3.금액;
            키오스크.인덱스 +=1;
            /*Price = 10000;*/
        } else if (유저입력.equals("4")) {
            키오스크.메뉴들[키오스크.인덱스] = 면4.이름 +" : " +면4.금액 +"원";
            키오스크.금액들 +=면4.금액;
            키오스크.인덱스 +=1;
            /*Price = 12000;*/
        } /*else {
                Kiosksoik.Menu[Kiosksoik.index] = "없는 메뉴 입니다.";
                System.out.println(Menu);
            }*/
        /* if ((UserInput2 == 1) || (UserInput2 == 2) || (UserInput2 == 3) || (UserInput2 == 4))*/ {

        }
    }
}
