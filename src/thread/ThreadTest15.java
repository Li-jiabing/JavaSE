package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;//JUC包 属于java并发包，老jak中没有这个包，java新特性

public class ThreadTest15 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //创建一个未来人物类对象
        //参数非常重要，需要给一个callable接口的实现类对象
        FutureTask futureTask = new FutureTask(new Callable() {
            @Override
            public Object call() throws Exception {//call方法相当于run方法，只不过这里有返回值
                //线程执行一个任务，执行之后可能会有一个执行结果
                //模拟执行
                System.out.println("call method begin");
                Thread.sleep(1000);
                System.out.println("call method begin");
                int a = 100;
                int b = 200;
                return a+b;
            }
        });

        //创建一个线程对象
        Thread thread = new Thread(futureTask);
        //启动线程
        thread.start();

        //这里是manin方法，这是在主线程中
        //在主线程中，怎么获取t线程的返回结果？
        Object obj = futureTask.get();
        System.out.println("线程执行结果："+obj);

        //main方法这里的程序想要执行必须等待get()方法的结束
        //而get()方法可能需要很久，因为get()方法是为了哪一个线程的执行结果
        //另一个线程执行是需要时间的
        System.out.println("heelo world");
    }
}

