package com.company.day06;

/**
 *     方法的返回值类型不是void的时候,要求方法必须保证百分百的执行"return 值；"这昂的语句来完成值的返回
 *     没有这个语句编译就会报错
 *
 *     一个方法有返回值的时候，当我们调用这个方法的时候，方法返回了一个值，对于调用者来说，我们可以选择接收也可以选择不接收
 *     但是大部分情况下我们都是选择接收的
 */
public class MethodTest08 {
    public static void main(String[] args) {

        /**
         * 需求：
         *      请定义并实现一个方法，该方法可以计算两int类型数据的商
         *      要求将最终的计算结果返回给调用者
         */
        divide(10,3);  //可以选择不接收，不输出
        System.out.println(divide(10, 5));
    }

    public static int divide(int a,int b){
        return a/b;
    }
}
