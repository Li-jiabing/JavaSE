package com.company.day11.test002;

public class ThisTest {

    //实例变量(引用.的方式访问)
    int num = 10;

    //带有static的方法
    //JVM负责调用main方法，JVM是怎么调用的？
    //ThisTest.main(String[]);
    public static void main(String[] args) {

        //没有当前对象this

        //以下代码什么意思？
        //访问当前对象的num

        //全局变量通过new对象这么访问
        ThisTest thisTest = new ThisTest();
        System.out.println(thisTest.num);
    }
}
