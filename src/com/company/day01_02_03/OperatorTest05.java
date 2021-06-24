package com.company.day01_02_03;

/**
 * 关于java中的"+"运算符
 *     1.
 *      * 加法运算  求和
 *      * 字符串的连接运算
 *     2.当"+"运算符两边的数据都是数字的话，一定是进行加法运算
 *     3.当"+"运算符两边的数据只要有一个数据是字符串，一定会进行字符串运算。并且，连接运算之后的结果还是一个字符串类型
 *
 *     数字+数字-------->数字【求和】
 *     数字+"数字" ----->字符串【字符串连接】
 *
 *     4.在一个表达式中可以出现多个+号，在没有添加小括号的前提之下，遵循自左向右的顺序依次运算。
 *
 *
 */
public class OperatorTest05 {

    public static void main(String[] args) {

        int a = 20;
        int b = 20;

        //要求在控制台上动态输出"10+20=30"
        System.out.println("\""+a+"+"+b+"="+(a+b)+"\"");

        //应用类型String
        //String是sun在javase中提供的字符串类型
        //String.class字节码文件
        //int 是基本数据类型，i是变量名，10是int类型的字面值
        int i = 10;
        //String是引用数据类型，s是变量名，abc是String类型的字面值

        String s = "abc";
        String username = "zhangsan";
        System.out.println("恭喜您，欢迎"+username+"登陆回来！");
    }
}
