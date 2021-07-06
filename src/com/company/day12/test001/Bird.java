package com.company.day12.test001;

//鸟儿类
public class Bird extends Animal{

    //重写继承父类方法
    @Override
    public void move() {
        System.out.println("鸟儿在飞翔");
    }

    public void fly() {
        System.out.println("BirdFly");
    }
}