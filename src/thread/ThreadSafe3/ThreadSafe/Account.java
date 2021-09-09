package thread.ThreadSafe3.ThreadSafe;

/**
 * 银行账户类
 *  不实用线程同步机制，多线程对同一个线程进行取款，出现线程安全问题
 */
public class Account {

    //账户
    private String actno;
    //余额
    private double balance;

    public Account() {
    }

    public Account(String actno, double balance) {
        this.actno = actno;
        this.balance = balance;
    }

    public String getActno() {
        return actno;
    }

    public void setActno(String actno) {
        this.actno = actno;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //取款方法
    //synchronized出现在实例方法上一定锁的是this，没的挑，只能是this，不能是其他对象了，不灵活
    //还有另一个缺点：synchronized出现在实例方法上，表示整个方法体都需要同步。可能会无故扩大同步范围
    //导致执行效率较低，所以这种方式不常用

    /*
    synchronized使用在实例方法上有什么优点？
        代码写的少了，节俭了

        如果共享的对象就是this，并且需要同步的使用代码块是整个方法提
        建议使用这种方式

     */
    public synchronized void withdraw(double money){

        //t1和t2并发这个方法（t1和t2是两个栈，两个栈操作堆中的同一个对象）

        //取款之前的余额
        double before = this.getBalance();
        //取款之后的余额
        double after = before-money;

        //在这里模拟一下网络延迟，百分百会出问题
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        //更新余额
        //思考：假设t1执行到这里了，但还没有来的及执行这行代码，t2线程进来withdraw方法了，此时一定出现问题
        this.setBalance(after);
    }
}
