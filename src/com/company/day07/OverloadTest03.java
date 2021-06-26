package com.company.day07;

/**
 * 方法重载：
 *      1.方法重载又被称为：overload
 *
 *      2.什么时候考虑使用方法重载
 *          * 功能相似的时候，尽可能让方法名相同
 *          【但是功能不同的时候，尽可能让方法名不同】
 *
 *      3.什么条件满足之后构成了方法重载
 *          * 在同一个类中
 *          * 方法名相同
 *          * 参数列表不同：
 *              -数量不同
 *              -顺序不同
 *              -类型不同
 *
 *      4.方法重载和什么有关系，和什么没有关系
 *          * 方法重载和方法名+参数列表有关系
 *          * 方法重载和返回值类型无关
 *          * 方法重载和修饰符列表无关
 *
 *        ***  记住:方法重载只与方法名与参数列表有关
 */
public class OverloadTest03 {
    public static void main(String[] args) {

    }

    //以下两个方法构成重载
    public static void m1(){
    }
    public static void m1(int a){
    }

    //以下两个方法构成重载
    public static void m2(int a,double b){
    }
    public static void m2(double a,double b){
    }

    //以下两个方法构成重载
    public static void m3(int x){
    }
    public static void m3(double y){
    }

//    以下方法不够成方法重写，这叫方法重复，编译器只会找上面的代码
//    public static void m4(int a,int b){}
//    public static void m4(int b,int a){}

    //报错，编译不通过
//    public static void x(){
//    }
//    public static int x(){
//        return 1;
//    }

    //报错，编译不通过
//    void y(){};
//    public static void y(){
//
//    }
}
