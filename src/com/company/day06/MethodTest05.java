package com.company.day06;

//方法调用的时候实参和形参要求个数对应相同，数据类型对应相同
//类型不同的时候要求能够进行对应的自动类型转换
public class MethodTest05 {
    public static void main(String[] args) {
        //编译错误    方法有形参，调用方法必须传相同的实参
//        sum();
        //强转
        sum((long) 3.0,23);
    }

    public static void sum(long a,long b){
        System.out.println(a+"+"+b+"="+(a+b));
    }
}
