public class Biltzcank {
    String skill_name;

    public Biltzcank(String cmd){
        skill_name = cmd;
    }

    public void run(){
        System.out.println("시전한 스킬 : " + skill_name);

        for (int i = 1; i <= 3; i++){
            System.out.println(skill_name + " 스킬을" + i + "초간 시전 중입니다");
        }
        System.out.println("시전 끝난 스킬 " + skill_name);
    }

    public static void main(String[] args){
        String[] cmd = new String[]{"Q" , "W" , " E"};

        for (int i = 0; i <= cmd.length; i++){
            Biltzcank biltzcank = new Biltzcank(cmd[i]);
            biltzcank.run();
        }
    }
}
