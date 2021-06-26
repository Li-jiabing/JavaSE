package com.company.day07;

/**
 * 方法重载的具体应用
 */
public class OverloadTest04 {
    public static void main(String[] args) {
//        System.out.println("Hello World");
//        System.out.println(10);
//        System.out.println("true");

        U.println("Hello");
        U.println(22);
        U.println(3l);
    }
}


//自定义类
class U{
    public static void println(byte b){
        System.out.println(b);
    }
    public static void println(short b){
        System.out.println(b);
    }
    public static void println(int b){
        System.out.println(b);
    }public static void println(long b){
        System.out.println(b);
    }public static void println(float b){
        System.out.println(b);
    }public static void println(double b){
        System.out.println(b);
    }
    public static void println(boolean b){
        System.out.println(b);
    }
    public static void println(char b){
        System.out.println(b);
    }
    public static void println(String  b){
        System.out.println(b);
    }
}