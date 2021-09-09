package thread.exam1;

/**
 * 面试题:
 *      doOther()方法执行的时候需要等待doSome()方法的结束吗？
 *          不需要，因为doOther()方法没有synchronized
 *          在doOther方法上加上synchronized关键字，就需要等待doSome()方法结束了
 */
public class Exam01 {
    public static void main(String[] args) throws InterruptedException {
        MyClass mc = new MyClass();
        Thread t1 = new MyThread(mc);
        Thread t2 = new MyThread(mc);

        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        Thread.sleep(1000);//睡眠作用是为了保证线程t1先执行
        t2.start();
    }
}

class MyThread extends Thread{
    private MyClass mc;

    public MyThread(MyClass mc) {
        this.mc = mc;
    }

    public void run(){
        if (Thread.currentThread().getName().equals("t1")){
            mc.doSome();
        }
        if (Thread.currentThread().getName().equals("t2")){
            mc.doOther();
        }
    }
}

class MyClass{

    //synchronized出现在实例方法上锁的是this
    //synchronized修饰在静态方法里面锁的是类，属于类锁，不管创建多少对象，锁的是类
    //    public synchronized static void doSome(){
    public synchronized void doSome(){
        System.out.println("doSome begin");
        try {
            Thread.sleep(1000*10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("doSome over");
    }

//    public synchronized void doOther(){
    public void doOther(){
        System.out.println("doOther begin");
        System.out.println("doOther over");
    }
}