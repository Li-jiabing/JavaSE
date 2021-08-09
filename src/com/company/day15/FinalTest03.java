package com.company.day15;

/**
 * final修饰的实例变量呢？
 *      重点：final修饰的变量只能赋值一次，这句话到哪里都好使
 *
 *      你是否还记得：实例变量如果没有手动赋值的话，系统会赋默认值。
 *
 *      结论：final修饰的实例变量，系统不管赋默认值，要求程序员必须手动赋值
 *
 *      java程序设计：不背锅！！！甩锅甩的很好
 *
 *      实例方法在什么时候赋值（初始化）？
 *          构造方法执行的过程中赋值（new的时候赋值）
 *
 */
public class FinalTest03 {
    public static void main(String[] args) {
        //创建对象必须调用无参数构造方法吗
    }

}

class User{
    //实例变量   会报错
    //实例变量会赋默认值int类型的0，那么这句代码就没意义了，因为被final修饰的变量不能更改
//    final int age;

    final double height = 1.8;//手动赋值可以


    //构造方法在执行过程中赋值，也就是new对象的时候，但是下面代码并没有new对象，所以还没赋值
    final double weight;

    //构造方法
    public User(){
        this.weight = 120;//只要我赶在系统赋默认值之前赋值就行
    }
}