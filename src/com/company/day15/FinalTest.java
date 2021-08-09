package com.company.day15;

/**
 * final：
 *    1.final是java语言中的一个关键字
 *    2.final表示最终的，不可变的。
 *    3.final可以修饰变量以及方法，还有类等。
 *    4.final修饰的变量？
 *       被final修饰的变量不能改变值。
 *    5.final修饰的方法？
 *       被final修饰的方法不能被重写。
 *    6.final修饰的类？
 *       被final修饰的类不能被继承。
 *    7.final控制不了能不能调用的问题，final管的是啥？
 *       final修饰的表示最后的，不能变得，不能改的
 *
 *    重点：final修饰的变量只能赋一次值。
 */
public class FinalTest {
    public static void main(String[] args) {


        int i = 100;
        i = 122;

        //局部变量
        final int k = 100;
//        k = 150;错误：无法为final变量k分配值

        //局部变量没有初始值，只有成员变量有初始值
        final int m;
        //第一次赋值
        m = 200;
        //第二次赋值
//        m = 250;报错


    }
}

//错误：被final修饰的类不能被继承
//class MyString extends String{}

//class C{
//    public final void doSome(){
//        System.out.println("c的dosome方法");
//    }
//}
//class D extends C{
//    public void doSome(){
//        System.out.println("d的dosome方法");
//    }
//}