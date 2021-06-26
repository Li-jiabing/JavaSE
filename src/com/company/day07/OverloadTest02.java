package com.company.day07;

import java.util.Scanner;

/**
 * 该程序还是一个体验程序，我们来体验一下方法重载的优点：
 *      *程序员调用方法的时候，比较方便，苏爱染调用的是不同的方法，但是就感觉在使用一个方法一样。
 *      不需要记忆更多的方法名。
 *
 *      *代码美观
 *
 *  前提：功能相似的时候，方法名可以相同
 *  但是，功能不同的时候，尽可能让这两个方法的名字不同
 */
public class OverloadTest02 {
    public static void main(String[] args) {

        //调用方法的时候就像在使用一个方法一样
        System.out.println(sum(1, 2));//参数的类型不同，对应调用的方法不同，此时区分方法不再依靠方法名，而是依靠参数的数据类型
        System.out.println(sum(1.0, 2.0));
        System.out.println(sum(1l, 2l));
    }


    //以下三个方法构成了方法重载机制
    public static int sum(int a,int b){
        return a+b;
    }
    public static double sum(double a,double b){
        return a+b;
    }
    public static long sum(long a,long b){
        return a+b;
    }
}
