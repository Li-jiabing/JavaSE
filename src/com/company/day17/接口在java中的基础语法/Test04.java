package com.company.day17.接口在java中的基础语法;

/**
 * 继承和实现都存在的话，代码应该怎么写
 *  先继承后实现，extends在前，implements在后
 */
public class Test04 {
    public static void main(String[] args) {

        //创建对象
        Flyable f = new Cat();
        f.fly();

        //同一个接口，调用同一个fly()方法，最后的执行效果不同
        Flyable f1 = new Pig();
        f1.fly();

        Flyable f3 = new Fish();
        f3.fly();
    }
}

//动物类，父类
class Animal{

}

//可飞翔的接口（是一对翅膀）
//能插拔的就是接口。（没有接口你怎么插拔）
//内存条插到主板上，他们之间有接口。内存条可以更换
//接口通常提取的是行为动作
interface Flyable{
    void fly();
}

//猫类，子类
//Flyable是一个接口，是一对翅膀的接口，通过接口插到猫身上，让猫变得可以飞翔
class Cat extends Animal implements Flyable{

    @Override
    public void fly() {
        System.out.println("飞猫起飞，翱翔太空的一只猫！");
    }
}

//蛇类，如果你不想让他飞，可以不实现Flyable接口
//没有实现这个接口表示你没有翅膀，没有给你插翅膀，你肯定不能飞
class Snake extends Animal{

}

//想飞就插翅膀这个接口
class Pig extends Animal implements Flyable{
    @Override
    public void fly() {
        System.out.println("我是一只会飞的猪");
    }
}

//鱼类(默认实际上是存在继承的，默认继承Object)
class Fish extends Object implements Flyable {
    @Override
    public void fly() {
        System.out.println("我是六眼飞鱼");
    }//没写extends，也是有的，默认继承Object。

}