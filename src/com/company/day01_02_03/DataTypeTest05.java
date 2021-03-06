package com.company.day01_02_03;

/**
 * 关于java中的整数型
 * byte
 * short
 * int
 * long
 */
public class DataTypeTest05 {
    public static void main(String[] args){

        //100L是long类型字面值
        //x是long类型变量
        //不存在类型转换，直接赋值
        long x = 100L;

        //x类型是long类型，8个字节
        //y变量是int类型，4个字节
        //大容量转换成小容量，需要进行强制类型转换符
        //加上强制类型转换符之后编译通过了，但是运行阶段可能损失精度
        //所以强制类型转换谨慎使用，因为损失精度之后可能损失很严重
        //强转原理：
//            原始数据 ：00000000 00000000 00000000 00000000 00000000 00000000 00000000 01100100
//      强制转换之后数据： 00000000 00000000 00000000 01100100
        //将左边的二进制砍掉[所有的数据强转的时候都是这样完成的]
        int y = (int)x;
        System.out.println(y);


//            原始数据 ：00000000 00000000 00000000 00000000 10000000 00000000 00000000 00000000
//      强制转换之后数据： 10000000 00000000 00000000 00000000 //补码形式
//        10000000 00000000 00000000 00000000目前存储在计算机内部，计算机存储数据都是采用补码的形式存储
//        所以10000000 00000000 00000000 00000000是一个补码的形式
//        将以上的补码转换到源码就是最终的结果
        long k = 2147483648L;
        int e = (int)k;
        System.err.println(e);//损失精度严重，结果是负数 //-2147483648

//      分析以下程序是否可以编译通过？
//      依据目前所学内容，以下程序是无法编译通过的
//      理由：50是int类型的字面值，b是byte类型的变量，显然是大容量int转换成小容量byte
//      大容量转换成小容量是需要添加强制类型转换符的，以下程序没有添加强转符号，所以编译报错
//      但是，在实际编译的时候，以下代码编译通过了。这说明：在java语言当中，当一个整数型字面值没有超出byte类型取之范围的话，
//      该字面值可以直接赋值给byte类型的变量

        byte b = 50;    //可以
        byte d = 127;   //可以

//        sun公司允许不超范围的值赋值给byte类型
//        byte e = 128;   报错，128超过了byte类型的取值类型，所以报错

        //纠正错误，需要使用强制类型转换符
//        但是一定会损失精度
//        原始数据：00000000 00000000 00000000 10000000
//        强转之后：10000000【这事存储在计算机内部的，这是一个补码，他的源码是什么】
        System.out.println(b);// 源码是  -128

//        -5的补码
//        00000000 00000000 00000000 00000101
//        11111111 11111111 11111111 11111011

//        补码是：10000000
//        源码是：-128

        /**
         *         计算机二进制有三种表示形式：
         *              源码：
         *              补码：
         *              反码：
         *         计算机在任何情况下底层表示和存储数据的时候采用了补码形式。
         *         正数的补码：和源码相同
         *         负数的补码：负数的绝对值对应的二进制码所有二进制位取反，再加1
         *
         *         补码：10000000
         *         源码计算过程
         *              *10000000 - 1 ------->01111111
         *              *去反：又变成了10000000 ——----->128
         *              *     -128
         */

        //原始数据：00000000 00000000 00000000 11000110
        //强制类型转换之后：11000110
        //11000110现在在计算机中存储，他是一个补码，将源码换成源码就是该数字
        //11000110 -1 --->  11000101
        //去反：00111010 【2+8+16+32= 58】
//      1开头表示负数，结果为  -58
        byte m = (byte)198;
        System.err.println(m);

        //原始数据：00000000 00000000 00000000 11101011
        //强制类型转换之后：11101011
        //11101011 -1 ----->  11101010
        //去反：00010101【1+4+16 = 21】
        //1开头，负数，结果为-21
        byte n = (byte)235;
        System.err.println(n);


//        short  s = 32767;    编译通过
//        short  s1 = 32768;    编译报错  结论：如果赋值没有超过short的取之范围，可以直接赋值给short


//        char a = 65535; //通过
//        char c = 65536;  //编译报错

        /**
         * 综上所述，结论：当一个整数字面值没有超出byte，short，char的取之范围，这个字面值可以直接赋值给bute，short，char类型的变量，
         * 这种机制sun允许了，目的是为了方便程序员编程
         */
    }
}
