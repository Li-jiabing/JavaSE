package com.company.day18;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        //为什么要这么写？
        //Test03类和Scanner类不再同一个包下
        //java.util就是Scanner类的包名
        Scanner scanner = new Scanner(System.in);
        java.util.Scanner scanner1 = new Scanner(System.in);
        String str = scanner.next();
        System.out.println("您输入的字符串是："+str);
    }
}
