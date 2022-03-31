public class Ahri extends Thread{

    String skill_name;

    public Ahri(String cmd){    //생성자
        skill_name = cmd;
    }

    public void run(){  //start() 메소드 사용 시
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
