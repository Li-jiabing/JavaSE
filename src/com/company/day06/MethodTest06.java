package com.company.day06;

/**
 *   方法调用：
 *      1.方法的修饰符列表中有static关键字，完整的调用方式是：类名.方法名(实参列表)
 *      2.但是，有的时候类名.可以省略，什么情况下可以省略呢？
 *      3.建议在一个java源文件中只定义一个class，比较清晰，这里只是为了讲课的方便才在一个java源文件中编写了多个class，这种方式不要模仿
 */
public class MethodTest06 {

    public static void main(String[] args) {

        //调用方法
        MethodTest06.m();

        //对于方法的修饰符列表中有static关键字的，类名可以省略不写吗
        m();

        //调用其他类【不是本类中】中的方法,默认从当前类中好doOther方法，在当前类中不存在
        A.doOther();
    }

    public static void m(){
        System.out.println("m method excute!");
        m2();
        A.m2();
    }

    public static void m2(){
        System.out.println("m2");
    }

}


class A{
    public static void doOther(){
        System.out.println("A");
    }

    public static void m2(){
        System.out.println("m2");
    }
}
