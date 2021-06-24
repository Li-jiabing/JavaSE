package com.company.day01_02_03;

/**
 * 关于java语言当中的char类型
 *      转义字符 \
 */
public class DataTypeTest03 {
    public static void main(String[] args) {

        //普通的n字符
        char c1= 'n';
        System.out.println(c1);

        //依照目前所学只是，以下程序无法编译通过，因为显然是一个字符串，不能使用单引号括起来
        //但是经过编译，发现编译通过了，这说明以下并不是一个字符串，而是一个字符
        //这事一个"换行符"，属于char类型的数据
        //反斜杠在java语言当中具有转义功能
        char c2 = '\n';
        System.out.println(c2);
        System.out.println("-----------");

        System.out.print("Hello");
        System.out.println(c2);
        System.out.println("World！");

        char x = 't';
        System.out.print(x);

        //  '\t'是制表符，相当于tab
        //虽然制表符和空格看上去一样，但是他们在ASCII码对应的值不一样
        char y = '\t';
        System.out.print(y);
        System.out.print(c1);
        System.out.println("---------");

        /*
        第一个反斜杠具有转义功能，将后面的反斜杠转义为普通的反斜杠字符
        结论：在java中两个反斜杠代表一个普通的反斜杠字符
         */
        char k = '\\';
        System.out.println(k);

        //反斜杠具有转义共呢个，讲第二个单引号转换城普通的单引号字符
        //第一个单引号和最后单引号配对儿
        char a = '\'';
        System.out.println(a);

        char f = '"';
        System.out.println(f);

//        \n    换行符
//        \t    制表符
//        \'    普通的单引号
//        \\    普通的反斜杠
//        \"    普通的双引号
        System.out.println('"'+"HelloWorld!"+'"');
        System.out.println("\"HelloWorld!\"");

        //jdk中自带的native2acsii命令，可以把中文转换成unicode编码形式
        char m = '中';
        System.out.println(m);

        char n = '\u4e2d';  //中国的中对应的unicode编码是4e2d     /u代表的是这个十六进制使用的是unicode编码
        System.out.println(n);

        char b = '\u0000';
        System.err.println(b);

        /**
         * 十进制   0,1,2,3,4,5,6,7,8,9,10...
         * 二进制   0,1,10,11,100
         * 十六进制：0，1，2，3，4，5，6，7，8，9，a,b,c,d,e,f,10,11,12,13,14,15,16,17,18,19,1a,1b,1c,1d,1e,1f,20
         * 八进制：  0，1，2，3，4，5，6，7，10，11，12，13，14，15，16，17，20，21...
         */



    }
}
