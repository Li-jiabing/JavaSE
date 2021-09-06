package thread;

/**
 * 关于Thread.sleep()的一个面试题
 */
public class ThreadTest07 {
    public static void main(String[] args) {
        //创建线程对象
        MyThread3 t = new MyThread3();
        t.setName("t");
        t.start();

        //调用sleep()方法
        try {
            //问题：这行代码会让线程t进入睡眠吗
            t.sleep(1000*5);//在执行的时候还是会转换成：Thread.sleep(1000*5)
                                  //这行代码的作用是：让当前线程进入休眠，也就是说main线程进入休眠
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //5秒之后这里才会执行
        System.out.println("hello world");
    }
}
class MyThread3 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(Thread.currentThread().getName()+"--->"+i);
        }
    }
}
