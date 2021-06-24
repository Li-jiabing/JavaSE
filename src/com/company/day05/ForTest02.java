package com.company.day05;

/**
 *    i变量的作用域
 */
public class ForTest02 {

    public static void main(String[] args) {

        //以下的for循环中i变量的作用域仅限于是当前for循环内部使用，当循环结束，内存释放了，下面for循环中还能使用i
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

//        但是这个i变量没有在main方法中定义赋值，所以不能在这里使用
//        System.out.println(i);

        //这里定义了i的全局变量，所以下面可以访问这个i
        int i= 0;
        for (;i<10;i++){
            System.out.println(i);//9
        }
        System.out.println(i);//10
    }
}
