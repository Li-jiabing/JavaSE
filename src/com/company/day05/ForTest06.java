package com.company.day05;

/**
 * for循环嵌套for循环
 */
public class ForTest06 {
    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {//共循环10次
            System.out.println("i--->"+i);
            for (int j = 0; j < 3; j++) {
                System.out.println("j--->"+j);
            }
            //循环体中可以编写其他的控制语句
            //控制语句可以嵌套使用
            //控制语句可以是：if,if...else,switch,for,while,do...while
//            if(){
//                for (){
//                    while(){
//
//                    }
//                }
//            }

//    }
//        for (int i=0;i<10;i++){
//            System.out.println("i----------"+i);
//            for (int j = 0; j < 3; j++) {
//                System.out.println("j----------"+j);
//                for (int k = 0; k < 3; k++) {
//                    System.out.println("k----------"+k);
//                }
//            }
        }
    }
}