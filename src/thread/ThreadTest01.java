package thread;

/*
    分析一下，以下程序有几个线程
    1个，因为程序只有一个栈。

    一个栈中自上而下的顺序依次执行

    线程对象的生命周期：
        新建状态
        就绪状态
        运行状态
        阻塞状态
        死亡状态
 */
public class ThreadTest01 {
    public static void main(String[] args) {
        System.out.println("main begin");
        m1();
        System.out.println("main over");
    }

    private static void m1() {
        System.out.println("m1 begin");
        m2();
        System.out.println("m1 over");
    }

    private static void m2() {
        System.out.println("m2 begin");
        m3();
        System.out.println("m2 over");
    }

    private static void m3() {
        System.out.println("m3 execute!");
    }
}
