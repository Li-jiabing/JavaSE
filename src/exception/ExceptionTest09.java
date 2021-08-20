package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * 异常对象的两个方法
 *  String msg = e.getMessage()
 *  e.printStackTrace();
 *
 *  我们以后查看异常的追踪信息，我们应该怎么看可以快速的调试程序呢
 *  异常追踪信息从上往下一行一行看，但是需要注意的是，sun写的代码就不要看了
 *  主要问题出在自己编写的代码上
 */
public class ExceptionTest09 {
    public static void main(String[] args) {
        try {
            m1();
        } catch (FileNotFoundException e) {
            //默认打印异常堆栈追踪信息！！！
            //在实际开发中，建议使用这个，养成好习惯


//            java.io.FileNotFoundException: /User/lijiabing/Desktop/笔记/面向对象.md (No such file or directory)
//            at java.io.FileInputStream.open0(Native Method)
//            at java.io.FileInputStream.open(FileInputStream.java:195)
//            at java.io.FileInputStream.<init>(FileInputStream.java:138)
//            at java.io.FileInputStream.<init>(FileInputStream.java:93)
//            at exception.ExceptionTest09.m3(ExceptionTest09.java:31)
//            at exception.ExceptionTest09.m2(ExceptionTest09.java:27)
//            at exception.ExceptionTest09.m1(ExceptionTest09.java:23)
//            at exception.ExceptionTest09.main(ExceptionTest09.java:14)

            e.printStackTrace();
        }



        //这里程序不耽误执行，很健壮，服务器不会因为遇到异常而宕机
        System.out.println("hello world");
    }

    private static void m1() throws FileNotFoundException {
        m2();
    }

    private static void m2() throws FileNotFoundException {
        m3();
    }

    private static void m3() throws FileNotFoundException {
        new FileInputStream("/User/lijiabing/Desktop/笔记/面向对象.md");
    }
}
