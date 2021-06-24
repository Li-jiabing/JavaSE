package com.company.day06;

/**
 *    以下直接使用了方法这种机制[这个例子不讲方法的语法]，分析程序的优点
 *        *代码得到了重复使用
 *
 *    方法的本质是什么？
 *        *方法就是一段代码片段，并且这段代码可以完成某个特定功能，并且可以被重复的使用
 *
 *        方法对应的英语单词：  method
 *        方法在c语言中叫函数   function
 *
 *        方法定义在类体中，在一个类中可以定义多个方法，方法编写的位置没有先后顺序，可以随意
 *
 *        方法体中不能再定义方法！！！！！
 *
 *        方法体由java语句构成，方法体中的代码遵守自上而下的顺序依次执行
 */
public class MethodTest02 {
    public static void main(String[] args) {
            sumInt(10,20);
            sumInt(300,322);
    }


    //单独的定义一个方法
    //该方法完成计算两个int类型数据的和，并且将结果输出
    public static void sumInt(int a,int b){
        int c = a + b;
        System.out.println("a"+"+"+"b"+"="+c);
    }
}
