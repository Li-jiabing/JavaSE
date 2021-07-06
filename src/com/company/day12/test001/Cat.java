package com.company.day12.test001;

//猫类
public class Cat extends Animal{

    //方法重写
    @Override
    public void move() {
        System.out.println("猫在走猫步");
    }

    //这个方法是子类对象特有的行为，不是从父类中继承过来的
    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}
