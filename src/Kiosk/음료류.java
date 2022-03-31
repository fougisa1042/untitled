package Kiosk;

import java.util.Scanner;

public class 음료류 {
     String 이름;
     int 금액;

        Scanner 입력 = new Scanner(System.in); //스캐너 객체 생성

        void 음료류선택() {

            음료류 음료1 = new 음료류();
            음료류 음료2 = new 음료류();
            음료류 음료3 = new 음료류();
            음료류 음료4 = new 음료류();

            음료1.이름 = "콜라";
            음료2.이름 = "소주";
            음료3.이름 = "칭따오";
            음료4.이름 = "만만춘";

            음료1.금액 = 2000;
            음료2.금액 = 3000;
            음료3.금액 = 4000;
            음료4.금액 = 5555;

            System.out.println("==================음료&주류==================");
            System.out.println("1. " + 음료1.이름 +" : " +음료1.금액 +"원");
            System.out.println("2. " + 음료2.이름 +" : " +음료2.금액 +"원");
            System.out.println("3. " + 음료3.이름 +" : " +음료3.금액 +"원");
            System.out.println("4. " + 음료4.이름 +" : " +음료4.금액 +"원");
            

            System.out.print("메뉴를 입력하세요 : ");
            String 유저입력 = 입력.nextLine(); //메뉴를 입력하는 것을 담아두는 곳 UserInput2

            if (유저입력.equals("1")) {
                키오스크.메뉴들[키오스크.인덱스] = 음료1.이름 +" : " +음료1.금액 +"원";
                키오스크.금액들 +=음료1.금액;
                키오스크.인덱스 +=1;
                /*Price = 2000;*/
            } else if (유저입력.equals("2")) {
                키오스크.메뉴들[키오스크.인덱스] = 음료2.이름 +" : " +음료2.금액 +"원";
                키오스크.금액들 +=음료2.금액;
                키오스크.인덱스 +=1;
                /*Price = 3000;*/
            } else if (유저입력.equals("3")) {
                키오스크.메뉴들[키오스크.인덱스] = 음료3.이름 +" : " +음료3.금액 +"원";
                키오스크.금액들 +=음료3.금액;
                키오스크.인덱스 +=1;
                /* Price = 4000;*/
            } else if (유저입력.equals("4")) {
                키오스크.메뉴들[키오스크.인덱스] = 음료4.이름 +" : " +음료4.금액 +"원" ;
                키오스크.금액들 +=음료4.금액;
                키오스크.인덱스 +=1;
                /*Price = 5000;*/
            } /*else {
                Kiosksoik.Menu[Kiosksoik.index] = "없는 메뉴 입니다.";
                System.out.println(Menu);
            }*/
            /*if ((UserInput2 == 1) || (UserInput2 == 2) || (UserInput2 == 3) || (UserInput2 == 4))*/ {

            }
        }
    }

