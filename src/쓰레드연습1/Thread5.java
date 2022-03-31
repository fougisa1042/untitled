package 쓰레드연습1;

public class Thread5 {
    public static void main(String args[])
    {
        Thread5Interrupt th = new Thread5Interrupt("스레드");
        th.start();

        // 10초에 인터럽트
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException e) {

        }th.interrupt();
    }
}
