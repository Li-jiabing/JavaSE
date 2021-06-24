package com.company.day05;

/**
 * 编写for循环找出1-100中所有的素数
 * 素数：又被称为质数，能够被1和自身整除，不能被其他数字整除的数字称为素数
 * 曾称质数。一个大于1的正整数，如果除了1和它本身以外，不能被其他正整数整除，就叫素数。如2，3，5，7，11，13，17…。
 */
public class ForTest10 {
    public static void main(String[] args) {
        /**
         *   2,3,5,7,11,13,17.....
         */

//        for (int i = 2; i <=100 ; i++) {
//            int j = 2;
//            while(i%j != 0){
//                j++;
//            }
//            if (i==j){
//                System.out.println(i);
//            }
//        }

        System.out.println("-------------------------------------------");

        /**
         * 升级版
         *  编写for循环找出1-10000中所有的素数
         *  要求每8个换一行输出
         */

        for (int i = 2; i <=10000 ; i++) {
            int count = 0;
            int j = 2;
            while(i%j != 0){
                j++;
            }
            if (i==j){
                System.out.print(i);
                if (count <= 8){
                    count++;
                    System.out.print("\n");
                }
            }
        }
    }
}
