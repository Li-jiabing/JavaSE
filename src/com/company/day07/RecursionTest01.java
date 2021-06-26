package com.company.day07;

/**
 * 关于方法的递归调用
 *      1.什么事递归
 *          方法自身调用自身
 *
 *      2.递归是很耗费栈内存的，递归算法可以不用的时候尽量不用
 *
 *      3.以下程序运行的时候发生了这样一个错误[不是异常，是错误Error]
 *      Exception in thread "main" java.lang.StackOverflowError/堆栈内存溢出错误
 *      栈内存溢出错误
 *      错误发生无法挽回，只有一个结果，就是jvm停止工作
 *
 *      4.递归必须有结束条件，没有结束条件一定会发生栈内存溢出错误
 *
 *      5.递归即使有了结束条件，即使结束条件是正确的，也可能会发生栈内存溢出错误，因为递归的太深了
 *
 *      注意：递归可以不使用，尽量不用，但是有些情况下该功能的实现必须依靠递归方式。比如目录拷贝
 */
public class RecursionTest01 {
    public static void main(String[] args) {

        System.out.println("doSome begin");
        doSome();
        System.out.println("doSome over");
    }

    //以下的代码片段虽然只有一份
    //但是可以被重复的调用，并且只要调用doSome()方法就会在栈内存中新分配一块所属的内存空间
    private static void doSome() {
        System.out.println("doSome begin");
        doSome();//这行代码不结束，下一行代码不会执行
        System.out.println("doSome over");
    }
}
