package com.company.day16;

import com.company.day12.test003.A;

/**
 *       类到对象是实例话，对象到类是抽象。
 *
 * 抽象类：
 *      1.什么是抽象类？
 *          类和类之间具有共同特征，将这些共同特征提取出来形成的就是抽象类。
 *          类本身是不存在的额，所以抽象类无法创建对象，无法实例化。
 *
 *      2.抽象类属于什么类型？
 *          抽象类也属于引用数据类型，不是基本数据类型。
 *
 *      3.抽象类怎么定义？
 *          抽象类定义语法：
 *              [修饰符列表] abstract class 类名{
 *                  类体;
 *              }
 *
 *      4.抽象类是无法实例化的，无法创建对象的，所以抽象类是用来被继承的。
 *
 *      5.final和abstract不能联合使用，这两个关键字是对立的。
 *
 *      6.抽象类的子类可以是抽象类
 *
 *      7.抽象类虽然无法实例话，但是抽象类有构造方法，这个构造方法是供子类使用的。
 *
 *      8.抽象类关联到一个概念：抽象方法，什么是抽象方法呢？
 *          抽象方法表示没有实现的方法，没有方法体的方法。例如：
 *              public abstract void doSome();
 *              抽象方法特点是：
 *                  特点1：没有方法体，以分号结尾。
 *                  特点2:前面修饰符列表中有abstract关键字。
 *
 *      9.抽象类中不一定有抽象方法,抽象方法必须出现在抽象类中
 *
 */
public class AbstractTest01 {
    public static void main(String[] args) {
        //抽象类能够创建对象吗
//        Account a = new Account();
        //创建不了
    }
}
//银行账户类,抽象类
abstract class Account{

}

//子类继承抽象类,子类可以实例话
class CreditAccount extends Account{

    //默认有个无参数构造方法
    public CreditAccount(){
        super();
    }
}

//抽象类的子类可以是抽象类吗？  ---可以
abstract class CreditAccount1 extends Account{

}