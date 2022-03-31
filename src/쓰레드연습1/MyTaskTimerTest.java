package 쓰레드연습1;

import java.util.Timer;

public class MyTaskTimerTest
{
    public static void main(String args[])
    {
        MyTask task =new MyTask();
        // 타이머 객체 생성
        Timer timer = new Timer();

        // 1초후에 0.5초 간격으로 반복
        timer.schedule(task, 1000, 500);
        try
        {
            // 5초후에 스레드를 멈춘다.
            Thread.sleep(5000);
        }catch(InterruptedException exc) { timer.cancel(); }
        // 타이머 취소
        timer.cancel();
    }
}
