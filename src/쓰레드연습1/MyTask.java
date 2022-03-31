package 쓰레드연습1;

import java.util.TimerTask;

public class MyTask extends TimerTask
{
    // "타이머 호출"
    public void run()
    {
        System.out.println("타이머 호출");
    }
}