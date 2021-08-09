package com.company;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
//        System.out.println("    "+"*"+"    ");
//        System.out.println("   "+"***"+"   ");
//        System.out.println("*********");
//        System.out.println("*********");
//        System.out.println("*********");

        /**
         *      5 4 3 2 1
         *      4 3 2 1
         *      3 2 1
         *      2 1
         *      1
         */
//        for (int i = 5; i > 0 ; i--) {
//            System.out.print("*"+"\t");
//            for (int j = i-1; j > 0 ; j--) {
//                System.out.print("*"+"\t");
//            }
//            System.out.println("\n");
//        }
        /**
         *     *
         *    ***
         *   *****
         *  *******
         */

//        for (int i = 1;i < 12;i++){
//            for (int j = 1; j < i+1; j++) {
//                if (i%2 != 0)
//                System.out.print("*");
//            }
//            System.out.println("\n");
//        }
//        System.out.println(100%1);


        //创建A对象
        A a = new A(100);
        //创建B对象
        B b = new B(a);
        //开始猜测
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要猜测的数字：");
        while (true) {
            int caiCeNum = scanner.nextInt();
            b.cai(caiCeNum);
        }
    }
}

class A{
    private int V;

    public A() {
    }

    public A(int v) {
        this.V = v;
    }

    public int getV() {
        return V;
    }

    public void setV(int v) {
        this.V = v;
    }
}
class B{
    //把a作为b的实例变量
    private A a;

    public B() {
    }

    public B(A a) {
        this.a = a;
    }

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }

    //猜测的方法
    public void cai(int caiCeNum){
        //实际数字
        int shiJiZhi = this.getA().getV();
        if (caiCeNum == shiJiZhi){
            System.out.println("猜对了");
            //终止程序的执行
            //退出JVM
            System.exit(0);
        }else if (shiJiZhi > caiCeNum){
            System.out.println("猜小了");
        }else {
            System.out.println("猜大了");
        }
    }
}