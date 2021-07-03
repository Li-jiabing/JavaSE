package com.company.day11.test002;

/**
 * 最终结论：带有static方法的方法中不能"直接"访问实例变量和实例方法。
 * 因为实例变量和实例方法都需要对象的存在
 * 而static的方法中是没有this的。也就是说当前对象是不存在的。
 * 自然也是无法访问实例对象和实例方法。
 */
public class ThisTest01 {

    //带有static
    //主方法
    public static void main(String[] args) {

        //调用doSome方法
        doSome();

        //调用doOther方法,实例方法必须先创建对象，通过引用.的方式访问
        ThisTest01 test01 = new ThisTest01();
        test01.doOther();
        test01.run();

//        doOther是实例方法，实例方法调用必须有对象的存在
//        以下代码表示的含义：调用当前对象的doOther方法
//        但是由于main方法中没有this，所以以下方法不能调用。
//        doOther();
    }

    //带有static
    public static void doSome(){
        System.out.println("do Some");
    }

    public void doOther(){
        //this表示当前对象
        System.out.println("do Other");
    }

    //实例方法
    public void run(){
        //run是实例方法，调用run方法的一定是有对象存在的
        //一定是先创建了对象才去调用了run方法
        //在大括号中的代码执行过程当中一定是存在"当前对象的"。
        //也就是说这里一定是有"this"的。
        System.out.println("run execute");

        //doOther是一个实例方法，实例方法调用必须有对象的存在
        //以下代码表示的含义就是：调用当前对象的doOther方法
        //doOther();
        doOther();
        this.doOther();//完整写法，this可以省略
    }
}
