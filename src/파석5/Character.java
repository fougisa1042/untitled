package 파석5;

public class Character {


    String name;
    int level;
    int exp , maxExp;
    int hp , maxHp;
    int ad;
    int money;



    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    //==================================================================

    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }

    //==================================================================

    public int getExp() {
        return exp;
    }
    public void setExp(int exp) {
        this.exp = exp;
    }

    //==================================================================


    public int getMaxExp() {
        return maxExp;
    }
    public void setMaxExp(int maxExp) {
        this.maxExp = maxExp;
    }

    //==================================================================

    public int getAd() {
        return ad;
    }
    public void setAd(int ad) {
        this.ad = ad;
    }

    //==================================================================

    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }

    //==================================================================

    public int getMaxHp() {
        return maxHp;
    }
    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    //==================================================================

    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money = money;
    }

    //==================================================================


    /*public void attack(){
        System.out.println(name + " 의 공 격 ! ! ! ! !");
    }*/


}
