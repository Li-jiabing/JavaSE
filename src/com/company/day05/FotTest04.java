package com.company.day05;

/**
 *  循环语句和条件判断语句嵌套使用[for和if嵌套]
 */
public class FotTest04 {
    public static void main(String[] args) {
        //找出1-1000所有的基数
        for (int i = 1;i<=100;i++){
            if (i%2 !=0){
                System.out.println(i);
            }
        }
    }
}
