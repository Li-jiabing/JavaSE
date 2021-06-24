package com.company.day05;

import java.util.Scanner;

/**
 * 需求：实现计算器当中的
 *      +
 *      -
 *      *
 *      /
 *      %
 *      实现思路：
 *          1.选择所有的数据都从键盘输入
 *          2.使用switch语句进行判断
 *          3.需要从控制台输入三次：
 *              *第一个数字
 *              *运算符
 *              *第三个数字
 */
public class SwitchTest04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int num = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("请输入运算符");
        String Operator = scanner1.next();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("请输入第三个数字");
        int nums = scanner2.nextInt();
        switch (Operator){
            case "+":
                System.out.println(num+nums);
                break;
            case "-":
                System.out.println(num-nums);
                break;
            case "*":
                System.out.println(num*nums);
                break;
            case "/":
                System.out.println(num/nums);
                break;
            case "%":
                System.out.println(num%nums);
                break;
            default:
                System.out.println("对不起，您的输入有误");
        }
    }
}
