package 쓰레드연습1;

public class Thread1 {

    public static void main(String args[])
    {
        Thread1Test t1 = new Thread1Test();
        Thread1Test t2 = new Thread1Test();

        // 1. 동시에 똑같은 숫자가 나오고(start)
       /* t1.start();
        t2.start();*/

        // 2. 번갈아가면서 나옴(run)
        t1.run();
        t2.run();
    }

}
