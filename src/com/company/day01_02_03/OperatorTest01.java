package com.company.day01_02_03;

/**
 * 关于java编程中运算符之：算数运算符
 *      +           加
 *      -           减
 *      *           乘
 *      /           除
 *      %           取模
 *      ++          自加1
 *      --          自减1
 *
 *      注意：一个表达式中有多个运算符，运算符有优先级，不确定的加小括号，优先级得到提升
 */
public class OperatorTest01 {

    public static void main(String[] args) {
        int i = 10;
        int j = 3;
        System.out.println(i+j);//13
        System.out.println(i-j);//7
        System.out.println(i*j);//30
        System.out.println(i/j);//3
        System.out.println(i%j);//1

        //以下以++为例，--自学
        //关于++运算符【自加1】
        int k = 10;
        //++运算符可以出现在变量后面【单目运算符】
        k++;
        System.out.println(k);

        int y = 10;
        //++运算副可以出现在变量前面[单目运算符]
        ++y;
        System.out.println(y);//11

        /**
         * 小结：++运算符可以出现在变量前，也可以出现在变量后，无论是变量前还是变量后，只要++运算结束，该变量中的值一定会自加1
         */

        //++出现在变量后
        int a = 100;
        int b = a++;//++出现在变量后面，先赋值再运算
        System.out.println(a);//101
        System.out.println(b);//100

        //++出现在变量前
        //规则：先进行自加1运算，然后再进行赋值操作
        int c = 100;
        System.err.println(c);
        int d = ++c;
        System.err.println(c);//101
        System.err.println(d);//101

        int xx = 500;
        System.out.println(xx++);//500
        System.out.println(xx);//501

        int s = 100;
        System.out.println(++s);//101
        System.out.println(s);//101

    }
}
