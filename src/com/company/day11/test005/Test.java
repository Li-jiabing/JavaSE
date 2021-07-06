package com.company.day11.test005;

public class Test {


    //没有static的变量
    int i = 10;


    //带有static的方法
    public static void method1(){
        //调用doSome()
        //完整方式的调用
        Test.doSome();
        //省略方式的调用
        doSome();

        //调用doOther()
        //完整方式的调用
        Test test = new Test();
        test.doOther();
        //省略方式的调用

        //访问i
        //完整方式访问
        System.out.println(test.i);
        //省略方式访问

    }

    //没有static的方法
    public void method2(){
        //调用doSome()
        //完整方式的调用
        Test.doSome();
        //省略方式的调用
        doSome();

        //调用doOther()
        //完整方式的调用
        this.doOther();
        //省略方式的调用
        doOther();


        //访问i
        //完整方式访问
        System.out.println(this.i);
        //省略方式访问
        System.out.println(i);
    }

    //主方法
    public static void main(String[] args) {
        //要求在这里编写程序，调用method1
        //使用完整方式调用
        Test.method1();
        //使用省略方式调用
        method1();

        //要求在这里编写程序，编写method2
        //使用完整方式调用
        Test test = new Test();
        test.method2();
        //使用省略方式调用
    }


    //带有static的方法
    public static void doSome(){
        System.out.println("do Some");
    }

    //不带有static的方法
    public void doOther(){
        System.out.println("do Other");
    }
}
