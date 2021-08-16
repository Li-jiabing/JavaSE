package API;

/**
 * 关于Object类中的finalize()方法。
 *  1.这个方法是protected修饰的，在Object类中这个方法的源代码是？
 *      protected void finalize() throws Throwable(){}
 *      GC：负责调用这个finalize()方法
 *
 *  2.finalize()方法只有一个方法体，里面没有代码，而且这个方法是protected修饰的。
 *
 *  3.这个方法不需要程序员手动调用，JVM的垃圾回收器负责调用这个方法。
 *  不像equals toString，equals和toString()方法是需要你写代码调用的。
 *  finalize()只需要重写，重写完将来自动会有程序来调用。
 *
 *  4.finalize()方法的执行时机：
 *      当一个java对象即将被垃圾回收器回收的时候，垃圾回收器负责调用finalize()方法。
 *
 *  5.finalize()方法实际上是sun公司为java程序员准备的一个时机，垃圾销毁时机。
 *    如果希望在对象销毁时执行一段代码的话，这段代码要写到finalize()方法当中。
 *
 *  6.静态代码块的作用是什么？
 *      static{
 *
 *      }
 *      静态代码块在类加载时刻执行，并且只执行一次。
 *      这是一个sun准备的类加载时机
 *
 *      finalize()方法同样也是sun为程序员准备的一个时机
 *      这个时机是垃圾回收时机
 *
 *  7.java中的垃圾回收器不是轻易启动的，垃圾太少或者时间没到，种种条件下
 *    有可能启动，也有可能不启动。
 */
public class FinalizeTest {
    public static void main(String[] args) {
        //创建对象
        Person person = new Person();
        //怎么把Person对象变成垃圾
        person = null;
        //多造点垃圾
//        for (int i = 0; i < 1000000000; i++) {
//            Person person = new Person();
//            person = null;
//        }

        for (int i = 0; i < 10; i++) {
            Person p = new Person();
            p = null;
            System.gc();
        }
        //有一段代码可以建议垃圾回收器启动
//        System.gc();//只是建议，可能不启动也可能启动，只是启动的概率高一些
    }
}

//项目开发中有这样的要求：所有对象在JVM中被释放的时候，请记录一下释放时间！！！
//记录对象被释放的时间点，这个负责记录的代码写在哪里？
//写到finalize()方法中
class Person{
    //重写finalize()方法
    //Person类型的对象被垃圾回收期回收的时候，垃圾回收器负责调用：p.finalize()
    @Override
    protected void finalize() throws Throwable {
        System.out.println(this+"即将被销毁！！！");
    }
}