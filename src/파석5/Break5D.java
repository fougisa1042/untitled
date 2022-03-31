package 파석5;

import Kiosk.키오스크;

import java.util.Scanner;

public class Break5D {
    public static void main(String[] args) throws InterruptedException {
        //2 . 캐릭터 이름 입력 후 속성 선택
        Scanner scanner = new Scanner(System.in);
        Hero hero = new Hero();

        Music music = new Music();
        music.bgm();


        System.out.println
                ("______ ______  _____   ___   _   __        ______  _____  _____  _   __\n" +
                 "| ___ \\| ___ \\|  ___| / _ \\ | | / /         | ___ \\|  _  |/  __ \\| | / /\n" +
                 "| |_/ /| |_/ /| |__  / /_\\ \\| |/ /           | |_/ /| | | || /  \\/| |/ / \n" +
                 "| ___ \\|    / |  __| |  _  ||    \\         |    / | | | || |    |    \\ \n" +
                 "| |_/ /| |\\ \\ | |___ | | | || |\\  \\          | |\\ \\ \\ \\_/ /| \\__/\\| |\\  \\\n" +
                 "\\____/ \\_| \\_|\\____/ \\_| |_/\\_| \\_/        \\_| \\_| \\___/  \\____/\\_| \\_/");

        System.out.println("BREAK ROCK\n");
        System.out.println("\t  마을이 위급한 상황입니다  몬스터를 무찌르고 마을을 구해주세요");
        System.out.println("❗❗❗❗❗❗마을이 위급한 상황입니다  몬스터를 무찌르고 마을을 구해주세요❗❗❗❗❗❗");
        System.out.println("\t  마을이 위급한 상황입니다  몬스터를 무찌르고 마을을 구해주세요\n");

        System.out.println("----------[캐릭터의 이름을 정해주세요]----------");
        String name = scanner.nextLine();
        hero.setName(name);
        System.out.println(hero.getName() + "님 반갑습니다 계란 마을을 구원해 주십시오\n");

        System.out.print("Loading");
        for (int i = 0; i < 30; i++) {
            System.out.print("-▶");
            Thread.sleep(30);
        }

        while (true) {
            System.out.println("\n\n----------[타입을 선택하세요]----------");
            System.out.println("1.화란 2.수란 3.캐릭터 상태보기");
            String type = scanner.nextLine();
            if (type.equals("1")) {
                System.out.println("화란을 선택하였습니다\n");
                hero = new FireHero("[화란]", 1, 0, 100, 100, 100, 100, 100);
                break;
            } else if (type.equals("2")) {
                System.out.println("수란을 선택하였습니다\n");
                hero = new WaterHero("[수란]", 1, 0, 50, 900, 900, 900, 900);
                break;
            } else if (type.equals("3")){
                System.out.println("----------[캐릭터 상태 보기]----------");
                hero = new FireHero("[화란]", 1, 0, 100, 100, 100, 100, 100);
                hero.miniState(hero);
                System.out.println();
                hero = new WaterHero("[수란]", 1, 0, 50, 900, 900, 900, 900);
                hero.miniState(hero);
            }
        }

        //3. 이동 경로 선택하기
        while (true) {
            System.out.println("----------[화면 선택]----------");
            System.out.println("1. 상태보기 2.전장으로 3. 상점으로 4.스토리 0. 종료하기 ");
            String number = scanner.nextLine();

            //1. 상태보기
            if (number.equals("1")) {
                hero.setName("["+name+"]");
                hero.State(hero);

                //2. 전장으로
            } else if (number.equals("2")) {
                System.out.println("----------[전장선택]----------");
                System.out.println("1.메추리 2.거위알 3. 나무 4. 바위");
                number = scanner.nextLine();


                //메추리
                if (number.equals("1")) {
                    Monstar monstar = new Mon1Qauil("[메추리]", 1, 10, 10, 1000, 1000, 10, 10);

                    System.out.println("! ! ! ! ! 지 금 바 로 " + monstar.name + " 와 의 전 투 가 시 작 됩 니 다 ! ! ! ! !");
                    //메추리와 전투 구현

                    hero.State(hero);
                    monstar.State(monstar);

                    MonstarThread monstarThread = new MonstarThread(monstar , hero);
                    monstarThread.start();

                    while (monstar.getHp() > 0 && hero.getHp() > 0 ) {//몬스터의 체력과 영웅의 체력이 0보다 클때 전투가 시작된다 상태를 보여주고 영웅이 떄리고 몬스터가 때린다
                            hero.attack(monstar);
                            monstar.attack(hero);
                            hero.stateShow(hero);
                            monstar.stateShow(monstar);
                    }
                    if (monstar.getHp() <= 0){//몬스터의 체력이 0보다 작다면 영웅에게 경험치와 돈을 준다
                        monstar.death(monstar);
                        hero.setExp(hero.getExp() + monstar.getExp());
                        hero.levelUp();
                        hero.setMoney(hero.getMoney() + monstar.getMoney());
                        hero.stage[0] = 1; //메추리를 깨게 되면 백팩은 0에서 1이 된다

                    }else if (hero.getHp() <= 0){//영웅의 체력이 0보다 작을 때 죽음
                        hero.death(hero);
                        break;
                    }
                }

                //거위
                else if (number.equals("2")) {
                    Monstar monstar = new Mon2Goose("[거위]",2,20,200,2000,200,20,200) ;
                    if (hero.stage[0] != 1) {//영웅의 백팩은 0이라면 1과 같지 않고 이코드를 넘어가게 된다
                        System.out.println("[메추리]를 쓰러뜨려야 입장 가능!\n");
                        continue;
                    }

                    System.out.println("! ! ! ! ! 지 금 바 로 " + monstar.name + " 와 의 전 투 가 시 작 됩 니 다 ! ! ! ! !");
                    //거위와 전투 구현
                    hero.State(hero);
                    monstar.State(monstar);

                    MonstarThread monstarThread = new MonstarThread(monstar , hero);
                    monstarThread.start();

                    while (monstar.getHp() > 0 && hero.getHp() > 0 ) {//몬스터의 체력과 영웅의 체력이 0보다 클때 전투가 시작된다 상태를 보여주고 영웅이 떄리고 몬스터가 때린다
                        hero.attack(monstar);
                        monstar.attack(hero);
                        hero.stateShow(hero);
                        monstar.stateShow(monstar);
                    }
                    if (monstar.getHp() <= 0){//몬스터의 체력이 0보다 작다면 영웅에게 경험치와 돈을 준다
                        monstar.death(monstar);
                        hero.setExp(hero.getExp() + monstar.getExp());
                        hero.levelUp();
                        hero.setMoney(hero.getMoney() + monstar.getMoney());
                        hero.stage[1] = 2;

                    }else if (hero.getHp() <= 0){//영웅의 체력이 0보다 작을 때 죽음
                        hero.death(hero);
                    }
                }

                //나무
                else if (number.equals("3")){
                    Monstar monstar = new Mon3Tree("[나무]",3,30,300,3000,3000,300,300) ;
                    if (hero.stage[0] != 1 || hero.stage[1] != 2) {//영웅의 백팩은 0 또는 1이며 2와 같지 않다
                        System.out.println("[거위]를 쓰러뜨려야 입장 가능!\n");
                        continue;
                    }
                    MonstarThread monstarThread = new MonstarThread(monstar , hero);
                    monstarThread.start();

                    System.out.println("! ! ! ! ! 지 금 바 로 " + monstar.name + " 와 의 전 투 가 시 작 됩 니 다 ! ! ! ! !");
                    //나무와 전투 구현
                    hero.State(hero);
                    monstar.State(monstar);

                    while (monstar.getHp() > 0 && hero.getHp() > 0 ) {//몬스터의 체력과 영웅의 체력이 0보다 클때 전투가 시작된다 상태를 보여주고 영웅이 떄리고 몬스터가 때린다
                        hero.attack(monstar);
                        monstar.attack(hero);
                        hero.stateShow(hero);
                        monstar.stateShow(monstar);
                    }
                    if (monstar.getHp() <= 0){//몬스터의 체력이 0보다 작다면 영웅에게 경험치와 돈을 준다
                        monstar.death(monstar);
                        hero.setExp(hero.getExp() + monstar.getExp());
                        hero.levelUp();
                        hero.setMoney(hero.getMoney() + monstar.getMoney());
                        hero.stage[2] = 3;

                    }else if (hero.getHp() <= 0){//영웅의 체력이 0보다 작을 때 죽음
                        hero.death(hero);
                    }
                }

                //바위
                else if (number.equals("4")){
                    Monstar monstar = new Mon4Rock("[바위]",5,500,500,5000,50,500,500) ;
                    if (hero.stage[0] != 1 || hero.stage[1] != 2 || hero.stage[2] != 3) {//영웅의 백팩은 0 또는 1이며 2와 같지 않다
                        System.out.println("[나무]를 쓰러뜨려야 입장 가능!\n");
                        continue;
                    }
                    MonstarThread monstarThread = new MonstarThread(monstar , hero);
                    monstarThread.start();

                    System.out.println("! ! ! ! ! 지 금 바 로 " + monstar.name + " 와 의 전 투 가 시 작 됩 니 다 ! ! ! ! !");
                    //바위와의 전투
                    hero.State(hero);
                    monstar.State(monstar);

                    while (monstar.getHp() > 0 && hero.getHp() > 0 ) {//몬스터의 체력과 영웅의 체력이 0보다 클때 전투가 시작된다 상태를 보여주고 영웅이 떄리고 몬스터가 때린다
                        hero.attack(monstar);
                        monstar.attack(hero);
                        hero.stateShow(hero);
                        monstar.stateShow(monstar);
                    }
                    if (monstar.getHp() <= 0){//몬스터의 체력이 0보다 작다면 영웅에게 경험치와 돈을 준다
                        monstar.death(monstar);
                        hero.setExp(hero.getExp() + monstar.getExp());
                        hero.levelUp();
                        hero.setMoney(hero.getMoney() + monstar.getMoney());
                        hero.stage[3] = 4;

                        System.out.println("\n[축하합니다 바위를 부수고 마을을 구했습니다] \n");
                        System.out.println("{😎축하합니다 바위를 부수고 마을을 구했습니다😎} \n");
                        System.out.println("[축하합니다 바위를 부수고 마을을 구했습니다] \n");
                        System.out.println("신비로운 계란은 마을을 구하게 되어 계란에서 깨어나게 됩니다 ");
                        System.out.println("그 이름은 바로 박혁거세 번돈으로 키오스크에서 플렉스를 해봅시다 ");
                        System.out.println("플렉스를 하려면 커맨드 키를 입력해주세요 : felx");

                        while (true) {//키오스크 발동
                            String 커맨드키 = scanner.nextLine();
                            if (커맨드키.equals("felx")) {
                                System.err.println("인간의 신문물인 키오스크를 만져보세요");
                                키오스크 실행2 = new 키오스크();
                                실행2.키오스크실행();
                                break;
                            }else {
                                System.out.println("다시 커맨드키 \" felx\" 를 쳐주세요 ");
                            }
                        }

                    }else if (hero.getHp() <= 0){//영웅의 체력이 0보다 작을 때 죽음
                        hero.death(hero);
                    }

                }else {   //다른 것을 입력했을 때
                    System.out.println("제대로 입력해주세요");
                }


            }
            //3. 상점으로
            else if (number.equals("3")){
                Shop shop = new Shop();
                shop.sell(hero);
            }




            else if (number.equals("0")) {
                System.exit(0);


            } else if (number.equals("4")){
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
            }

            //개발자 치트 커맨드 키
            else if (number.equals("99")) {
                hero.setHp(hero.getHp() + 3000);
                hero.setMaxHp(hero.getMaxHp() + 3000);
                hero.setMoney(hero.getMoney() + 3000);
                hero.setAd(hero.getAd() + 3000);

                System.out.println();
                hero.stateShow(hero);
            }
        }


    }
}
