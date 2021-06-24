package com.company.day04;

import java.util.Scanner;

/**
 * 需求：
 *      假定系统给定一个人的年龄，根据年龄来判断这个人处于生命的哪个阶段，年龄必须在0-150
 *      [0 - 5] 幼儿
 *      [6 - 10] 少儿
 *      [11 - 18] 青少年
 *      [19 - 35] 青年
 *      [36 - 55] 中年
 *      [56 - 150] 老年
 */
public class KeyInputTest02 {
    public static void main(String[] args) {

        /**
         * System.out.println();负责向控制台输出【从内存到控制台，输出的过程，这是从内存中出来了】
         * 接收用户键盘舒服，从"键盘" 到"内存"。[输入的过程，到内存中去]
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的年龄：");

        //接收用户输入数字
        int a = scanner.nextInt();

        //接收用户输入文本
//        String s = scanner.next();

        if (a > 0 && a <150){
            if (a > 56){
                System.out.println("您是老年人");
            }else if (a > 36){
                System.out.println("您是中年人");
            }else if (a > 19){
                System.out.println("您是青年");
            }else if(a > 11){
                System.out.println("您是青少年");
            }else if(a > 6){
                System.out.println("您是少儿");
            }else {
                System.out.println("您是幼儿");
            }
        }else {
            System.out.println("您输入的年龄有误！");
        }
    }
}
