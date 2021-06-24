package com.company.day06;

public class MethodTest04 {

    /**
     * 方法的调用不一定在main方法当中，可以在其他方法中，只要是程序可以执行到的位置，都可以去调用其他方法
     * @param a
     * @param b
     */
    public static void sum(int a,int b){
        System.out.println(a+"+"+b+"="+(a+b));
        //调用dosome方法
        doSome();
    }

    public static void main(String[] args) {

        //调用sum方法
        sum(1,2);
        System.out.println("Hello World");
    }

    public static void doSome(){
        System.out.println("doSome");
    }
}
