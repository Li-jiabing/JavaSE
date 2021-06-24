package com.company.day01_02_03;

import java.sql.SQLOutput;

/**
 * 关于java中的赋值类运算符：
 *      赋值类运算符包括两种：
 *          *基本的赋值运算符
 *              =
 *          *扩展的赋值运算符
 *              +=
 *              -=
 *              *=
 *              /=
 *              %=
 *
 *       1.赋值类的运算符优先级，先执行等号右边的表达式，将执行结果赋值给左边的变量
 *       2.注意以下代码：
 *          byte i =  10；
 *          i += 5;等同于 i = (byte)（i+5）；
 *
 *          int k = 10;
 *          k += 5,等同于：k = （int）(k+5)
 *
 *          long x = 10L;
 *          int y = 20;
 *          y += x;等同于 y = (int)(y+x)
 *
 *       3.重要结论：扩展类的赋值运算符不改变运算结果类型，假设最初这个变量的类型是byte类型，无论怎么
 *       进行追加或者追减，最终该变量的数据类型还是byte类型。
 */
public class OperatorTest04 {

    public static void main(String[] args) {

        //基本的赋值运算符
        int i = 10;
        System.out.println(i);//10
        i = i+5;
        System.out.println(i);//15

        //扩展的赋值运算符【+=运算符可以翻译为追加/累加】
        i += 5;//等同于i = i +5
        System.out.println(i);//20

        i -= 5;
        System.out.println(i);

        i *= 2;//i = i*2
        System.out.println(i);//30

        i /= 3;//i = i / 3
        System.out.println(i);//10

        i %= 3;//i = i % 3
        System.out.println(i);//1


        //--------------------------------------------
        byte b = 10;
        b = 15;

        //编译错误
        //编译器只检查语法，不运行程序，编译器发现b+5的类型是int类型，b变量的数据类型是byte
        //大容量向小容量转换需要加强制类型转换符，所以程序编译报错
//        b = b+5;
        b = (byte)(b+5);
        System.out.println(b);//15

        b += 5;

        byte x = 10;
        x += 5;//等同于x = （byte）（x+5）; 严格意义上来说，并不等同与 x = x+5;
        System.out.println(x);//15

        byte z = 0;
        z += 128;//等同于z = (byte)(x+128);
        System.err.println(z);//-128

        z+=10000;//等同于：z = (byte)(z+10000)
        System.err.println(z);//-112   可以编译通过，损失精度

        int sum = 0;
        for (int j = 1;j<=100;j++){
            j += 0;
            sum += j;
        }
        System.out.println(sum);
    }


}
