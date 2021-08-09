package com.company.day17;

import com.company.day12.test001.Animal;
import com.company.day12.test001.Cat;

/**
 * 接口的基础语法：
 *      1.类和类之间叫做继承，类和接口之间叫做实现
 *      别多想：你仍然可以将"实现"看作"继承"。
 *      实现使用implements关键字完成
 *
 *      2.重要结论：当一个非抽象的类实现接口的话，必须将接口中的所有抽象方法全部实现（覆盖/重写）
 */

class Test01{
    public static void main(String[] args) {
        //能使用多态吗，可以。
        Animal a = new Cat();

        //父类型的引用指向子类型对象
        MyMath mm = new MyMathImpl();

        //调用接口里面的方法(面向接口编程)
        System.out.println(mm.sum(10, 20));//30
    }
}

//特殊的抽象类，完全抽象的，叫做接口
interface MyMath {
    double PI = 3.1415926;
    int sum(int a,int b);
    int sub(int a,int b);
}

//编写一个类（这个类是一个非抽象的类）
class MyMathImpl implements MyMath{

//    错误：正在尝试分配更低的访问权限：以前为public
//    @Override
//    int sum(int a, int b) {
//        return a+b;
//    }

    //重写/覆盖/实现 接口中的方法，通常我门叫做实现接口
    @Override
    public int sum(int a, int b) {
        return a+b;
    }

    @Override
    public int sub(int a, int b) {
        return a-b;
    }
}

//加上抽象方法关键字，不重写方法编译也能通过
abstract class My implements MyMath{

}