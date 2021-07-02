package com.company.day09.test003.ConstructorTest01;

/**
 * 构造方法的另一个作用：
 *      1、创建对象
 *      2、创建对象的同时，初始化实例变量的内存空间。
 *
 * 成员变量之实例变量，属于对象级别的变量，这种变量必须先有对象才能有实例变量。
 * 实例变量没有手动赋值的时候，系统赋默认值，那么这个系统默认赋值实在什么时候完成的呢？
 *        是在类加载的时候吗？
 *              不是，因为类加载的时候只加载了代码片段，还没来的及创建对象，所以此时实例变量并没有做初始化。
 *
 *        实际上，实例变量的内存空间是在构造方法执行过程中完成开辟的，完成初始化的，
 *        系统在默认赋值的时候，也是在构造方法执行过程当中完成的赋值
 *
 * 实例变量默认值：
 * byte、short、int、long  0
 * float、double          0.0
 * boolean                false
 * 引用数据类型             null
 *
 * 实例变量是存储在JVM的堆内存，
 */
public class ConstructorTest02 {
    public static void main(String[] args) {

        //创建对象
        Account account = new Account();

        System.out.println("银行账号："+account.getActno());
        System.out.println("账户余额："+account.getBalance());
    }
}
