package com.company.day17;


/**
 *   接口和接口之间支持多继承，那么一个类可以同时实现多个接口吗？
 *      对于计算机来说，一个机箱上有多个接口，一个接口是接键盘的，一个接口是接鼠标的，一个接口是接显示器的...
 *
 *      重点：一个类可以同时实现多个接口。
 *      这种机制弥补了java中的哪个缺陷？
 *          java中类和类只支持单继承，实际上单继承是为了简单而出现的，现实世界中存在多继承，java中的接口弥补了单继承带来的缺陷
 *
 *          之前有一个结论：
 *              无论向上转型还是向下转型，两种类型之间必须要有继承关系，
 *              没有继承关系编译器会报错。（这句话不适用在接口方面）
 *              最终实际上和之前还是一样，需要家：instanceof运算符进行判断。
 *              向下转型养成好习惯，转型之前先if+instanceof进行判断
 */
public class Test03 {
    public static void main(String[] args) {
        //多态应该怎么用
        A1 a = new D();
        B1 b = new D();
        C1 c = new D();
//        a.m2();

        B1 b1 = (B1) a;
        ((B1) a).m2();

        M m = new E();
        //经过测试，接口和接口之间在进行强制类型转换的时候，没有继承关系，也可以强转。
        //但是一定要注意，运行时可能会出现ClassCastException异常。
//        K k = (K) m;
        if (m instanceof K){//这样就不会报错了
            K k = (K) m;
        }
    }
}

interface K{

}

interface M{

}

class E implements M{

}

//----------------------------------------------
interface X{

}
interface Y{

}
//----------------------------------------------

//接口和接口支持多继承
interface Z extends X,Y{

}

interface A1{
    void m1();
}

interface B1{
    void m2();
}

interface C1{
    void m3();
}

//实现多个接口，其实就类似于多继承
class D implements A1,B1,C1{

    //实现A接口中的m1()
    @Override
    public void m1() {

    }
    //实现B接口中的m2()
    @Override
    public void m2() {
        System.out.println("m2!!!!!!!!!!");
    }
    //实现C接口中的m3()
    @Override
    public void m3() {

    }
}