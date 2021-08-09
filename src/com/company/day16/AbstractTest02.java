package com.company.day16;

import com.company.day12.test003.A;

/**
 * 抽象类：
 *      1.抽象类中不一定有抽象方法，抽象方法必须出现在抽象类中。
 *      2.重要结论：重要结论****（必须记住）
 *          一个非抽象的类继承抽象类，必须将抽象类中的抽象方法实现了。
 *          这是java语法上强行规定的，必须的，不然编译器就报错了。
 *
 *          这里的覆盖或者说重写，也可以叫做实现。（对抽象的实现）
 */
public class AbstractTest02 {
    public static void main(String[] args) {
//        能不能使用多态？
//        父类型引用指向子类行对象。
        Animal animal = new Bird() {//向上转型（自动类型转换）

            //这就是面向对象编程
            //以后你都是调用的a.xxxx
            //a的类型是Animal，Animal是抽象的
            //面向抽象编程，不要面向具体编程，降低程序的耦合度，提高程序的扩展力
            //这种编程死相符合OCP原则
            @Override
            //多态（当对多态不是很理解的时候，以后代码能用多态就用多态）
            public void move() {
            }
        };
    }
}

//抽象类，动物类
abstract class Animal{

    //抽象方法
    public abstract void move();
}

//子类继承父类也必须是抽象类
abstract class Bird extends Animal{
    public void move(){
        System.out.println("鸟儿在飞翔！");
    }
}
/**
 * 有些内容不要死记硬背，讲讲道理。
 * 分析：
 *      animal是父类，并且是抽象的。
 *      animal这个抽象类中有一个抽象方法move。
 *
 *      bird是子类，并且是非抽象的。
 *      bird继承animal之后会将抽象方法继承过来
 */

/**
 * 抽象类总结：
 *      1.抽象类怎么定义
 *          在class前添加abstract关键字就行了
 *      2.抽象类是无法实例化的，无法创建对象的，所以抽象类是用来被子类继承的。
 *      3.final和abstract不能联合使用，这两个关键字是对立的。
 *      4.抽象类的子类可以是抽象类，也可以是非抽象类。
 *      5.抽象类虽然无法实例化，但是抽象类有构造方法，这个构造方法是供子类使用的。
 *      6.抽象类中不一定有抽象方法，抽象方法必须出现在抽象类中
 *      7.抽象方法怎么定义：
 *          public abstract void doSome();
 *  *** 8.一个非抽象的类，继承抽象类，必须将抽象类中的抽象方法进行覆盖/重写/实现。
 *
 *
 *  到目前为止，只是学习了抽象类的基础语法，一个类到底声明为抽象还是非抽象，这个以后慢慢来吧，写代码多的时候，自然就理解了。
 *
 *  面试题：
 *      java语言中，凡是没有方法体的方法都是抽象方法。
 *          不对，错误的，Object类中就有很多方法都没有方法体，都是以";"结尾的，他们都不是抽象方法，例如：
 *          public native int hashCode();
 *          这个方法底层调用了c++写的动态链接库程序。
 *          前面修饰符列表中没有：abstract。有一个native，表示调用JVM本地程序。
 */