package com.company.day01_02_03;

/**
 * 三目运算符
 *    1.语法规则：
 *      布尔表达式：表达式1 ? 表达式2
 *
 *    2。三元运算符的执行原理？
 *      当布尔表达式的结果是true的时候，选择表达式1作为整个表达式的执行结果
 *      当布尔表达式的结果是false的时候，选择表达式2作为整个表达式的执行结果
 */
public class OperatorTest06 {
    public static void main(String[] args) {

        boolean sex = false;
        //分析以下程序是否可以编译通过？
        //编译报错，因为他不是一个完整的java语句
        //sex ? '男' : '女'；

        char c = sex ? '男' : '女';
        System.out.println(c);

//        语法错误，编译错误，结果可能是string类型，也可能是char类型，但是前边不能用char来接收数据
//        类型不兼容
//        char c1 = sex ? "男" : '女';

//        语法问题，结果和真还是假没关系
//        char c2 ;
//        char c2 = sex ? "男" : '女';

        System.out.println(10);
        System.out.println("10");
        System.out.println('2');
        System.out.println(sex ? '男' : "女");
    }
}
