package com.company.day07;

/**
 * 用递归完成1-n的和
 *
 *    4+3+2+1
 */
public class RecursionTest03 {
    public static void main(String[] args) {

        //1-4的和
        int n = 4;
        int result = sum(n);
        System.out.println(result);
    }

    public static int sum(int n){
//        int sum = 0;
//        if (n > 0 ) {
//            n--;
//            sum += n + 1  ;       //4  3  2  1
//            sum(n);
//        }
//        sum+=sum;
//        return sum;
        if (n == 1){
            return 1;
        }
        return n + sum(n - 1);
    }
}
