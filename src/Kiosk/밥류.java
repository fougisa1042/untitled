package Kiosk;

import java.util.Scanner;

public class 밥류 {
    String 이름;
    int 금액;

    Scanner 입력 = new Scanner(System.in); //스캐너 객체 생성

     void 밥류선택() {

         밥류 밥2 = new 밥류();
         밥류 밥1 = new 밥류();
         밥류 밥3 = new 밥류();
         밥류 밥4 = new 밥류();

         밥1.이름 = "짜장밥";
         밥2.이름 = "짬뽕밥";
         밥3.이름 = "쟁반짜장밥";
         밥4.이름 = "쟁반짬뽕밥";

         밥1.금액 = 5500;
         밥2.금액 = 6500;
         밥3.금액 = 10500;
         밥4.금액 = 12500;


        System.out.println(/*"---------------------MENU---------------------"*/);
        System.out.println("==================밥류==================");
        System.out.println("1. " + 밥1.이름 +" : " +밥1.금액 +"원");
        System.out.println("2. " + 밥2.이름 +" : " +밥2.금액 +"원");
        System.out.println("3. " + 밥3.이름 +" : " +밥3.금액 +"원");
        System.out.println("4. " + 밥4.이름 +" : " +밥4.금액 +"원");




        System.out.print("메뉴를 입력하세요 : ");
        String 유저입력 = 입력.nextLine(); //메뉴를 입력하는 것을 담아두는 곳 UserInput2

        if (유저입력.equals("1")) {
            키오스크.메뉴들[키오스크.인덱스] = 밥1.이름 +" : " +밥1.금액 +"원";
            키오스크.금액들 +=밥1.금액;
            키오스크.인덱스 +=1;
            /*Price = 5500;*/
        } else if (유저입력.equals("2")) {
            키오스크.메뉴들[키오스크.인덱스] = 밥2.이름 +" : " +밥2.금액 +"원";
            키오스크.금액들 +=밥2.금액;
            키오스크.인덱스 +=1;
            /* Price = 6500;*/
        } else if (유저입력.equals("3")) {
            키오스크.메뉴들[키오스크.인덱스] = 밥3.이름 +" : " +밥3.금액 +"원";
            키오스크.금액들 +=밥3.금액;
            키오스크.인덱스 +=1;
            /*Price = 10500;*/
        } else if (유저입력.equals("4")) {
            키오스크.메뉴들[키오스크.인덱스] = 밥4.이름 +" : " +밥4.금액 +"원";
            키오스크.금액들 +=밥4.금액;
            키오스크.인덱스 +=1;
            /*Price = 12500;*/
        } /*else {
                Kiosksoik.Menu[Kiosksoik.index] = "없는 메뉴 입니다.";
                System.out.println(Menu);
            }*/
        /*if ((UserInput2 == 1) || (UserInput2 == 2) || (UserInput2 == 3) || (UserInput2 == 4))*/ {

        }
    }
}
