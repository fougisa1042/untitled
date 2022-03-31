package 쓰레드연습1;

public class Thread2 {
    public static void main(String args[])
    {
        // Runnable 인터페이스 객체생성
        Thread2RunnableTest Obj1 = new Thread2RunnableTest();
        Thread2RunnableTest Obj2 = new Thread2RunnableTest();

        // Runnable 객체를 매개변수로 하여 스레드 객체 th생성
        Thread th1 = new Thread(Obj1);
        Thread th2 = new Thread(Obj2);

        th1.start();
        th2.start();
    }
}
