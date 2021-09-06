package thread;

/**
 * 线程合并
 */
public class ThreadTest13 {
    public static void main(String[] args) {
        System.out.println("main begin");
        Thread thread = new Thread(new MyRunnable7());
        thread.setName("t");
        thread.start();

        //合并线程
//        try {
//            thread.join();//t合并到当前线程中,当前线程受阻塞,t线程执行，直到结束
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        System.out.println("main over");
    }
}

class MyRunnable7 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName()+"--->"+i);
        }
    }
}