package thread;

/**
 * Sleep睡眠太久了，如果希望半道上醒来你应该怎么办？也就是说你应该怎么叫醒一个正在睡眠的线程？
 *  注意：这个不是中断线程的执行，是中断线程的睡眠
 */
public class ThreadTest08 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable2());
        t.setName("t ");
        t.start();

        //希望5秒之后，t线程醒来
        try {
            t.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //中断t线程的睡眠
        //这种中断睡眠的方式依靠了java的异常处理机制
        t.interrupt();//干扰/打断

    }
}

class MyRunnable2 implements Runnable{

    //重点：run方法当中的异常不能throws，只能try/catch
    //因为run()方法在父类中没有抛出任何异常，子类不能比父类抛出更多异常。
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"---> begin");
        try {
            //睡眠一年
            Thread.sleep(1000 * 60 * 60 * 24 * 365);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"---> end");

    }
}