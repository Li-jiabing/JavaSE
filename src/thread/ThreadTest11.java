package thread;

/**
 * 关于线程的优先级
 */
public class ThreadTest11 {
    public static void main(String[] args) {

        //设置主线程优先级为1
        Thread.currentThread().setPriority(1);

//        System.out.println("最高优先级"+Thread.MAX_PRIORITY);
//        System.out.println("最低优先级"+Thread.MIN_PRIORITY);
//        System.out.println("默认优先级"+Thread.NORM_PRIORITY);

        //获取当前线程对象，获取当前线程的优先级
        Thread thread = Thread.currentThread();
        //main线程的默认优先级是：5
//        System.out.println(thread.getName()+"线程的默认优先级"+thread.getPriority());

        Thread thread1 = new Thread(new MyRunnable5());
        thread1.currentThread().setPriority(10);
        thread1.setName("t");
        thread1.start();
        //优先级较高的只是抢到cpu时间片相对多一些

        for (int i = 0; i < 10000; i++) {
            System.out.println(Thread.currentThread().getName()+"--->"+i);
        }

    }
}

class MyRunnable5 implements Runnable{

    @Override
    public void run() {
        //获取线程优先级
//        System.out.println(Thread.currentThread().getName()+"线程的默认优先级"+Thread.currentThread().getPriority());

        for (int i = 0; i < 10000; i++) {
            System.out.println(Thread.currentThread().getName()+"--->"+i);
        }
    }
}