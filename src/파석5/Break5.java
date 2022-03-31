package 파석5;


import java.util.Scanner;

public class Break5 {
    public static void main(String[] args) {
        // 1. 스토리 출력 후 커맨드키 입력
        System.out.println("""
                게임 이름 : 계란으로 바위 깨기

                줄거리 : 어느날 갑자기 강력한 조류 바이러스가 퍼져 인간은 극단의 조치로 나무문와 바위로 문을 막아\s
                바이러스를 못 퍼지게 하고 키우던 새들과 알들을 죽이려 한다 그리고 막음과 동시에 인간이 살포한 독가스는\s
                새들은 코로 독가스를 흡입하여 죽게 되지만 부화하지 못한 알들은 코가 없어 죽지 않게 된다\s
                괜찮은 줄만 알았던 알들은 사실 껍질 사이 모공으로 들어오는 독가스에 취해 시간이 지날수록 폭력적으로 변하고 있었다\s
                그렇게 나무와 바위를 깨고 나갈 수 있는 인재가 없었기에 다들 이성을 잃어가며 포기하려던 찰나\s

                독가스에 아무 영향을 받지 않은 신비로운 힘을 가진 계란과 계란의 할아버지와 할머니가 있었다\s
                그래도 희망은 얻은셈... 하지만 계란으로 바위치기는 정말 무모한 도전 죽을게 뻔하다\s
                하지만 아무것도 안하고 썩은 계란이 될바에 나에게 주어진 신비한 힘을 믿어보는게 낫지 않을까
                난폭해지는 알들을 이기고 강해져 숨은 잠재력을 발견하고 강철계란이 되어 나무와 바위를 부시고 나갈 수 있을까

                ----------I need you----------""");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("시작하려면 \"알겠습니다\" 를 쳐 주세요");
            String commandKey = scanner.nextLine();
            if (commandKey.equals("알겠습니다")) {
                System.out.println("가볍게 입력하셨군요 잘하셨습니다 건투를 빕니다\n");
                break;
            }
        }

        //2 . 캐릭터 이름 입력 후 타입선택
        Hero hero = new Hero();
        System.out.println("-------------------------컈릭터의 이름을 정해주세요-------------------------");
        String name = scanner.nextLine();
        hero.setName(name);
        System.out.println(hero.getName() + "반갑습니다 계란 마을을 구원해 주십시오\n");

        while (true) {  //타입선택
            System.out.println("-------------------------타입을 선택하세요-------------------------");
            System.out.println("1.화란 2.수란");
            String type = scanner.nextLine();
            if (type.equals("1")) {
                System.out.println("화란을 선택하였습니다");
                hero = new FireHero("화염",1,0,100,100,100,100,100);
                break;
                //hero.setName(이름입력);


            } else if (type.equals("2")) {
                System.out.println("수란을 선택하였습니다");
                hero = new WaterHero("수염",1,0,900,900,900,900,900);
                break;
                //hero.setName(이름입력);
            }
        }

        Mon1Qauil qauil = new Mon1Qauil("메추리",1,10,10,10,10,10,10);
        Mon2Goose goose = new Mon2Goose("거위알",2,20,20,20,20,20,20);
        Mon3Tree tree = new Mon3Tree("나무",3,300,300,300,300,300,300) ;
        Mon4Rock rack = new Mon4Rock("바위",4,400,400,4000,400,400,400);



        //3. 이동 경로 선택하기
        while (true) {
            System.out.println("------------------------------화면 선택------------------------------");
            System.out.println("1.상태보기 2.전투하기 3.------- 4.상 점 0. 종 료\n");

            String number = scanner.nextLine();
            if (number.equals("1")) {
                hero.setName(name);
                hero.State(hero);
                // mainSystem.status();


            } else if (number.equals("2")) {
                System.out.println("------------------------------전장 선택------------------------------");
                System.out.println("1.메추리 2.거위알 3.나무문 4. 바위");
                String num = scanner.nextLine();
                //메추리
                if (num.equals("1")) {
                    System.out.println("!!!!!!!!!!!!!!!!!!!" + qauil.getName() + "을 마주쳤습니다 전투가 시작됩니다");
                   // vs메추리
                   /* MonstarThread qauilThread = new MonstarThread(qauil, hero);
                    qauilThread.start();*/


                    while (true) {
                        if (hero.getHp() < 0) { //영웅의 체력이 0 보다 작을 때
                            qauil.attack(hero);
                        }
                        hero.attack(qauil);
                        if (qauil.getHp() > 0) { //몬스터의 체력이 0보다 클때
                            System.out.println(qauil.getName() + "의 남은 체력 : " + qauil.getHp() + "\n");
                        } else {
                            System.out.println(qauil.getName() + "이(가) 쓰러졌습니다.\n");
                            System.out.println("경험치 + "+qauil.getExp());
                            System.out.println("돈 + " + qauil.getMoney());
                            hero.setExp(hero.getExp() + qauil.getExp());
                            hero.levelUp();
                            hero.setMoney(hero.getMoney() + qauil.getMoney());
                            hero.stage[0] = 1;
                            try {
                                Thread.sleep(3000);
                            } catch (InterruptedException e) {
                            }
                            qauil.setHp(qauil.getMaxHp() * 2);
                            break;
                        }
                    }
                }


                //거위알
                else if (num.equals("2")) {
                    if (hero.stage[0] != 1) {
                        System.out.println("메추리를 쓰러뜨려야 입장 가능!");
                        return;
                    }
                    System.out.println("!!!!!!!!!!!!!!!!!!!" + qauil.getName() + "을 마주쳤습니다 전투가 시작됩니다");
                    //GooseThread gooseThread = new GooseThread(goose, hero);
                    //gooseThread.start();
                    // fight-goose
                    while (true) {
                        if (goose.getHp() < 0) {
                            //Thread.interrupted();
                        }
                        hero.attack(goose);
                        if (goose.getHp() > 0) {
                            System.out.println(goose.getName() + "의 남은 체력 : " + goose.getHp() + "\n");
                        } else {
                            System.out.println(goose.getName() + "이(가) 쓰러졌습니다.\n");
                            System.out.println("경험치 +20");
                            System.out.println("돈 +500");
                            hero.setExp(hero.getExp() + goose.getExp());
                            hero.levelUp();
                            hero.setMoney(hero.getMoney() + goose.getMoney());
                            hero.stage[1] = 2;
                            /*try {
                                Thread.sleep(3000);
                            } catch (InterruptedException e) {
                            }*/
                            goose.setHp(goose.getMaxHp() * 2);
                            break;
                        }
                        System.out.println(goose.getName() + "의 공격");
                        goose.attack(hero);
                        if (hero.getHp() > 0) {
                            System.out.println(hero.getName() + "의 남은 체력 : " + hero.getHp() + "\n");
                        } else {
                            System.out.println(hero.getName() + "이(가) 쓰러졌습니다.\n");
                            System.out.println("게임을 종료합니다.");
                            System.exit(0);
                        }
                    }
                }

                // vs 나무문
                else if (num.equals("3")) {
                    if (hero.stage[0] != 1 || hero.stage[1] != 2) {
                        System.out.println("거위알를 쓰러뜨려야 입장 가능!");
                        return;
                    }
                    System.out.println("!!!!!!!!!!!!!!!!!!!" + qauil.getName() + "을 마주쳤습니다 전투가 시작됩니다");
                    //TreeGateTT treegateTT = new TreeGateTT(treegate, hero);
                    //treegateTT.start();

                    // fight-son
                    while (true) {
                        if (tree.getHp() < 0) {
                            //Thread.interrupted();
                        }
                        hero.attack(tree);
                        if (tree.getHp() > 0) {
                            System.out.println(tree.getName() + "의 남은 체력 : " + tree.getHp() + "\n");

                        } else {
                            System.out.println(tree.getName() + "이(가) 쓰러졌습니다.");
                            System.out.println("경험치 +30");
                            System.out.println("돈 +1000");
                            hero.setExp(hero.getExp() + tree.getExp());
                            hero.levelUp();
                            hero.setMoney(hero.getMoney() + tree.getMoney());
                            break;
                        }
                        System.out.println(tree.getName() + "의 공격");
                        tree.attack(hero);
                        if (hero.getHp() > 0) {
                            System.out.println(hero.getName() + "의 남은 체력 : " + hero.getHp() + "\n");
                        } else {
                            System.out.println(hero.getName() + "이(가) 쓰러졌습니다.\n");

                            System.out.println("게임을 종료합니다.");
                            System.exit(0);
                        }
                    }
                    /*System.out.println("\n" + tree.getName() + "(초사이언 상태) : 잠깐... 아직 끝나지 않았다..\n");


                    RockThread rockThread = new RockThread(rockThread, hero);
                    rockThread.start();
                    while (true) {
                        //슈퍼손오공
                        hero.attack(rockThread);
                        if (rockThread.getHp() > 0) {
                            System.out.println(rockThread.getName() + "의 남은 체력 : " + rockThread.getHp() + "\n");
                        } else {
                            Thread.interrupted();
                            System.out.println(rockThread.getName() + "!이(가) 쓰러졌습니다.");
                            System.out.println("경험치 +50");
                            System.out.println("돈 +2000");
                            hero.setExp(hero.getExp() + rockThread.getExp());
                            hero.levelUp();
                            hero.setMoney(hero.getMoney() + rockThread.getMoney());
                            System.out.println("\n(짝짝짝) 챔피언 타이틀을 획득했습니다.");
                            try {
                                Thread.sleep(3000);
                            } catch (InterruptedException e) {
                            }
                            goose.setHp(goose.getMaxHp() * 2);
                            rockThread.setHp(rockThread.getMaxHp() * 2);
                            break;
                        }

                        System.out.println(rockThread.getName() + "의 공격");
                        rockThread.attack(hero);
                        if (hero.getHp() > 0) {
                            System.out.println(hero.getName() + "의 남은 체력 : " + hero.getHp() + "\n");

                        } else {
                            System.out.println(hero.getName() + "이(가) 쓰러졌습니다.\n");
                            System.out.println("게임을 종료합니다.");
                            System.exit(0);
                        }

                        //mainSystem.sparring();
                    }*/






                }
            } else if (number.equals("3")) {
                System.out.println("------------------------------미미게임------------------------------");
                System.out.println("1번 게임 2번 게임 ");
                int lotto = scanner.nextInt();
                if (lotto == 1) {
                    System.out.println("금액을 입력하세요"); //소지금을 입력
                    int inPut = scanner.nextInt();
                    if (inPut <= hero.getMoney()) {
                        //투입금액이 소지금액을 넘지 않으면 도박을 시작.
                        System.out.println("1.번 게임에 들어왔습니다");

                    }
                } else if (lotto == 2) { //뽑기
                    System.out.println("금액을 입력하세요"); //소지금을 입력
                    int inPut = scanner.nextInt();
                    if (inPut <= hero.getMoney()) { //투입금액이 소지금액을 넘지 않으면 도박을 시작.

                        System.out.println("2번 게임에 들어왔습니다");
                    }
                } else {
                    System.out.println("소지금이 부족합니다.");
                }







            } else if (number.equals("4")) {
                Shop shop = new Shop();
                shop.sell(hero);

                /*System.out.println("------------------------------상점------------------------------");
                System.out.println("1.체력인챈트 2. 공격력 인챈트 3. 체력물약 4. 경험치 물약 5.뒤로가기 " );
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t---현재 소지금 : " + hero.getMoney());
                number = scanner.nextLine();
                    //이용하기 1번
                if (hero.getMoney() >= 100) {
                    if (number.equals("1")){
                        System.out.println("\n체력이 100 증가합니다");
                        hero.setMoney(hero.getMoney() - 100);
                        hero.setMaxHp(hero.getMaxHp() + 100);
                    }
                }else {
                    System.out.println("소지금이 부족합니다");
                }

                if (hero.getMoney() >= 100) {
                    if (number.equals("2")) {
                        System.out.println("\n힘이 100 증가합니다.");
                        hero.setMoney(hero.getMoney() - 100);
                        hero.setAd(hero.getAd() + 100);
                    }
                }else {
                    System.out.println("소지금이 부족합니다");
                }

                if (hero.getMoney() >= 100) {
                    if (number.equals("3")){
                        hero.setMoney(hero.getMoney() - 100);
                        hero.setHp(hero.getHp() + 100);
                        System.out.println("\n체력을 회복합니다");
                    }
                }else {
                    System.out.println("소지금이 부족합니다");
                }

                if (hero.getMoney() >= 100) {
                    if (number.equals("4")){
                        hero.setMoney(hero.getMoney() - 100);
                        hero.setExp(hero.getExp() + 100);
                        System.out.println("경험치가 증가합니다");
                    }

                    else if (number.equals("5")){
                        System.out.println("(끼익... 철컥)");
                    }
                }else {
                    System.out.println("소지금이 부족합니다");
                }
                //if( 현재 소지금이 100원보다 적으면 이용 불가능)*/

            }








            else if (number.equals("0")) {
                System.exit(0);

            } else if (number.equals("99")) {
                hero.setHp(hero.getHp() + 10000);
                hero.setMaxHp(hero.getMaxHp() + 10000);
                hero.setMoney(hero.getMoney() + 10000);
                hero.setAd(hero.getAd() + 10000);

                hero.setLevel(hero.getLevel() + 10000);
                hero.setMaxExp(hero.getMaxExp() + 10000);
                hero.setExp(hero.getExp() + 10000);
            }
        }


    }
}



/*
else if (num == 5) {
        System.out.println("1.물류센터(체력을 소모하며 10,000원 획득!)\n2.전단지(체력소모 없이 5원씩 획득!)");
        int select = sc.nextInt();
        if (select == 1) {
        if (hero.getHp() < 100) {
        System.out.println("체력이 부족해서 물류센터 일을 할 수 없습니다.");
        return;
        }
        System.out.println("\n(끙..)\n10,000을 벌었습니다.");
        hero.setMoney(hero.getMoney() + 10000);
        Random rd = new Random();
        int injury = rd.nextInt(100) + 1;
        if (injury <= 30) {
        System.out.println("고된 노동에 체력의 한계를 느낍니다. 체력을 500 소모합니다.");
        hero.setHp(hero.getHp() - 500);
        if (hero.getHp() < 1) {
        hero.setHp(1);
        }

        } else {
        System.out.println("체력을 100 소모합니다");
        hero.setHp(hero.getHp() - 100);
        if (hero.getHp() < 1) {
        hero.setHp(1);
        }
        }
        } else if (select == 2) {
        System.out.println("장당 5원의 돈이 책정되었습니다.");






        while (true) {
        System.out.println("1.시작하기 2.그만하기");
        int start = sc.nextInt();
        if (start == 1) {
        System.out.println("+5원을 정산합니다.");
        hero.setMoney(hero.getMoney() + 5);
        } else if (start == 2) {
        System.out.println();
        break;
        }
        }








        }
        //mainSystem.labor();
        } else if (num == 6) {
        System.out.println("\n1.찜질방(모든 체력이 회복됩니다.) \n2.국밥(체력이 100만큼 회복됩니다.)");
        int eat = sc.nextInt();
        if (eat == 1) {
        System.out.println("이용료는 10,000원 입니다.");
        System.out.println("1.이용하기 2.나가기");
        int select = sc.nextInt();
        if (select == 1) {
        if (hero.getMoney() < 10000) {
        System.out.println("소지금이 부족합니다.");
        } else if (hero.getHp() == hero.getMaxHp()) {
        System.out.println("회복할 체력이 없습니다. 그래도 이용하시겠습니까?\n1.이용하기 2.나가기");

        int select2 = sc.nextInt();
        if (select2 == 1) {
        System.out.println("\n찜질을 통해 온몸의 피로가 풀립니다");
        hero.setMoney(hero.getMoney() - 10000);
        } else if (select2 == 2) {
        System.out.println("\n(수고하세요..)");
        }
        } else {
        System.out.println("\n찜질을 통해 온몸의 피로가 풀립니다\n체력이 모두 회복됩니다.");
        hero.setHp(hero.getMaxHp());
        hero.setMoney(hero.getMoney() - 10000);
        }
        } else if (select == 2) {
        System.out.println("\n(수고하세요..)");
        }

        } else if (eat == 2) {
        System.out.println("가격은 500원 입니다.");
        System.out.println("1.주문하기 2.나가기");
        int select = sc.nextInt();
        if (select == 1) {
        if (hero.getMoney() < 500) {
        System.out.println("소지금이 부족합니다.");
        } else if (hero.getHp() == hero.getMaxHp()) {
        System.out.println("회복할 체력이 없습니다. 그래도 이용하시겠습니까?\n1.이용하기 2.나가기");
        int select2 = sc.nextInt();
        if (select2 == 1) {
        System.out.println("\n(후루룩..)");
        hero.setMoney(hero.getMoney() - 500);
        } else if (select2 == 2) {
        System.out.println("\n(수고하세요..)");
        }
        } else {
        System.out.println("\n(후루룩..)\n체력 100이 회복되었습니다..");
        hero.setHp(hero.getHp() + 100);
        hero.setMoney(hero.getMoney() - 500);
        if (hero.getHp() > hero.getMaxHp()) {
        hero.setHp(hero.getMaxHp());
        }
        }

        } else if (select == 2) {
        System.out.println("수고하세요..");
        }
        //mainSystem.rest();
        }
        }
*/
