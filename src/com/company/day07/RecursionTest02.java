package com.company.day07;

/**
 * 不使用递归，计算1-n的求和
 */
public class RecursionTest02 {
    public static void main(String[] args) {

//        //1-4的和
//        int n = 4;
//        int sum = 0;
//        for (int i=1;i<=4;i++){
//            sum+=i;
//        }
//        System.out.println(sum);

        int n = 4;
        int retValue = sum(n);
        System.out.println(retValue);

        n = 10;
        int retValue1 = sum(n);
        System.out.println(retValue1);
    }

    public static int sum(int n){
        int result = 0;
        for (int i = 0; i <= n; i++) {
            result+=i;
        }
        return result;
    }
}
