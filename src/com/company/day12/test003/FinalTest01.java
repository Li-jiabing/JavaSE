package com.company.day12.test003;


/**
 * 关于java语言中的final关键字
 *      1.final是一个关键字，表示最终的，不可变的
 *      2.final修饰的类无法被继承
 *      3.final修饰的方法无法被覆盖
 *      4.final修饰的变量一旦赋值之后，不可重新赋值
 *      5.final修饰的实例变量，必须手动赋值，不能采用系统默认值
 *      6.final修饰的引用
 *
 * 以后尽量所有的程序都连接源码，没有源码从网上找，养成看源代码的好习惯
 *
 * 对于以后大家所学习的类库，一般都是包括三个部分的：
 *      - 源码【可以看源码来理解程序】
 *      - 字节码【程序开发的过程中使用的就是这部分
 *      -帮助文档【对源码的解说说明被提取出来，更方便程序的开发】
 */
public class FinalTest01 {
    public static void main(String[] args) {
//        String newString = "abcdefghijk".replace("a","x");
//        System.out.println(newString);

    }
}
//class MyString extends String{
//    Cannot inherit from final 'java.lang.String'
//}
