package com.company.day05;

/**
 * while循环语句：
 *      1.while循环的语法结构
 *          while(布尔表达式){
 *              循环体
 *          }
 *      2.while循环的执行原理
 *          先判断布尔表达式的结果：
 *              *true
 *                  -执行循环体
 *                      *判断布尔表达式的执行结果
 *                      ........
 *              *false
 *                  -循环结束
 *      3.while循环的循环次数
 *      0-n次
 *      注意：while循环的循环体可能执行次数为0次
 */
public class WhileTest01 {
    public static void main(String[] args) {

        //死循环
        while(true){
            System.out.println("死循环");
        }

//        死循环
//        int i = 10;
//        int j = 3;
//        while(i>j){
//            System.out.println("hello world");
//        }
    }
}
