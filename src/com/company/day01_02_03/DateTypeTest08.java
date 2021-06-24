package com.company.day01_02_03;

/**   背会！！！
 * 关于基本数据类型之间的互相转换
 *      *转换规则
 *      1.八种基本数据类型中除布尔类型之外剩下的7种数据类型之间都可以互相转换
 *      2.小容量向大容量转换，称为自动类型转换，容量从小到大排序：
 *      byte<short<int<long<float<double<char
 *      注：任何浮点类型不管占用多少个字节，都比整数型容量大
 *          char和short可表示的种类数量相同，但是char可以取更大的正整数
 *
 *      3.大容量转换成小容量，叫做强制类型转换，需要加强制类型转换符，程序才能编译通过，但是在运行阶段可能会损失精度，所以谨慎使用
 *
 *      4.当整数自面值没有超出byte，short，char的取之范围，可以直接赋值给byte，short，char类型的变量
 *
 *      5.byte，short，char混合运算的时候，各自先转成int类型再做运算
 *
 *      6.多种数据类型混合运算，先转成容量大的那种类型再做运算。
 *
 *      注意：
 *          byte b = 3；//可以编译通过，3没有超出byte类型取之范围
 *          int a = 10;
 *          byte b = i/3;//编译报错，因为编译器只检查语法，不会运算i/3；
 */
public class DateTypeTest08 {
    public static void main(String[] args) {
        int b = 10/3;       //3
        double a = 10/3;    //3.0
        a = 10.0/3;         //3.3333333335
        System.out.println(a);

    }
}
