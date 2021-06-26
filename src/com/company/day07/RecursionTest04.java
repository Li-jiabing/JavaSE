package com.company.day07;

/**
 *   先不使用递归，计算N的阶乘
 *   5的阶乘：
 *      5*4*3*2*1
 */
public class RecursionTest04 {
    public static void main(String[] args) {
        int n = 5;
        int retValue = method(n);
        System.out.println(retValue);
    }

    private static int method(int n) {
//        int result = 1;
//        for (int i = n; i > 0; i--) {
//            result *= i;
//        }
//        return result;
//    }

        //递归方式
        if(n == 1){
            return 1;
        }
        return n*method(n-1);
    }
}
