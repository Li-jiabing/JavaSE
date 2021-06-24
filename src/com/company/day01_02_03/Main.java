package com.company.day01_02_03;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//	// write your code here
//        System.out.println("hello world");
//        System.out.println("li jia bing");
//        System.out.println(i);
//    }
//
//    static int i = 10;
//
//    void hello(){
//
//    }
        Scanner scanner = new Scanner(System.in);
        int num = 999;
        int count = 0;
        while(num>0){
            num=num/10;
            count++;
        }
        System.out.println("它是个" + count + "位的数！");
    }
}