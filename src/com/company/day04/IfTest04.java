package com.company.day04;

/**
 * if语句
 */
public class IfTest04 {
    public static void main(String[] args) {

        //如果只有单行代码可以省略大括号
        boolean sex = false;
        if(sex)
            System.out.println("男");
            System.out.println("呵呵");
//          else     报错
            System.out.println("女");

    }
}
