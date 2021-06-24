package com.company.day01_02_03;

/**
 * 关于浮点型数据类型
 *  float   单精度【4字节】
 *  double  双精度【8字节,精度较高】
 *
 *  double精度太低[相对来说]，不适合做财务软件。
 *  财务设计到钱的问题，要求精度较高，所以sun在基础se类库中为程序员准备了精确度更高的类型，只不过这种类型时候一种引用数据类型，不属于基本数据类型，他是：java.math.BigDecimal
 *
 * 其实java程序中sun提供了一套庞大的类库，java程序员是基于这套基础的类库来进行开发的。所以要知道java的se类库的字节码在哪儿，要知道java的se类库的源码在哪
 *      *SE类库字节码：c:\Program Files(x86)\Java\jdk1.7.0_75\jre\lib\rt.jar
 *      *SE类库源码：c:\Program Files(x86)\Java\jdk1.7.0_75\src.zip
 *
 *      例如：String.java和String.class
 *      我们的（String[] args）中的string使用的就是String.class字节码文件
 *      、
 *      在java语言中，所有的浮点型字面值【3.0】，默认被当作double类型来处理，要想该字面值以float类型来处理，需要在字面值后面添加f/F
 *
 *      注意：
 *             double和float在计算机内部二进制存储的时候存储的都是近似值，浮点越长精度越高
 *             在现实世界中，有一些数字是无限循环的，例如：3.33333333333333.....
 *             计算机的资源是有限的，用有限的资源存储无限的数据只能存储近似值
 */
public class DateTypeTest06 {
    public static void main(String[] args) {

        //3.0是double类型的字面值
        //d是double类型的变量
        //不存在类型转换
        double d = 3.0;
        System.out.println(d);

        //5.1是double类型的字面值
        //f是float类型的变量
        //大容量转换成小容量需要加强制类型转换符，所以以下程序编译错误
        //float f = 5.1;

        //解决方案：
        //第一种方式
        float f = (float) 5.1;

        //第二种方式：没有类型转换
        float f1 = 5.1f;

        System.out.println(f);
        System.out.println(f1);

    }
}
