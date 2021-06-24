package com.company.day04;

import java.util.Scanner;

/**
 * 需求：
 * 判断当前的天气
 * 当外面下雨的时候：       带雨伞        当性别为男，但一把大黑伞，性别为女，带小花伞
 * 当外面是晴天的时候：      判断天气的温度  当温度在30度以上，当性别为男：戴墨镜，性别为女：擦防晒
 */
public class IfTest03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入现在天气");
        String weather = scanner.next();
        if (weather.equals("下雨") || weather.equals("晴天")) {
            if (weather.equals("下雨")) {
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("请输入您的性别");
                String sex = scanner1.next();
                if (sex.equals("男") || sex.equals("女")) {
                    if (sex.equals("男")) {
                        System.out.println("带一把大黑伞");
                    } else {
                        System.out.println("带一把小花伞");
                    }
                } else {
                    System.out.println("对不起，您输入的性别有误");
                }
            } else if (weather.equals("晴天")) {
                Scanner scanner2 = new Scanner(System.in);
                System.out.println("请输入天气温度");
                double temperature = scanner2.nextInt();
                if (temperature > 30) {
                    Scanner scanner4 = new Scanner(System.in);
                    System.out.println("请输入您的性别");
                    String sex = scanner4.next();
                    if (sex.equals("男") || sex.equals("女")) {
                        if (sex.equals("男")) {
                            System.out.println("带墨镜");
                        } else {
                            System.out.println("擦防晒");
                        }
                    } else {
                        System.out.println("对不起，您输入的性别有误");
                    }
                } else {
                    System.out.println("小问题，不是特别热");
                }
            }
        } else {
            System.out.println("对不起，您输入的天气有误");
        }
    }
}
