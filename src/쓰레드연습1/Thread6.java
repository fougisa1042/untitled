package 쓰레드연습1;

public class Thread6 {
    public static void main(String args[])
    {
        Thread6Bank t1 = new Thread6Bank("ATM");
        Thread6Bank t2 = new Thread6Bank("은행");

        t1.start();
        t2.start();
    }
}
