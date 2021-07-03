package com.company.day11.test002;

public class ThisTest02 {

    //实例
    String name;

    //实例
    public void doSome(){

    }

    //带有static
    public static void main(String[] args) {

        //这里没有this
//        System.out.println(name);
//        doSome();

        //想访问，必须把对象先new出来，再去调用
        ThisTest02 thisTest02 = new ThisTest02();
        System.out.println(thisTest02.name);
        thisTest02.doSome();
    }
}
