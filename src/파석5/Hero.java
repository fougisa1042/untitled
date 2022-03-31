package 파석5;

public class Hero extends Character {


    /*private int maxExpUp;*/

    int [] stage = new int[100];


    public Hero(String name , int level , int exp , int maxExp ,int hp ,int maxHp , int ad , int money ) {
        this.name = name;
        this.level = level;
        this.exp = exp;
        this.maxExp = maxExp;
        this.ad = ad;
        this.money = money;
        this.hp = hp;
        this.maxHp = maxHp;
    }
    Hero(){

    }

    public void attack(Hero hero){
        System.out.println(hero.getName() + " 의 공 격 ! ! ! ! !");
    }

    void stateShow(Hero hero){
        if (hero.getHp() > 0) {//영웅의 체력이 0보다 크다면 상타를 출력한다
            //hero.miniState(hero);
            System.out.println("영웅의 상태");
            System.out.println(hero.getName() + "의 힘 : " + hero.getAd() + " 체력 : " + hero.getHp() + "\n");
        }
    }

    void death(Hero hero){
        if (hero.getHp() <= 0) {//영웅의 체력이 0보다 작다면 죽는다
            System.out.println(hero.getName() + "은 쓰러졌습니다.\n");
            System.out.println("게임을 오버");
            hero.setHp(hp = 0);
            hero.miniState(hero);
            System.exit(0);
        }
    }

    public void State(Hero hero){
        System.out.println();
        System.out.println("\t[영웅의 상태]");
        System.out.println("\t이　름 : " + hero.name + "\t\t\t\t체　력　: " + hero.hp + "/" + hero.maxHp);
        System.out.println("\t레　벨 : " + hero.level + "\t\t\t\t\t 힘　: " + hero.ad);
        System.out.println("\t경험치 : " + hero.exp + "/" + hero.maxExp + "\t\t\t\t 돈　: " + hero.money + " 원 ");
        System.out.println();
    }
    public void miniState(Hero hero){
        System.out.println("영웅의 상태");
        System.out.println("이　름 : " + hero.name + "\t\t체　력　: " + hero.hp + "/" + hero.maxHp);
        System.out.println("레　벨 : " + hero.level + "\t\t\t힘　: " + hero.ad);
        System.out.println("경험치 : " + hero.exp + "/" + hero.maxExp + "\t\t 돈　: " + hero.money + " 원 ");
    }


    public int beat(){
        return 0;
    }
    public int waterBeat(){
        return 0;
    }
    public int fireBeat(){
        return 0 ;
    }
    public void attack(Monstar monstar){
    }

    public void levelUp(){
        if (getExp() >= getMaxExp()){
            int level;
            level = getLevel();
            level++;
            setLevel(level);
            setExp(0);
            setMaxExp(getMaxExp() * getLevel());

            setHp(getHp() + 500);
            setMaxHp(getMaxHp() + 500);
            setAd(getAd() + 500);
            setMoney(getMoney() + 500);
            System.out.println("----------[레벨 업]----------" );
            System.out.println(getName() + "의 현재 레벨 :  " + getLevel() );
            System.out.println("다음 레벨업까지 " + getMaxExp() + " 남았습니다");

            if (getLevel() == 1){
                setName( "그냥 " + getName());
                System.out.println("그냥 계란입니다 메추리 정도는 가뿐히 이깁니다");
            }else if (getLevel() == 2){
                setName("든든한 " + getName());
                System.out.println("껍질이 두꺼워지며 든든해졌다 거위알도 깰 수 있는 느낌이 든다");
            }else if (getLevel() == 3){
                setName("뾰족한 " + getName() );
                System.out.println("더욱 더 튼튼해져 나무도 뚫을 수 있을거 같다");
            }else if (getLevel() == 4){
                setName("무쇠 " + getName() );
                System.out.println("바위도 부실 듯한 자신감이 솟구친다");
            }else if (getLevel() <= 5){
                setName("다이아  " + getName());
                System.out.println("너무 강합니다");
            }

        }
    }

    public boolean run() {
        if (Math.random() <= 0.3){
            System.out.println("도망 성공");
            return true;
        } else {
            System.out.println("도망에 실패하였습니다");
            return false;
        }
    }

    /*public void drink(Hero hero) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();

        System.out.println("포션을 마십니다.");
        if (num.equals("1")) {
            if (Potion1.count >= 1) {
                Potion1.count -= 1;
                hero.hp+= Potion1.upGage;
            }

            }else if (num.equals("2")){
                if (Potion2.count >= 1){
                    Potion2.count -= 1;
                    hero.exp += Potion2.upGage;
                }
            }else{
            System.out.println("포션이 없습니다");
        }
    }*/
}
