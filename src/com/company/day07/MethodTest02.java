package com.company.day07;

/**
 * 分析一下程序的输出结果【画图分析】
 */
public class MethodTest02 {
    public static void main(String[] args) {
        int i = 10;
        method(i);
        System.out.println("main-->"+i);
    }

    private static void method(int i) {
        i++;
        System.out.println("method-->"+i);
    }
}
