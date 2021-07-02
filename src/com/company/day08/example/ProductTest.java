package com.company.day08.example;

/**
 * 每一个类中都可以编写主方法，但是一般情况下
 * 一个系统只有一个入口，所以主方法一般写一个
 */
public class ProductTest{//商品测试类
    //程序入口
    public static void main(String[] args) {

        //创建对象，商品对象
        //product 局部变量
        //product 引用
        //product 变量中保存内存地址指向堆内存中商品对象
        Product product = new Product();

        //访问实例变量语法：引用.变量名
        //读取：引用.变量名
        System.out.println("商品的编号："+product.productNo);
        System.out.println("商品的单价："+product.price);

        //修改  引用.变量名 = 值
        product.productNo = 1;
        product.price = 6788;

        System.out.println("商品的编号："+product.productNo);
        System.out.println("商品的单价："+product.price);
    }
}
