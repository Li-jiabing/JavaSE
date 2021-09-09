package thread.ThreadSafe3.ThreadSafe;

public class Test {
    public static void main(String[] args) {
        //创建1个银行卡对象
        Account act = new Account("act-01",10000);
        //创建2个线程对象
        Thread t1 = new AccountThread(act);
        Thread t2 = new AccountThread(act);

        //设置name
        t1.setName("t1");
        t2.setName("t2");

        //启动线程取款
        t1.start();
        t2.start();

    }
}
