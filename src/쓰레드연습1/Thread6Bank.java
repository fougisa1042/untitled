package 쓰레드연습1;

public class Thread6Bank extends Thread
{
    static Thread6Account obj = new Thread6Account();
    public Thread6Bank() { }
    public Thread6Bank(String name) { super(name); }
    public void run()
    {
        while(true)
        {
            // 멀티 스레드
            synchronized(obj)
            {
                int money = (int)(Math.random() * 3 + 1) *100;
                if(obj.balance >= money)
                {
                    System.out.println(getName() + " : 원본의 balance : " + obj.balance);
                    System.out.println(getName() + ": 찾는 금액 : " + money);
                    obj.withdraw(money);
                    System.out.println(getName() + " : 수정된 balance : " + obj.balance);
                }else
                {
                    System.out.println("잔액 부족");
                    break;
                }
            }
        }
    }
}
