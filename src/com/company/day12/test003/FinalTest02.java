package com.company.day12.test003;

public class FinalTest02 {

    //成员变量之实例变量
//    实例变量有默认值+final修饰的变量一旦赋值不能重新赋值
//    综合考虑，java语言最终规定实例变量使用final修饰之后，必须手动复制，不能采用系统默认值
//    final int age;//编译错误

    //第一种解决方案
    final int age = 10;

    //第二种解决方案
    final int num;

    public FinalTest02(){
        this.num = 20;
    }

    //以上两种解决方案本质上就是一种方式，都是在构造方法执行过程当中给实例变量赋值。

    public static void main(String[] args) {
        final int a;
        a = 100;
//        a = 20;
        System.out.println(a);
    }
}
