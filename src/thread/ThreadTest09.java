package thread;

/**
 * 在java中怎么强行中止一个线程的执行
 *    这种方式存在很大的缺点，容易丢失数据。因为这种方式是直接将程序杀死了。
 */
public class ThreadTest09 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyThread3());
        t.setName("t");
        t.start();

        //模拟5秒
        try {
            Thread.sleep(5*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //5秒之后强行中止t线程
        t.stop();//已过时，不建议使用。
    }

}


class MyRunnable3 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"--->"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}