package InnerClass;

/**
 * 匿名内部类：
 *      1.什么是内部类？
 *          内部类：在类的内部又定义了一个新的类，被称为内部类
 *      2.内部类的分类
 *          静态内部类：类似于静态变量
 *          实例内部类：类似于实例变量
 *          局部内部类：类似于局部变量
 *
 *      3.使用内部类编写的代码，可读性很差，能不用尽量不用。
 *
 *      4.匿名内部类是局部内部类的一种，
 *        因为这个类没有名字而得名，叫做匿名内部类。
 *
 *      5.学习匿名内部类主要是让大家以后在阅读别人代码的时候，能够理解。
 *      并不代表以后都要这样写，因为匿名内部类有两个缺点：
 *          缺点1：太复杂，太乱，可读性太差
 *          缺点2：类没有名字，以后想重复使用，不能用
 */
public class Test01 {
    public static void main(String[] args) {
        //调用MyMath中的mySum方法
        MyMath mm = new MyMath();

        //合并(这样写代码，表示这个类名是有的，类名是：ComputeImpl)
//        mm.mySum(new ComputeImpl(),100,200);

        //使用匿名内部类，表示这个ComputeImpl这个类没名字了
        //这里表面上看上去好像是接口可以直接new了，实际上并不是接口可以new了。
        //这里的{}代表了对接口的实现
        //不建议使用匿名内部类，为什么？
        //因为一个类没有名字，没有办法重复使用，另外代码太乱，可读性太差
        mm.mySum(new Compute(){
            public int sum(int a,int b){
                return a+b;
            }
        },100,200);
    }

    //静态变量
    static String country;
    //该类在类的内部，所以称为内部类
    //由于前面又static，所以称为"静态内部类"
    static class Inner1{

    }

    //该类在类的内部，所以称为内部类
    //没有static，我们叫他实例内部类
    class Inner2{

    }

    public void doSome(){
        //局部变量
        int i = 1010;
        //该类在类的内部，所以称为内部类
        //局部内部类
        class Inner3{
        }
    }

    public void doOther(){
        //doSome()方法中的局部内部类Inner3，在doOther()中不能用。
    }
}

//接口
interface Compute{//负责计算的一个接口

    //抽象方法
    int sum(int a,int b);

}

//class ComputeImpl implements Compute{
//
//    @Override
//    public int sum(int a, int b) {
//        return a+b;//对方法的实现
//    }
//}

//数学类
class MyMath{
    public void mySum(Compute c,int x,int y){
       int value = c.sum(x,y);
        System.out.println(x+"+"+y+"="+value);
    }
}
