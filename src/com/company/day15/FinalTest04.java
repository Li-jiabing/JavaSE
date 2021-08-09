package com.company.day15;

public class FinalTest04 {
    public static void main(String[] args) {
        System.out.println(Chinese.COUNTRY);

//        不能给他重新赋值
//        Chinese.COUNTRY = "美国";

    }
}

class Chinese{
    //身份证号，每个人都不一样，对象级别的
    String idCard;
    //姓名，对象不同姓名不一样。
    String name;

    /**
     * 上一个例子的结论：final修饰的实例变量，必须手动赋值。
     *           重点：final修饰的 变量，只能赋一次值。
     *      final随时的实例变量一半天假static修饰。
     *
     *      终极结论：
     *          static final联合修饰的变量称为"常量"。
     *          常量名建议全部大写，每个单词之间采用下划线衔接。
     *
     *      常量和静态变量，都是存储在方法区，并且都是在类加载时初始化
     */
    //国家的值是一个固定值："中国"
    //实例变量在堆中，一个对象一份，100个对象100份。
    //实例变量既然时候final修饰了，说明该实例对象不会随着对象的变化而变化。
    static final String country = "中国";

    static final String COUNTRY = "中国";

    //i永远都是10，创建100个对象，i也是10
    //i是10是永远不会发发生改变的，既然这样没必要声明为实例变量，最好是静态的，节省内存空间
    static final int i = 100;
}

class MyMath{
    //数学中的pai是永远不会变得
    public static final double PI = 3.1415926;
}

/**
 * 总结：final关键字
 *    1.1、final修饰的类无法继承。
 *    1.2、final修饰的方法无法覆盖。
 *    1.3、final修饰的变量只能赋一次值。
 *    1.4、final修饰的引用一旦指向某个对象，则不能再重新指向其他对象，但该引用指向的对象内部的数据是可以修改的。
 *    1.5、final修饰的实例变量必须手动初始化，不能采用系统默认值。
 *    1.6、final修饰的 实例变量一般和static联合使用，称为常量。
 */
