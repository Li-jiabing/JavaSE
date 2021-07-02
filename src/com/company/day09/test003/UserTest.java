package com.company.day09.test003;

/**
 * 用户测试类
 *
 * 对于当前程序来说，User类的age属性在外部程序中可以随意访问，导致age属性的不安全。一个User对象表示一个用户，用户的年龄数不能为负数，以下
 * 程序中年龄值为负数，程序运行的时候并没有报错，这事当前程序存在的缺陷
 *
 * 面向对象三大特征：继承封装和多态
 *
 * 当前主要讲的是封装机制，为什么要封装？封装有什么好处？
 *      封装的好处：
 *          1.封装之后，对于那个事物来说，看不到这个事物比较负责的一面，只能看到该事物简单的那一面。
 *          复杂性封装，对外提供简单的操作入口。照相机就是一个很好的封装的案例，照相机的实现原理非常复杂，
 *          但是对于使用照相机的人来说，操作起来是非常方便的是非常便捷的，还有像电视机也是封装的，电视机内
 *          实现原来非常复杂，但是对于使用者来说不用关心内部的实现原理，只要会操作遥控器就行。
 *
 *          2.封装之后才会形成真正的"对象"，真正的独立体
 *
 *          3.封装就意味着以后的程序可以重复使用，并且这个事物应该适应性比较强，在任何场合都可以使用
 *
 *          4.封装之后，对于事物本身，提高了安全性【安全级别高】
 */
public class UserTest {
    public static void main(String[] args) {
        //创建User对象
        User user = new User();

        user.setAge(23);
        System.out.println(user.getAge());

//        //访问年龄[读取年龄值"get]
//        System.out.println(user.age);
//
//        //修改值
//        user.age = 20;
//        System.out.println(user.age);
//
          //这里的age属性显然是完全暴露给外部程序的，对于程序员来说可以操作User对象中所有的细节，导致User中部分数据不安全
        //不建议这样，建议User类型进行封装，建议在外部程序中不能随意访问User对象中的属性，这样可以保证属性的安全
//        user.age = -100;
//        System.out.println(user.age);
    }
}
