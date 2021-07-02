package com.company.day08;

/**
 * 对象的创建和使用
 */
public class OOTest01 {
    public static void main(String[] args) {

        //int 是基本数据类型
        //i   是一个变量名
        //10  是一个int类型的字面值
        int i = 10;

        //通过一个类可以实例化N个对象
        //实力化对象的语法：new 类名();
        //new是java语言当中的一个运算符
        //new运算符的作用是创建对象，在jvm对内存当中开辟新的内存空间
        //方法去内存：在类夹在的时候，class字节码代码片段被加载到该内存空间当中
        //栈内存（局部变量）：方法代码片段执行的时候，会给该方法分配内存空间，在栈内存中压栈
        //堆内存：new的对象在堆内存中存储
        //student是一个引用数据类型
        //s是一个变量名
        //new Student（）是一个学生对象
        //s 是一个局部变量
        //什么是对象？new运算符在堆内存中开辟的内存空间称为对象
        //什么是引用？引用是一个变量，只不过这个变量中保存了另一个java对象的内存地址
        //java语言中程序员不能直接操作堆内存，不像c语言
        //java语言中程序员只能通过"引用"去访问堆内存中对象内部的实例变量
        Student s = new Student();

        int no = s.no;
        String name = s.name;
        int age = s.age;
        boolean sex = s.sex;
        String address = s.address;
        //访问实例变量的语法格式：
        //读取数据：引用.变量名

        System.out.println("学号："+no);
        System.out.println("名字:"+name);
        System.out.println("年龄:"+age);
        System.out.println("性别："+sex);
        System.out.println("地址："+address);

        //修改数据：引用.变量名 = 值
        no = 1;
        name="李佳冰";
        age=23;
        sex=true;
        address="大理";

        System.out.println("学号："+no);
        System.out.println("名字:"+name);
        System.out.println("年龄:"+age);
        System.out.println("性别:"+sex);
        System.out.println("地址:"+address);


        //再通过实例化一个新的学生对象
        //s1是一个引用，同时也是一个局部变量，Student是变量的数据类型
        Student s1 = new Student();
        System.out.println(s1.no);
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.sex);
        System.out.println(s1.address);

//        编译报错，no这个实例变量不能直接采用"类名"的方式访问
//        因为no是实例变量，对象级别的变量，变量存储在java对象的内部，必须现有对象
//        通过对象才能访问no这个实例变量，不能直接通过"类名"访问
//        Student.no;
    }

    /*
    局部变量在栈内存中存储
    成员变量中的实例变量在堆内存的java对象内部存储
    实例变量是一个对象一份，100个对象有100份
     */

    //成员变量没有手动赋值的话，系统赋默认值
    //默认值
    /**
     *  数据类型                   默认值
     *  ------------------------------
     *   byte、short、int、long     0
     *   float、double             0.0
     *   boolean                   false
     *   char                      \u0000
     *   引用数据类型                 null  空值
     */
}
