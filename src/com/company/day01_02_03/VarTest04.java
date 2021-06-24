package com.company.day01_02_03;

/**
 * 关于变量的分类：
 *      根据变量声明的位置来分类：
 *          *局部变量：
 *              -在方法体当中声明的变量叫做局部变量
 *
 *          *成员变量：
 *              -在方法体外【类体之内】声明的变量叫做成员变量
 *
 *     在不同的作用域中，变量名是可以相同的
 *     在同一个作用域中，变量名不能重名
 */
public class VarTest04 {

    //成员变量
    int j = 20;

    public static void main(String[] args) {

        //i变量就是局部变量
//        int i = 10;

//        java遵循就近原则
//        main函数中没有i的时候，main方法从类里面去获取i的值，但是类中的i需要用static静态符来修饰
        System.out.println(i);//10
    }

    //成员变量
    static int i = 100;

//    类体中不能直接编写java语句，【除声明变量之外】
//    Sysout.out.println(i);

    //doSome方法
    public static void doSome(){
        //局部变量
        int i = 100;
    }
}
