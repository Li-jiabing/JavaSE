package com.company.day05;

public class ForTest03 {
    public static void main(String[] args) {
        for (int i=1;i<=10;i+=2){
            System.out.println(i);//1 3 5 7 9
        }

        for (int i = 0; i<= 10; i+=2) {
            System.out.println(i);//2,4,6,8,10;
        }

        for (int i=10;i>0;i--){
            System.out.println(i);//降序输出  10,9,8,7,6,5,4,3,2,1
        }

        for (int i = 0; i < 10; ) {
            System.out.println(i);
            i++;
        }

        for (int i = 1; i < 1000000000; i++) {
            i*=i;
            System.err.println(i);
        }
    }
}
