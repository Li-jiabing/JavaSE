package thread;

/**
 * 采用匿名内部类可以吗
 */
public class ThreadTest04 {
    public static void main(String[] args) {

        //创建线程对象，采用匿名内部类方式
        //这是通过一个没有名字的类new出来的对象。
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("分支t线程--->" + i);
                }
            }
        });

        t.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("main主线程--->"+i);
        }
    }
}
