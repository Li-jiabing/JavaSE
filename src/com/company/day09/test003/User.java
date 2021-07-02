package com.company.day09.test003;

/**
 * 用户类
 *
 * 封装的步骤：
 *  1.所有的属性私有化，使用private关键字进行修饰，private表示私有的，修饰的所有数据只能在本类中访问
 *  2.对外提供简单的操作入口，也就是说以后外部程序想要访问age属性，必须通过这些简单的入口进行访问
 *      -对外提供两个公开的方法，分别是set方法和get方法
 *      -像修改age属性，调用set方法
 *      -想读取age属性，调用get方法
 *
 *  3.set方法的命名规范：
 *  public void set+属性名首字母大些(形参){
 *      age = a;
 *  }
 *
 *  4.get方法的命名规范
 *  public int getAge(){
 *      return age;
 *  }
 *
 *
 *  回顾一下，一个属性通常访问的时候，有几种访问形式
 *      *第一种方式：读取这个属性的值，读取/get
 *      *第二种方式：修改这个属性的值，修改/set
 *
 *      需要大家背会一下内容：
 *      * setter and getter 方法没有static关键字
 *      * 有static关键字修饰符的方法怎么调用：类名.方法名（实参）
 *      * 没有static关键字修饰符的方法怎么调用：引用.方法名(实参)
 */
public class User {
    //属性私有化
    private int age;

    public int getAge() {
        return age;
    }

    //set方法没有返回值，因为set方法只负责修改数据
    public void setAge(int age) {
//      age = age;//java有就近原则，这里其实并没有给age属性赋值，这里的age都是局部变量age
        if (age<0 || age>150){
            System.out.println("对不起，您提供的年龄不在合法范围之内");
            return;
        }
        //程序可以执行到这里的话，说明age年龄是合法的，则进行赋值运算
        this.age = age;
    }
}
