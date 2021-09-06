package thread;

/**
 * 实现线程有两种方式
 * 第一种：
 *      继承thread类重写run方法
 *      怎么创建对象呢？new就行了
 *      怎么启动线程呢？调用线程对象的start()方法
 *
 * 第二种：实现thread
 *
 *
 * 注意：
 *      亘古不变的道理：
 *          方法体当中的代码永远都是自上而下的顺序依次执行的
 */
public class ThreadTest02 {
    public static void main(String[] args) {
        //怎么创建线程对象？怎么启动线程呢
        MyThread myThread = new MyThread();
        myThread.start();//start()方法的作用是启动一个分支线程，在jvm中开辟一个新的栈空间，这段代码任务完成之后瞬间就结束了
        //这段代码的任务是为了开启一个新的栈空间，只要新的栈空间开出来，start()方法就结束了，线程就启动成功了
        //启动成功的线程会自动调用run方法，并且run方法在分支栈的栈底部（压栈）
        //run方法在分支栈的底部，main方法在主栈的底部，main方法和run方法是平级的。

//        这里直接调用run方法还是在主线程里面运行，栈里面没有开辟新的空间，这种方式就是单线程
//        myThread.run();
//        System.exit(0);

        //java中亘古不变的原理，遵循自上而下执行代码的方式，上面的代码没有执行完下面的代码不执行。

        //这里的代码还是运行在主线程中
        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程--->"+i);
        }
    }
}

class MyThread extends Thread{

    @Override
    public void run() {
        //编写程序，这段程序运行在分支栈中
        for (int i = 0; i < 1000; i++) {
            System.out.println("分支线程---->"+i);
        }
    }
}