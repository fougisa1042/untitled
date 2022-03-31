package HeroChios;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {


        Hero hero3 = new Hero("0" ,0,0,0,0,0,0,0);
        hero3.selectHero();
        hero3.showInfo(hero3);



        Scanner sc = new Scanner(System.in);
        System.out.println(" 숫자를 입력하세요");
        System.out.println("1. 번입니다");
        System.out.println("2. 번입니다");
        System.out.println("3. 번입니다");

        while (true) {
            String qqq = sc.nextLine();

            if (qqq.equals("1")) {
                System.out.println("1");
                break;
            } else if (qqq.equals("2")) {
                System.out.println("2");
                break;
            } else if (qqq.equals("3")) {
                System.out.println("3");
                break;
            } else {
                System.out.println("다시입력해주세요");
            }
        }

        System.out.println("이것은 전투화면 입니다");
        System.out.println("1. 공격입니다");
        System.out.println("2. 스킬입니다");
        System.out.println("3. 에너지!!!");

        while (true) {
            String qqq = sc.nextLine();

            if (qqq.equals("1")) {
                System.out.println("1. 공격입니다");

            } else if (qqq.equals("2")) {
                System.out.println("2. 스킬입니다");

            } else if (qqq.equals("3")) {
                System.out.println("3. 에너지!!!");

            } else {
                System.out.println("다시입력해주세요");
            }
        }




    }




}
