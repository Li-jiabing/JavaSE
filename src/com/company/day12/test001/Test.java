package com.company.day12.test001;

/**
 * 关于java语言当中的多态语法机制【只是多态的基础语法，多态的作用在后续的例子中讲解】
 *      1、Animal、Cat、Bird三个类之间的关系
 *          Cat继承Animal
 *          Bird继承Animal
 *          Cat和Bird之间没有任何继承关系
 *
 *      2、面向对象三大特征：封装、继承、多态
 *
 *      3、多态涉及到几个概念：
 *          * 向上转型（upcasting）
 *              子类型--->父类型 （自动类型转换）
 *          * 向下转型（downcasting）
 *              父类型--->子类行 （强制类型转换，需要加强制类型转换符）
 *          * 需要记忆：无论是向上转型还是向下转型，两种类型之间必须要有继承关系
 *                  没有继承关系，程序是无法编译通过的
 */
public class Test {
    public static void main(String[] args) {
        //以前编写的程序
        Animal a1 = new Animal();
        a1.move();

        Cat c1 = new Cat();
        c1.move();

        Bird b1 = new Bird();
        b1.move();

        //使用多态语法机制
        /**
         * 1.Animal和Cat之间存在继承关系，Animal是父类，Cat是子类
         *
         * 2.Cat is a Animal
         *
         * 3.new Cat()创建的对象的类型是Cat，animal这个引用的数据类型是animal，可见他们进行了转换
         * 子类转换成父类型，称为向上转型/upcasting，或者称为自动类型转换。
         *
         * 4.Java中允许这种语法，父类型引用指向子类行对象
         */
        Animal a2 = new Cat();    //可以编译通过
//        Cat cat = new Animal();   编译不通过

        /**
         *  1、Java程序永远都分为编译阶段和运行阶段
         *
         *  2、先分析编译阶段，再分析运行阶段，编译无法通过，根本是无法运行的。
         *
         *  3、编译阶段编译器检查a2这个引用的数据库类型为animal，由于Animal.class字节码当中有这个move()方法，
         *  所以编译通过了，这个过程我门称为静态绑定，编译阶段绑定。
         *  只有静态绑定成功之后才有后续的运行
         *
         *  4、在程序运行阶段，JVM堆内存中真实创建的对象是cat对象，那么以下程序在运行阶段一定会调用Cat对象的move()方法
         *  此时发生了程序的动态绑定，运行阶段绑定。
         *
         *  5.无论是Cat类有没有重写move方法，运行阶段一定是调用的是Cat对象的move方法，因为底层真实对象就是Cat对象
         *
         *  6.父类型引用指向子类型对象这种机制导致程序存在编译阶段绑定和运行阶段绑定两种不同的形态/状态
         *  这种机制可以称为多态语法机制。
         */
        //此时把cat对象的move方法注释掉，a2调用的move方法还是cat的move方法，与你重写不重写无关
        a2.move();

        /**
         * 分析以下程序为什么不能调用呢？
         *      因为编译阶段编译器检查到a2的类型是Animal类型，
         *      从Animal.class字节码文件当中查找catchMouse()方法，最终没有找到该方法
         *      导致静态绑定失败，没有绑定成功，也就是说编译失败了，就别谈运行了。
         */
//        a2.catch();

        /**
         * 需求：
         *     假设就是想让a2去抓老鼠，怎么办，a2是无法直接调用的，因为a2的类型animal中没有catchMouse()方法。
         *     我们可以将a2强制类型转换为Cat类型。
         *     a2的类型是Animal（父类），转换成Cat类型（子类），被称为向下转型，downcasting/强制类型转换
         *
         *   首先，向下转型也需要两种类执行之间必须有继承关系，不然编译报错。强制类型转换需要加强制类型装欢符。
         *
         *   什么时候需要用向下转型呢？
         *      当调用的方法是子类型中特有的，在父类型中不存在。必须进行向下转型。
         */
        Cat c2 = (Cat)a2;
        c2.catchMouse();

        //父类型引用指向子类对象[多态]
        /**
         * 1.以下程序编译是没有问题的，因为编译器检查到a3的数据类型是animal
         *   animal和cat之间存在继承关系，并且animal是父类型，cat是子类型
         *   父类型转换成子类型叫做向下转型，语法合格。
         *
         * 2.程序虽然编译通过了，但是程序在运行阶段会出现异常，因为JVM堆内存当中真实存在的对象是Bird类型
         * Bird对象无法转换成Cat对象，因为两种类型之间不存在任何继承关系，此时出现了著名的异常：
         *          java.lang.ClassCastException//类转换异常
         *          类型转换异常，这种异常总是在"向下"转型的时候会发生
         */
        Animal a3 = new Bird();
//        Cat c3 = (Cat)a3;
//        c3.catchMouse();//报类转换异常


        /**
         * 1.以上异常只有在强制类型转换的时候会发生，也就是说向下转型存在安全隐患，向下转型存在隐患（编译通过了，但是运行报错！）
         *
         * 2.向上转型只要编译过了，运行就肯定不会出问题。 Animal a = new Cat();
         *
         * 3.向下转型编译通，运行可能错误：Animal ae = new Bird();Cat c3 = cat(a3);
         *
         * 4.怎么避免向下转型出现的ClassCastException呢？
         *      使用instanceof运算符可以避免出现以上异常。
         *
         * 5.instanceof运算符怎么用？
         *      5.1 语法格式：
         *          (引用 instanceof 数据类型名)
         *
         *      5.2 以上运算符的执行结果是布尔类型，结果可能是true/false
         *
         *      5.3 关于运算结果true/false：
         *          假设：（a instanceof Animal）
         *              true表示：
         *                  a这个引用指向的对象是一个Animal类型
         *              false表示：
         *                  a这个引用指向的对象不是一个Animal类型
         *
         *
         * 6.Java规范中要求：在进行类型转换前，建议采用instanceof运算符进行判断，避免ClassCastException异常的发生。这是一种编程好习惯。
         */
        //当a3引用指向的对象确实是一个Cat的时候才能这么写
        if (a3 instanceof Cat) {//a3是一个Cat类型的对象
            Cat c3 = (Cat)a3;
            c3.catchMouse();
        }else if(a3 instanceof Bird){//a3是一个Bird类型的对象
            Bird b2 = (Bird)a3;
            b2.fly();
        }
    }
}