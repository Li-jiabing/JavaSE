package com.company.day01_02_03;

/**
 * 关于java中的变量
 *      变量的作用域
 *
 *      1.什么是作用域
 *          变量的作用域，其实描述的就是变量的有效范围
 *          在什么范围之内是可以被访问的，只要除了这个范围该变量就无法访问了。
 *
 *      2.变量的作用域只要记住一句话：
 *          除了大括号就不认识了。
 */
public class VarTest03 {

    //注意：这里的static不要去掉
    static int k = 90;

    public static void main(String[] args) {
        //变量i的作用域是main方法
        //在整个main方法当中是有效的，可见的，可以访问的
        int i = 100;
        System.out.println(k);
        doSome();

        //以下会编写一个for循环语句
        for (int j = 0; j < 10; j++) {//j变量的作用域是整个for循环，for循环结束之后，j变量的内存就释放了
            System.out.println("j:"+j);
        }
        // 这里无法访问j变量
        // System.out.println("j:"+j);

        int a;  //把这个写在外面，他的作用域是main方法
        for(a = 0;a<=20;a++){
            System.out.println("a"+a);
        }
        System.out.println("=========================");
        System.out.println("a:"+a);
    }

    public static void doSome(){

        //这里无法访问main方法当中的变量i
        //已经出了i变量的作用域。
//      System.out.println(i);
        System.out.println(k);
    }
}
