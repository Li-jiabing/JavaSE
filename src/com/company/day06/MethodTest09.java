package com.company.day06;

/**
 * 深入return；语句
 *      *带有return关键字的java语句只要执行，所在的方法执行结束
 *      *在同一个作用域中，return语句下面不能编写任何代码，因为这些代码永远都执行不到，许哦咦编译报错
 */
public class MethodTest09 {
    public static void main(String[] args) {
        System.out.println(m());
    }

    //编译不通过，因为编译器只检查语法，a>3可能为true和false，a>3为false的话不能执行return 1；所以报错
//    public static int m(){
//        int a = 10;
//        if(a>3){
//            return 1;
//        }
//    }

    //可以运行
    public static int m(){
        int a = 10;
        if(a>3){
            return 1;
//  System.out.println("hello");   这里的代码编译过不去，因为在return后面的语句不能运行
 }
        //这里的代码可以运行
        System.out.println("hello");
        return 2;
//        编译错误，错误原因和上面一样
//      System.out.println("hello");
    }

    //三元运算符，简化上面的写法
    public static int m1(){
        return 10>3 ? 1:0;
    }
}
