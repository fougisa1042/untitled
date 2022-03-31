package 쓰레드연습1;

public class Thread5Interrupt extends Thread{
    // 출력 생성자
    Thread5Interrupt(String str)
    {
        super(str);
    }

    public void run()
    {
        try
        {
            for (int i = 0 ; i < 10 ; i++)
            {
                Thread.sleep(1000);
                System.out.println(getName() + i + "번쨰 수행");
            }
        }catch(InterruptedException e)
        {    // 인터럽트 걸릴시
            System.out.println("스레드 강제 종료");
            return;
        }
    }
}
