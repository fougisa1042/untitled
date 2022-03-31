package 파석5;
class MonstarThread extends Thread {

    Monstar monstar;
    Hero hero;
    public MonstarThread(Monstar monstar, Hero hero) {
        this.monstar = monstar;
        this.hero = hero;
    }


    @Override
    public void run() {
        while (monstar.getHp() > 0) { //몬스터의 체력이 0보다 클 때 몬스터가 영웅을 때린다
            System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+ monstar.getName() + "의 공격");
            monstar.attack(hero);
            if (hero.getHp() > 0) {     //영웅의 체력이 0보다 클 때 체력을 보시한다
                System.out.println(hero.getName() + "의 남은 체력 : " + hero.getHp() + "\n");
            } else {        //아닐 때 영웅이 죽고 게임을 종료한다
                System.out.println(hero.getName() + "이(가) 쓰러졌습니다.\n");
                System.out.println("게임을 종료합니다.");
                System.exit(0);
            }
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
            }
        }
    }

}
