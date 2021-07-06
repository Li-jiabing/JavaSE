package com.company.day11.test005;


/**
 * 什么时候程序在运行的时候出现空指针异常呢？
 *      空引用访问实例相关的数据，因为实例相关的数据就是对象相关的数据
 *      这些数据在访问的时候，必须有对象的参与，当空引用的时候，对象不存在
 *      访问这些实例数据一定会出现空指针异常
 *
 *  实例相关的数据包括：
 *      实例变量【对象需要存在】
 *      实例方法【对象需要存在】
 */
public class Test01 {
    public static void main(String[] args) {
        Test01.doSome();
        doSome();

        Test01 t = new Test01();
        t.doSome();

        //引用是空，为什么不保空指针异常
        //看着是t.doSome(),其实底层还是用的类名.doSome()
        t = null;

        //带有static的方法其实既可以采用类名的方式访问，也可以采用引用的方式访问
        //但是即使采用引用的方式去访问，实际上执行的时候和引用指向的对象无关
        //所有带有static的方法，还是建议用"类名."的方式运行
        t.doSome();//这里不会出现空指针异常
    }

    //带有static的方法，需要使用类名.的方式访问
    public static void doSome(){
        System.out.println("do Some!");
    }


}
