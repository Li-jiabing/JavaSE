package thread.ThreadSafe3.ThreadSafe;

public class AccountThread extends Thread{

    //两个线程必须共享同一个账户对象
    private Account act;

    //通过构造方法传递过来账户对象
    public AccountThread(Account act){
        this.act = act;
    }

    public void run(){
        //run方法的执行，表示取款操作
        //假设取款5000
        double money = 5000;
        //取款
        act.withdraw(money);
        System.out.println(Thread.currentThread().getName()+"线程对象取款成功，"+act.getActno()+"账户余额"+act.getBalance());
    }
}
