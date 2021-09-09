package thread;

/**
 * 守护线程
 */
public class ThreadTest14 {
    public static void main(String[] args) {
        Thread t1 = new BakDataThread();
        t1.setName("备份数据线程");

        //启动线程之前，将线程设置为守护线程
        t1.setDaemon(true);

        t1.start();
        
        //主线程
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
class BakDataThread extends Thread{
    @Override
    public void run() {
        int i = 0;
        //即使是死循环，也会中止
        while (true){
            System.out.println(Thread.currentThread().getName()+"--->"+(++i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}