package thread;

/**
 * 1.怎么获取线程对象？
 *      static Thread currentThread()
 *      Thread t = Thread.currentThread
 *
 * 2.获取线程对象的名字
 * 3.修改线程对象的名字
 * 4.默认线程名字是Thread-0、Thread-1
 */
public class ThreadTest05 {
    public static void main(String[] args) {

        //currentThread就是当前线程对象
        //这个代码出现在main方法中，所以当前线程就是主线程。
        Thread t = Thread.currentThread();

        //创建线程对象
        MyThread2 myThread2 = new MyThread2();
        //设置线程名字
        myThread2.setName("ttt"); //默认线程名字Thread-0
        //获取线程名字
        System.out.println(myThread2.getName());

        MyThread2 m3 = new MyThread2();
        System.out.println(m3.getName());
        //启动线程
        myThread2.start();
    }
}

class MyThread2 extends Thread{
    @Override
    public void run() {

        //currentThread就是当前线程，当前线程是谁呢？
        //当t1线程执行run方法，那么这个当前线程就是t1
        //当t2线程执行run方法，那么这个当前线程就是t2
        Thread t = Thread.currentThread();
        System.out.println(t);
        for (int i = 0; i < 1000; i++) {
            System.out.println(t.getName()+"-->"+i);
//            System.out.println(super.getName()+"--->"+i);
//            System.out.println(this.getName()+"--->"+i);
        }
    }
}