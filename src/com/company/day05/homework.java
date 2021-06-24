package com.company.day05;

/**
 * 编写for循环找出1-100内的素数
 * 素数，又被称为质数，n能够被1和他自身整除，不能被其他数字整除的数称为素数
 */
public class homework {
    public static void main(String[] args) {

        //先编写程序，验证7这个数是否为素数
        /**
         *      实现思路：
         *          7/2
         *          7/3
         *          7/4
         *          7/5
         *          7/6
         */
        for (int i = 100; i >= 2; i--) {
            //默认将i看作一个素数  这叫标记，标记在开发中比较常用
            boolean isPrime = true;
            for (int j = 2; j <= 100; j++) {
                if (i % j == 0 && i/j != 1) {
                    isPrime = false;
                    //非素数
                    break;
                }
            }
            System.out.println(isPrime ? i + "是素数" : i + "不是素数");
        }

        /**
         * 升级版[加入统计机制] 且每8个换一行
         */
        int count = 0;
        for (int i = 100; i >= 2; i--) {
            //默认将i看作一个素数  这叫标记，标记在开发中比较常用
            boolean isPrime = true;
            for (int j = 2; j <= 100; j++) {
                if (i % j == 0 && i/j != 1) {
                    isPrime = false;
                    //非素数
                    break;
                }
            }
            if (isPrime){
                System.out.print(i+" ");
                count++;
                if (count%8 == 0){
                    System.out.println();
                }
            }
        }
    }
}
