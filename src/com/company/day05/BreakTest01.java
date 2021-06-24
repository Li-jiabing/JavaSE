package com.company.day05;

import com.company.day06.MethodTest05;

/**
 * 关于java控制语句当中的break语句：
 *  1.break是jaav语句当中的关键字，被翻译为"中断"
 *  2.break+";"可以称为一个单独的完成的java语句:break;
 *  3.break语句使用在switch语句中，用来终止switch的语句执行
 *  4.break语句同样可以使用在循环语句当中，用来终止循环的执行。
 *  5.break终止哪个循环呢？
 *  6.break语句使用在for while do while循环语句中用来跳出循环，终止循环的执行。因为当程序循环到某个条件的时候，后续的循环没必要执行了
 *  再执行也是浪费资源，所以终止循环，这样可以提高程序的执行效率
 *  7.默认情况下，break语句终止的是离他最近的循环
 */
public class BreakTest01 {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            if (i == 50){
                break;
            }
            System.out.println(i);
        }
    }
}
