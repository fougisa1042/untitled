package 쓰레드연습1;

public class Thread3 extends Thread
{
    public void run()
    {
        try
        {
            System.out.println("Daemon Thread Start!");
            sleep(10000);
            System.out.println("Daemon Thread End!");
        }catch(Exception e){ }
    }

    public static void main(String args[])
    {
        Thread3 t = new Thread3();
        // Thread가 종료되지 않기 때문에 끝나질 않음
        t.setDaemon(true);
        t.start();
        System.out.println("Main Method End!");
    }
}
