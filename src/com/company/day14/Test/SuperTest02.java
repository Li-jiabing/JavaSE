package com.company.day14.Test;

public class SuperTest02 {
    public static void main(String[] args) {
        new C();
        /**
         * 判断程序的输出结果
         * 1
         * 3
         * 6
         * 5
         * 4
         *
         * 在java语言中不管是new什么对象，最后老祖宗的Object类的无参数构造方法一定会执行。（Object类的无参数构造方法是处于"栈顶部"）
         *
         * 栈顶的特点：
         *      最后调用，但是最先执行结束
         *      后进先出原则
         *
         * 大家要注意：
         *      以后写代码的时候，一个类的无参数构造方法还是建议大家手动的写出来。
         *      如果无参数构造方法丢失的话，可能会影响到子类对象的创建
         */
    }

}

//这是sun公司定义的
//class Object{
//    public Object(){
//
//    }
//}

class A{
    public A(){
        System.out.println("A的无参数构造执行");//1
        System.out.println(1);
    }
}

class B extends A{
    public B(){
        System.out.println("B的无参数构造执行");//2
        System.out.println(2);
    }
    public B(String name){
        System.out.println("B类的有参数构造执行(String)");//3
        System.out.println(3);
    }
}

class C extends B{
    public C(){ //Recursive constructor invocation
        this("zhangsan");
        System.out.println("C的无参数构造执行");//4
        System.out.println(4);
    }

    public C(String name){
        this(name,20);
        System.out.println("C的有参数构造执行(String)");//5
        System.out.println(5);
    }
    public C(String name,int age){
        super(name);
        System.out.println("C的有参数构造执行(String,int)");//6
        System.out.println(6);
    }
}
