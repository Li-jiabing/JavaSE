package com.company.day05;

/**
 * 在前一个程序的基础上，计算1-100所有的奇数的和
 */
public class FotTest05 {
    public static void main(String[] args) {
//        int sum = 0;
//        for (int i = 1; i < 100; i+=2) {
//            sum+=i;
//        }
//        System.out.println(sum);

        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if(i%2 != 0){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
