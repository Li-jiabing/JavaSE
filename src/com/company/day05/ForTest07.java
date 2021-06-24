package com.company.day05;

/**
 * for循环嵌套
 */
public class ForTest07 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("i--->"+i);
            for (int j = 0; j < 1; j++) {//循环1次，输出0
                System.out.println("j--->"+j);
            }
        }

        for (int i = 0; i <= 5; i++) {          //1 2
            System.out.println("开始");
            for (int j = 1; j <=5 ; j++) {      //1 2 3 4 5
                System.out.println(j*i);
            }
            System.out.println("结束");
        }
        /**
         *      开始
         *      1
         *      2
         *      3
         *      4
         *      5
         *      结束
         *      开始
         *      2
         *      4
         *      6
         *      8
         *      10
         *      结束
         *      开始
         *      3
         *      6
         *      9
         *      12
         *      15
         *      结束
         *      开始
         *      4
         *      8
         *      12
         *      16
         *      20
         *      结束
         *      开始
         *      5
         *      10
         *      15
         *      20
         *      25
         *      结束
         */
    }
}
