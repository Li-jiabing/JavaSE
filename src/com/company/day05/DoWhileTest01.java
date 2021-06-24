package com.company.day05;

/**
 *    do...while循环
 *    1.do...while循环的语法结构：
 *          do{
 *              循环体；
 *          }while(布尔表达式);
 *
 *    2.do...while循环的执行原理
 *
 *    3.do...while循环的执行次数：
 *      1-n次，
 *      do...while循环至少执行一次
 *
 *    4.使用do...while循环的注意事项:
 *      do...while循环语句最终有一个"；"别丢了
 */
public class DoWhileTest01 {
    public static void main(String[] args) {
        int i = 10;
        do {
            System.out.println(i);
            i++;
        }while (i<100);

        int a = 1;
        do{
            System.out.println(a);
            a++;
        }while (a<=10);
    }
}
