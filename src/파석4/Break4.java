package 파석4;

import java.util.Scanner;

public class Break4 {
    public static void main(String[] args) {




        // 2. 영웅 속성 선택
        System.out.println("-----이란파석-----");
        System.out.println("1.불계란");
        System.out.println("2.물계란");
        System.out.println("속성을 선택하세요:");
        Scanner scanner = new Scanner(System.in);
        Hero hero = new Hero("0",0,0,0,0,0,0);
        int number = scanner.nextInt();

        //불계란이 선택된 경우
        if (number ==1){
            System.out.println("불계란이 선택되었습니다");
            hero = new FireHeroEgg("화염",1,0,100,100,100,100);

        }else if (number == 2){
            System.out.println("물계란이 선택되었습니다");
            hero = new WaterHeroEgg("수염",1,0,900,900,900,900);
        }


        // 3. 영웅의 이름 선택
        System.out.println("영웅의 이름을 입력하세요");
        hero.name = scanner.next();
        System.out.println(hero.name + "님 반갑습니다 계란 마을을 구원해 주십시오");


        while (true){
            // 4. 스탯창을 보여준다
            hero.상태창(hero);

            // 5. 이동 경로 선택
            System.out.println("1. 사냥터");
            System.out.println("2. 무기 상점");
            System.out.println("3. 포션 상점");
            System.out.println("입장할 장소를 입력");
            number = scanner.nextInt();
            //사냥터 1~4
            if (number==1){
                Mon mon = new Mon();
                System.out.println("사냥터에 입장하엿습니다");
                System.out.println("1. 메추리");
                System.out.println("2. 계란");
                System.out.println("3. 나무문");
                System.out.println("4. 바위");
                System.out.println("전투할 상대를 입력하세요");
                number = scanner.nextInt();
                //메추리와 전투
                if (number ==1) {
                    mon = new quailEgg("메추리",1,100,20,5,20,1000);
                    mon.상태창(mon);
                }

                //거위알과 전투
                if (number == 2) {
                    mon = new gooseEgg("거위알", 5,100,1000,50,20,100);
                    mon.상태창(mon);

                    /*mon.name = "거위알";
                    mon.level = 5;
                    mon.exp = 100;
                    mon.hp = 1000;
                    mon.ad = 50;
                    mon.df = 20;
                    mon.money = 60;*/
                }

                //나무문 전투
                if (number == 3) {
                    mon = new woodDoor("나무문",10,200,2000,100,30,100);
                    /*mon.name = "나무문";
                    mon.level = 10;
                    mon.exp = 200;
                    mon.hp = 2000;
                    mon.ad = 100;
                    mon.df = 30;
                    mon.money = 100;*/
                }

                //바위문 전투
                if (number == 4 ) {
                    mon = new RockMon("바위",15,600,3000,200,50,400);
                    /*mon.name = "바위";
                    mon.level = 15;
                    mon.exp = 600;
                    mon.hp = 3000;
                    mon.ad = 200;
                    mon.df = 50;
                    mon.money = 400;*/
                }

                //전투 시작
                //영웅의 공격
                while (true){
                    System.out.println("영웅의 공격!!!");
                    mon.attacked(hero.attack());
                    //몬스터의 체력이 0보다 작거나 같은 경우

                    if ( mon.hp<=0){
                        System.out.println("몬스터가 죽었습니다");
                        hero.exp+= mon.exp;
                        hero.money+= mon.money;
                        break;
                    }

                    //몬스터의 공격
                    System.out.println("몬스터의 공격!!!");
                    hero.attacked(mon.attack());
                    //영웅의 체력이 0보다 작거나 같은 경우
                    if (hero.hp<=0){
                        System.out.println("영웅이 죽었습니다");
                        //영웅의 체력을 1로 만듬
                        hero.hp=0;
                        System.out.println("죽다,,,");
                        System.out.println("영웅의 체력" + hero.hp + "부활");
                        break;
                    }
                }
            }


            //무기 상점에 입장하는 경우
            else if (number ==2) {
                WeaponShop weaponShop = new WeaponShop();
                System.out.println("무기 상점에 입장하였습니다");
                System.out.println("1. 송곳 (100원)");
                System.out.println("2. 갑옷(100원)");
                System.out.println("원하는 무기 입력하세요");
                number = scanner.nextInt();
                int temp = hero.money;
                if ((hero.money = weaponShop.show(hero.money, number)) != -1) {
                    System.out.println("구입이 완료되었습니다");
                    if (number == 1) {
                        hero.ad += 5;
                    }
                    if (number == 2) {
                        hero.df += 5;
                    } else {
                        System.out.println("돈이 부족합니다");
                        hero.money = temp;
                    }
                }
            }

                //포션 상점에 입장
                else if (number == 3){
                    PotionShop potionShop = new PotionShop();
                    System.out.println("포션 상점에 입장하였습니다");
                    System.out.println("1. 힘 포션(100원)");
                    System.out.println("2. 방어력 포션(100원)");
                    System.out.println("3. 경험치 포션(100원)");
                    System.out.println("4. hp 포션(10원)");
                    System.out.println("원하는 포션을 입력하세요");
                    number = scanner.nextInt();
                    int temp = hero.money;
                    if ((hero.money= potionShop.show(hero.money,number))!=-1){
                        System.out.println("구입이 완료되었습니다");
                        if (number==1){
                            hero.ad +=10;
                        }
                        if (number==2){
                            hero.df +=10;
                        }
                        if (number==3){
                            hero.exp += 50;
                        }
                        if (number==4){
                            hero.hp += 50;
                        }
                        else {
                            System.out.println("돈이 부족합니다");
                            hero.money=temp;
                        }
                    }
                    if (hero.exp>= hero.level*100){
                        hero.level +=1;
                        System.out.println("영웅의 레벨이 " + hero.level+"이 되었습니다");
                        hero.money += hero.level*50;
                        System.out.println("레벨업으로 " + hero.level*50 +"원 증가했습니다");
                        hero.exp = 0;
                    }
                }
        }

    }
}
