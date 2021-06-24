package com.company.day05;

import com.sun.codemodel.internal.JCase;

import java.util.Scanner;

/**
 * Switch在英语里面表示开关/切换的意思
 *      1.Switch语句也属于选择结构，也是分支语句
 *      2.switch语句的语法结构：
 *          一个比较完整的switch语句应该这样编写：
 *      switch(int ｜｜ String){
 *          case：
 *              java语句；
 *              break；   //break 终止程序
 *          case:
 *              java语句
 *              break；
 *          default:     //如果上面的case语句都不执行，最终会执行default语句
 *              java语句;
 *           ***如果break不写，会执行每一条没写break的程序，最后会形成break穿透
 *}
 *
 *      3.switch语句的执行原理：
 *      switch后面小括号当中的数据和"case后面的"数据进行一一匹配，匹配成功的分支执行
 *      按照自上而下的顺序依次匹配
 *
 *      4.匹配成功的分支执行，分支当中最后有break语句的话，整个switch语句终止
 *
 *      5.匹配成功的分支执行，分支当中没有break语句的话，直接进入下一个分支执行（不进行匹配），这种现象被称为case穿透现象，[提供break语句可以避免穿透]
 *
 *      6.所有分支都没有匹配成功，当有default语句的时候，会执行default分支当中的程序
 *
 *      7.switch和case后面只能是int或者String类型的数据，不能是其他类型
 *      *当然，byte，short，char也可以直接写到switch和case后面，因为他们可以进行自动类型转换，byte，short，char可以自动转换成int类型
 *      *jdk6的话，switch和case后面只能探测int类型，jdk7和7之后，引入新特性，后面可以探测String类型的数据
 *
 *      8.case可以合并：
 *          int i = 10;
 *          switch(i){
 *              case 1 :case 2:case 3：case 10：
 *              System.out.println("TestCode");
 *          }
 */
public class SwitchTest01 {
    public static void main(String[] args) {
        /*
        long a = 10L;
        int b = a;//编译报错
         */

        /*
        long x = 100L;
        switch(x){}//编译报错
         */

        long x = 100L;
        switch ((int)x){//强转成int类型

        }

        byte b = 10;
        switch (b){}

        short s = 10;
        switch (s){}

        char c = 'A';
        switch (c){}

        char cc = 97;
        switch (cc){}

//        编译报错
//        switch (true){}

        String username = "zhangsan";
        switch (username){}

        /**
         *      较完整的switch语句
         */
        //接收用户输入：1 表示星期一
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入今天星期几，1代表星期一，2代表星期二，依次类推，7代表星期天");
        int date = scanner.nextInt();
        switch (date){
            case 1:
                System.out.println("今天吃kfc");
                break;//不写break会造成case穿透，也就是输入1会输出没有写break的所有结果
            case 2:
                System.out.println("今天吃金拱门");
                break;
            case 3:
                System.out.println("今天吃馄饨");
                break;
            case 4:
                System.out.println("今天吃火锅");
                break;
            case 5:
                System.out.println("今天吃炒饭");
                break;
            case 6:
                System.out.println("今天吃海底捞");
                break;
            case 7:
                System.out.println("今天吃烧烤");
                break;
            default:
                System.out.println("您输入的日期有误");
        }

        //case合并
        switch (date){
            case 1: case 0:   //用户输入符合这里所写的case，则都会运行这条case的输出语句
                System.out.println("今天吃kfc");
                break;//不写break会造成case穿透，也就是输入1会输出没有写break的所有结果
            case 2:
                System.out.println("今天吃金拱门");
                break;
            case 3:
                System.out.println("今天吃馄饨");
                break;
            case 4:
                System.out.println("今天吃火锅");
                break;
            case 5:
                System.out.println("今天吃炒饭");
                break;
            case 6:
                System.out.println("今天吃海底捞");
                break;
            case 7:
                System.out.println("今天吃烧烤");
                break;
            default:
                System.out.println("您输入的日期有误");
        }
    }
}
