package com.company.day01_02_03;

public class DataTypeTest02 {
    public static void main(String[] args) {
        //定义一个char类型的变量，起名c，同时赋值字符'a'
        char c = 'a';
        System.out.println(c);

        //一个中文占用两个字节，char类型正好是2个字节
        //所以java中的char类型变量可以存储一个中文字符
        char a = '国';
        System.out.println(a);

//        编译错误，ab是字符串不能用单引号括起来
//        char y = 'ab';

//        a是字符串类型，k是字符类型，类型不兼容
//        char k = "a";

        //声明
        char e;

        //赋值

    }
}
