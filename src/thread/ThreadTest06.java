package thread;

/**
 * 关于线程的sleep方法：
 *  static void sleep(long millis)
 *  1.静态方法：Thread.sleep(1000)
 *  2.参数是毫秒
 *  3.作用：让当前线程进入休眠，进入"阻塞状态"，放弃占有cpu时间片，让给其他线程使用。
 *      这行代码出现在A线程中，A线程就会进入休眠
 *      这行代码出现在B线程中，B线程就会进入休眠
 */
public class ThreadTest06 {
    public static void main(String[] args) {

/*        //让当前线程进入休眠
        try {
            Thread.sleep(5000);
            System.out.println("hello world");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"--->"+i);

            //睡眠一秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
