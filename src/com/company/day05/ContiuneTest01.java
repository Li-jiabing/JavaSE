package com.company.day05;

/**
 * continue语句：
 *  1.continue表示：继续/go/下一个
 *  2.continue也是一个continue关键字加一个分号构成的完整的java语句，主要出现循环语句中用来控制循环的执行
 *  3.break和continue的区别？
 *      *break表示循环不执行了，跳出循环/终止循环
 *      *continue表示终止当前"本次"循环   直接进入了下一次循环继续执行
 */
public class ContiuneTest01 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5){
                /**
                 *  i-->0
                 *  i-->1
                 *  i-->2
                 *  i-->3
                 *  i-->4
                 */
                //跳过5后面程序都不执行
                break;
            }
            System.out.println("i-->"+i);
        }

        System.out.println("hello world");

        for (int i = 0; i < 10; i++) {
            if (i == 5){
                //跳过当前i=5这个循环继续执行后面的循环
                /**
                 * i-->0
                 * i-->1
                 * i-->2
                 * i-->3
                 * i-->4
                 * i-->6
                 * i-->7
                 * i-->8
                 * i-->9
                 */
                continue;
            }
            System.out.println("i-->"+i);
        }

    }
}
